package listner;

import io.qameta.allure.Attachment;
import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import test.AbstractTestInit;

import java.io.File;
import java.io.IOException;

public class TestListener implements ITestListener {

    @SneakyThrows
    @Override
    public void onTestFailure(ITestResult result) {
        WebDriver driver = ((AbstractTestInit) result.getInstance()).getDriver();
        //тут как-то передали драйвер, непонятный код.
        screen(driver);
    }

    private void screen(WebDriver driver) throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("target/screen//" + scrFile.getName()));
    }

    @SneakyThrows
    @Override
    public void onTestSkipped(ITestResult result) {
        WebDriver driver = ((AbstractTestInit) result.getInstance()).getDriver();
        //тут как-то передали драйвер, непонятный код.
        screenAfterSkip(driver);
    }

    private void screenAfterSkip(WebDriver driver) throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("target/screen//" + scrFile.getName()));
    }
}