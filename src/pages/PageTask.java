package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageTask {
    public PageTask(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;


    @FindBy(xpath = "//textarea[@class='jt-input ring-input edit-issue-form__i__summary' and @name='l.I.ni.ei_83_4290.eit.summary']")
    private WebElement taskSummary;

    @FindBy(xpath = "//textarea[@class='jt-input ring-input edit-issue-form__i__description username-suggest' and @name='id_l.I.ni.ei_83_4286.eit.description']")
    private WebElement taskDdesc;



    public void inputTaskSummary(String s) {
        //taskSummary.click();
        taskSummary.clear();
        taskSummary.sendKeys(s);
    }
    public void inputTaskDdesc(String s) {

     //   taskDdesc.click();
        taskDdesc.clear();
        taskDdesc.sendKeys(s);
    }
}
