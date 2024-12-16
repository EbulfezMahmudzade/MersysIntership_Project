package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class DialogContent extends ParentPage {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    // Yuksel

    @FindBy(css = "input[formcontrolname='username']")
    public WebElement usernameInput;

    @FindBy(css = "input[formcontrolname='password']")
    public WebElement passwordInput;

    @FindBy(css = "button[aria-label='LOGIN']")
    public WebElement loginBtn;

    @FindBy(xpath = "//span[text()=' Welcome, Student_9 11A ! ']")
    public WebElement loginControl;

    @FindBy(xpath = "//tfoot[@role='rowgroup']//button[@aria-haspopup='menu']")
    public WebElement overFlowMenuBtn;

    @FindBy(xpath = "(//div[@class='cdk-overlay-pane']//button)[1]")
    public WebElement excelBtn;

    @FindBy(xpath = "//div[@class='mdc-radio']")
    public WebElement stripeBtn;

    @FindBy(xpath = "(//div[@class='mdc-radio__background'])[2]")
    public WebElement payCtrl;

    @FindBy(xpath = "//*[@class='svg-inline--fa fa-wallet fa-fw']")
    public WebElement payButton;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement amountBtn;

    @FindBy(xpath = "(//span[contains(text(), 'Pay')])[2]")
    public WebElement payBtn;

    @FindBy(css = "[title='Secure payment input frame']")
    public WebElement iframe;

    @FindBy(xpath = "//div[@class='p-CardNumberInput']")
    public WebElement cardNumber;

    @FindBy(xpath = "(//div[@class='p-Input'])[2]")
    public WebElement expirationDate;

    @FindBy(xpath = "//div[contains(text(), 'Message successfully')]")
    public WebElement msgControl;

    @FindBy(xpath = "//div[text()='Payment is completed']")
    public WebElement paymentMsgControl;

    // US_007

    @FindBy(xpath = "(//button[@aria-haspopup='menu'])[1]//fa-icon")
    public WebElement more;

    @FindBy(xpath = "//span[text()='Messaging']")
    public WebElement messaging;

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[10]")
    public WebElement trash;

    @FindBy(xpath = "//span[@style='color: red;']")
    public WebElement çopKutusu;

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[3]")
    public WebElement restore;

    @FindBy(xpath = "//div[@style='font-size: 15px;']")
    public WebElement confirmMesajı;

    @FindBy(xpath = "//span[@class='mat-content mat-content-hide-toggle']")
    public WebElement successMesajı;

    // US_008

    @FindBy(xpath = "(//span[@class='mat-mdc-button-persistent-ripple mdc-icon-button__ripple'])[1]")
    public WebElement moreMenu;

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[2]")
    public WebElement finance;

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[7]")
    public WebElement MyFinance;

    // US_017

    @FindBy(xpath = "(//button[@style='margin-bottom: 4px;'])[5]")
    public WebElement Grading;

    @FindBy(xpath = "//button[@style='F']")
    public WebElement Print;

    @FindBy(xpath = "//embed[@type='application/x-google-chrome-pdf'] ")
    public WebElement pdfbelge;

    @FindBy(xpath = "(//div[@id='end'])[3]")
    public WebElement indir;

    @FindBy(css = "[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='ng-star-inserted']")
    public WebElement headText;

    @FindBy(xpath = "//button[contains(@class, 'mat-mdc-menu-trigger')]")
    public WebElement HamburgerMenu;

    @FindBy(xpath = "//button[contains(@class, 'mat-mdc-tooltip-trigger')]")
    public WebElement MsgItem;

    @FindBy(xpath = "//button[.//span[text()='Messaging']]")
    public WebElement MessagingTab;

    //Us_018

    @FindBy(xpath = "(//span[@class='mat-mdc-button-persistent-ripple mdc-button__ripple'])[5]")
    public WebElement assignments;

    @FindBy(xpath = " //div[@class='w-50-p']")
    public WebElement gorevsayisi;

    // Kadriye

    @FindBy(css = "[formcontrolname='username']")
    public WebElement Kusername;

    @FindBy(css = "[formcontrolname='password']")
    public WebElement Kpassword;

    @FindBy(css = "[aria-label='LOGIN']")
    public WebElement KloginButton;

    @FindBy(xpath = "//div[@class='ng-star-inserted']")
    public WebElement KheadText;

    @FindBy(xpath = "//button[contains(@class, 'mat-mdc-menu-trigger')]")
    public WebElement KhamburgerMenu;

    @FindBy(xpath = "//button[contains(@class, 'mat-mdc-tooltip-trigger')]")
    public WebElement KmsgItem;

    @FindBy(xpath = "//button[.//span[text()='Messaging']]")
    public WebElement KmessagingTab;

    @FindBy(xpath = "//ms-layout-menu-button[@caption='NAV.GRADING.TITLE']")
    public WebElement Kgrading;

    @FindBy(xpath = "//div[@id='mat-tab-group-0-label-1']")
    public WebElement KstudentTranscripts;

    @FindBy(xpath = "//div[@id='mat-tab-group-0-label-2']")
    public WebElement KtranscriptBySubject;

    @FindBy(xpath = "//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base']")
    public WebElement KmainPage; //navigate back

    @FindBy(xpath = "//button[@class='mat-mdc-menu-trigger user-button mdc-button mat-mdc-button mat-unthemed mat-mdc-button-base ng-star-inserted']")
    public WebElement Kprofile;

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[4]")
    public WebElement KsettingButton;

    @FindBy(id = "mat-select-3-panel")
    public WebElement KdefaultTheme;

    @FindBy(xpath = "//mat-option[@value='purple-theme']")
    public WebElement KpurpleTheme;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']")
    public WebElement KsaveButton;

    @FindBy(xpath = "//div[text()='Profile successfully upddated']")
    public WebElement KsuccessMessage;

    //IBRAHIM

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

    public void NavBar() {
        List<WebElement> navBarItems = GWD.getDriver().findElements(By.xpath("//nav//a"));

        for (int i = 0; i < navBarItems.size(); i++) {

            List<WebElement> currentNavBarItems = GWD.getDriver().findElements(By.xpath("//nav//a"));


            WebElement item = currentNavBarItems.get(i);
            System.out.println("Tıklanıyor: " + item.getText());
            item.click();
            GWD.getDriver().navigate().back();


        }
    }

    public void SuccessMsg()
    {
        WebElement successMessage = wait.until(ExpectedConditions.visibilityOf(KsuccessMessage));
        String actualMessage = successMessage.getText();
        Assert.assertEquals("Profile successfully upddated!", actualMessage);
    }

}
