package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

import static Utilities.GWD.getDriver;
import static org.openqa.selenium.devtools.v127.page.Page.navigate;

public class DialogContent extends ParentPage {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    Actions aksiyonlar = new Actions(getDriver());

    @FindBy(css = "[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='ng-star-inserted']")
    public WebElement headText;

    // @FindBy(xpath="//div[@class='ng-star-inserted']/img")
    // public WebElement TechnoStudyLogo;

    @FindBy(xpath = "//button[contains(@class, 'mat-mdc-menu-trigger')]")
    public WebElement HamburgerMenu;

    @FindBy(xpath = "//button[contains(@class, 'mat-mdc-tooltip-trigger')]")
    public WebElement MsgItem;

    @FindBy(xpath = "//button[.//span[text()='Messaging']]")
    public WebElement MessagingTab;

    @FindBy(xpath = "//button[.//span[text()='Messaging']]//following-sibling::div[contains(@class, 'mat-menu-panel')]//button")
    public List<WebElement> MessageSubSection;


    @FindBy(xpath = "//button[@class='mat-mdc-menu-item mat-focus-indicator ng-tns-c3371495337-36 ng-star-inserted']")
    public WebElement SendMsg;

    @FindBy(xpath = "//span[text()='Inbox']")
    public WebElement Inbox;

    @FindBy(xpath = "//span[text()='Outbox'")
    public WebElement Outbox;

    @FindBy(xpath = "//span[text()='Trash'")
    public WebElement Trash;



    public void tabControl(WebElement control) {
        Assert.assertTrue(control.isDisplayed());
    }



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

  //  public void HoverOver() {
    //    for (WebElement section : MessageSubSection) {
      //      aksiyonlar.moveToElement(section).build().perform();
        //    wait.until(ExpectedConditions.visibilityOf(section));
          //  for (WebElement Ssection : MessageSubSection) {
            //    aksiyonlar.moveToElement(section).click().perform();
              //  System.out.println("Tıklama yapıldı: " + section.getText());
                //GWD.getDriver().navigate().back();
          //  }
        }




