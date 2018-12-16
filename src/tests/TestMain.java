package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.PageInMail;
import pages.PageLogin;

import java.util.concurrent.TimeUnit;

public class TestMain {
    public static PageLogin pageLogin;
    public static PageInMail getUsrInf;
    private static String GURL = "http://mail.google.com";
    private static String YTURL = "http://localhost:38083/issues";
    private static String URL = YTURL;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        pageLogin = new PageLogin(driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(URL);
    }

    @Test
    public static void testMain() {

        pageLogin.inputLogin(UserList.getUserLogin(URL));
        pageLogin.inputPassword(UserList.getUserPass(URL));
//        String userMail = getUsrInf.getUserMail();
 //       Assert.assertEquals(UserList.getUserLogin(URL) + "@gmail.com", userMail);
        pageLogin.clickLoginButton();
    }
}
