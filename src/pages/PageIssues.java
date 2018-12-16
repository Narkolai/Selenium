package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageIssues {
    public PageIssues(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;
    @FindBy(xpath = "//button[@class='yt-header__create-btn ring-button ring-button_default']")
    private WebElement createTaskBt;


    public WebElement getTextButton() {
        return createTaskBt;
    }


    public void clickCrtTaskButton() {
            createTaskBt.click();
    }

}
