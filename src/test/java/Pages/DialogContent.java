package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends ParentPage{
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

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

}
