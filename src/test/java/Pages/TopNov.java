package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

public class TopNov extends ParentPage{

    public TopNov() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[2]")
    public WebElement financeButton;

    @FindBy(xpath = "//span[text()='My Finance']")
    public WebElement myFinanceButton;

    @FindBy(xpath = "//span[@class='ng-star-inserted']/button")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "(//span[@class='mdc-button__label'])[6]")
    public WebElement hamburgerMenuBtn;

    @FindBy(xpath = "//span[text()='My Finance']")
    public WebElement myFinance;

    @FindBy(xpath = "(//span[text()=' Student_9 11A'])[1]")
    public WebElement studentBtn;

    @FindBy(xpath = "//user-message-bell/button")
    public WebElement  newMessageIcon;
}
