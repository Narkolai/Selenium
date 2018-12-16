package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageLogin {
    public PageLogin(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;

    @FindBy(id = "username")
    private WebElement loginField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@data-test='login-button']")
    private WebElement loginButton;

    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
