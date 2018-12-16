package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.PageInMail;
import pages.PageIssues;
import pages.PageLogin;
import pages.PageTask;

import java.util.concurrent.TimeUnit;

public class TestMain {
    static PageLogin pageLogin;
    static PageIssues pageIssues;
    static PageTask pageTask;
    static WebDriver driver;
    private static String URL = "http://localhost:38083/issues";

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        pageLogin = new PageLogin(driver);
        pageIssues = new PageIssues(driver);
        pageTask = new PageTask(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(URL);
    }

    @Test
    public static void testMain() {
        pageLogin.inputLogin(UserList.getUserLogin(URL));
        pageLogin.inputPassword(UserList.getUserPass(URL));
        pageLogin.clickLoginButton();

        pageIssues.clickCrtTaskButton();

        pageTask.inputTaskSummary("Selenium");
        pageTask.inputTaskDdesc("Hello PageFactory");




    }
    private static void waitUntil(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(element));

        //  waitUntil(driver, pageIssues.getTextButton());
    }

}
