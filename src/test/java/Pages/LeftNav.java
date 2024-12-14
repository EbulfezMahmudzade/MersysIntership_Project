package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LeftNav extends ParentPage {
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//button[@aria-haspopup='menu'])[1]//fa-icon")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//span[text()='Messaging']")
    public WebElement messaging;

    @FindBy(xpath = "//span[text()='Send Message']")
    public WebElement sendMessage;

    @FindBy(xpath = "//span[text()='Outbox']")
    public WebElement outbox;

    @FindBy(xpath = "//*[text()='Message successfully moved to trash!']")
    public WebElement successfully;

    @FindBy(xpath = "(//span[text()='Calendar'])[1]")
    public WebElement calendar;
}
