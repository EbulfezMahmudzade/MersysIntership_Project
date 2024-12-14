package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends ParentPage {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css = "[icon='users-medical']")
    public WebElement userIcon;

    @FindBy(xpath = "//input[@placeholder='Name, Username or E-mail']")
    public WebElement userInput;

    @FindBy(xpath = "(//tbody/tr/td)[6]")
    public WebElement select;

    @FindBy(xpath = "//span[text()='Add']")
    public WebElement addButton;

    @FindBy(xpath = "//span[text()='Add & Close']")
    public WebElement addAndCloseButton;

    @FindBy(xpath = "//div[@id='mat-select-value-0']")
    public WebElement sendAlsoVia;

    @FindBy(xpath = "//span[text()=' E-MAIL']")
    public WebElement email;

    @FindBy(xpath = "(//input[@type='text'])[1]")
    public WebElement subject;

    @FindBy(xpath = "//*[@id='tinymce']")
    public WebElement enterSubject;

    @FindBy(xpath = "//div/img")
    public WebElement logo;

    @FindBy(xpath = "//span[text()='Send']")
    public WebElement send;

    @FindBy(xpath = "//*[@icon='shopping-basket']")
    public List<WebElement> trashBoxes;

    @FindBy(xpath = "(//*[@icon='shopping-basket'])[1]")
    public WebElement trashBox;

    @FindBy(xpath = "//strong[text()='Confirm']")
    public WebElement confirm;

    @FindBy(xpath = "//span[text()=' Yes ']")
    public WebElement btnYes;

    @FindBy(xpath="//div[text()='Invalid username or password']")
    public WebElement headText;

    @FindBy(tagName="mat-panel-description")
    public WebElement messageBox;

    @FindBy(xpath = "(//span[text()=' Published '])[1]")
    public WebElement published;

    @FindBy(xpath = "(//span[text()=' Started '])[1]")
    public WebElement started;

    @FindBy(xpath = "(//span[text()=' Ended '])[1]")
    public WebElement ended;

    @FindBy(xpath = "(//span[text()=' Cancelled '])[1]")
    public WebElement cancelled;

    @FindBy(xpath = "//span[text()=' C ']")
    public WebElement c;

    @FindBy(xpath = "//span[text()=' P ']")
    public WebElement p;

    @FindBy(xpath = "//span[text()=' E ']")
    public WebElement e;

    @FindBy(xpath = "//span[text()=' S ']")
    public WebElement s;

    @FindBy(xpath = "//tr/td/div/div/fa-icon")
    public List<WebElement> calendarList;

    @FindBy(xpath = "//span[text()='E']")
    public List<WebElement> endedLesson;

    @FindBy(xpath = "//span[text()='Recording']")
    public WebElement recordingBtn;

    @FindBy(xpath = "//span[text()='Play Video']/..")
    public WebElement playButton;

    @FindBy(xpath = "//strong[text()='9 December : Monday - 13 December : Friday ']")
    public WebElement date;

    @FindBy(xpath = "(//button/fa-icon)[2]")
    public WebElement previous;

    @FindBy(xpath = "(//button/fa-icon)[4]")
    public WebElement next;

    @FindBy(xpath = "(//button/fa-icon)[3]")
    public WebElement today;

    @FindBy(xpath = "//*[text()=' Weekly Course Plan ']")
    public WebElement coursePlan;

    @FindBy(xpath = "//*[text()=' Calendar ']")
    public WebElement calenderLink;

}
