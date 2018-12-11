
import com.sun.deploy.net.protocol.chrome.ChromeURLConnection;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Main {
    //ToDO Реализоавть через XPath

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

        String myLink, username, password;
        myLink = "http://localhost:38083/issues";
        username = "";
        password = "";

        WebDriver  driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 4000);
        driver.get (myLink);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//button[@class='ring-button ring-button_blue auth-button auth-button_wide' and @data-test='login-button']"))));
        driver.findElement(By.xpath("//input[@id='username' and @name='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password' and @name='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@class='ring-button ring-button_blue auth-button auth-button_wide' and @data-test='login-button']")).click();

    }

}
