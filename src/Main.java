
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class Main {
    //ToDO Реализоавть через XPath

    public static LoginPage loginPage;

    @BeforeClass
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver  driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(UserList.getUsrInf()[0]);
    }

    @Test
    public void main(){
        loginPage.inputLogin(UserList.getUsrInf()[1]);
        loginPage.inputPassword(UserList.getUsrInf()[2]);
        loginPage.clickLoginButton();

    }


/*
      public static void main(String[] args) {
        launch(args);

      //  loginPage()

      System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        String myLink, username, password;
        myLink = UserList.getUsrInf()[0];
        username = UserList.getUsrInf()[1];
        password = UserList.getUsrInf()[2];

        WebDriver  driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 4000);
        driver.get (myLink);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//button[@class='ring-button ring-button_blue auth-button auth-button_wide' and @data-test='login-button']"))));
        driver.findElement(By.xpath("//input[@id='username' and @name='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password' and @name='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@class='ring-button ring-button_blue auth-button auth-button_wide' and @data-test='login-button']")).click();

    }*/

}
