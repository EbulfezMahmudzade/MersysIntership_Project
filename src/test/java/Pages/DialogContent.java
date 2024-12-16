package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import static Utilities.GWD.getDriver;


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

    @FindBy(xpath = "//div[@class='ng-star-inserted']")
    public WebElement headText;

    @FindBy(xpath = "//button[contains(@class, 'mat-mdc-menu-trigger')]")
    public WebElement HamburgerMenu;

    @FindBy(xpath = "//button[contains(@class, 'mat-mdc-tooltip-trigger')]")
    public WebElement MsgItem;

    @FindBy(xpath = "//button[.//span[text()='Messaging']]")
    public WebElement MessagingTab;


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


        }




