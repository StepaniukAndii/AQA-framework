package test.gitHubCookieTest;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;
import test.AbstractTestInit;

import java.util.Set;

public class GitHubCookieTest extends AbstractTestInit {

    @Test
    public void checkGitCookie(){
        openUrl("https://github.com/sauronx2");
        Cookie getCookie = new Cookie("user_session", "i4Nu17kktgCznrLV_4uLAEntQJGd7rTCYrg9Z7EBDGVHtLwK");
        driver.manage().addCookie(getCookie);
        driver.navigate().refresh();
//        Set<Cookie> cookies = driver.manage().getCookies();
//        System.out.println("cookies =====> " + cookies);
    }
}
