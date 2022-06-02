package listner;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    private int count = 0;

    @Override

    public boolean retry(ITestResult result) {

        int maxCount = 1;
        if (count < maxCount) {

            count++;

            return true;

        }

        return false;

    }
}
