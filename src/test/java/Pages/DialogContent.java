package Pages;

import Utilities.GWD;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends ParentPage {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    //US_007
    @FindBy(xpath = "(//div[@class='ng-star-inserted'])//span[@class='mat-ripple mat-mdc-button-ripple']")
    public WebElement menu;

    @FindBy(xpath = "(//span[@class='mat-mdc-button-persistent-ripple mdc-icon-button__ripple'])[1]")
    public WebElement more;

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[1]")
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

    //Us_008
    @FindBy(xpath = "(//span[@class='mat-mdc-button-persistent-ripple mdc-icon-button__ripple'])[1]")
    public WebElement moreMenu;

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[2]")
    public WebElement finance;

    @FindBy(xpath = "(//span[@class='mat-mdc-menu-item-text'])[7]")
    public WebElement MyFinance;









}
