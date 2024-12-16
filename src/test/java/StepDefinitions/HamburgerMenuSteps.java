package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import static Utilities.GWD.getDriver;


public class HamburgerMenuSteps {
    DialogContent dc = new DialogContent();
    Actions aksiyonlar = new Actions(getDriver());
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));



    @Given("Hamburger Menu button should be clickable")
    public void hamburgerMenuButtonShouldBeClickable()
    {
       // wait.until(ExpectedConditions.visibilityOf(dc.HamburgerMenu));
        dc.myClick(dc.KhamburgerMenu);




    }

    @When("User should see messaging tab")
    public void userShouldSeeMessagingTab()
    {
        wait.until(ExpectedConditions.elementToBeClickable(dc.KmessagingTab));
        dc.myClick(dc.KmessagingTab);
    }

    @Then("User should be able to hover over the messages tab")
    public void userShouldBeAbleToHoverOverTheMessagesTab() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(dc.KmessagingTab));
        aksiyonlar.moveToElement(dc.KmessagingTab).build().perform();

        List<WebElement>MessagingElements=GWD.getDriver().findElements(By.xpath("//div[@id=\"cdk-overlay-12\"]//div[starts-with(@class, \"mat-mdc-menu-content ng-tns\")]/button"));
        for (int i = 0; i < MessagingElements.size(); i++)
        {
            wait.until(ExpectedConditions.visibilityOf(MessagingElements.get(i)));
            aksiyonlar.moveToElement(MessagingElements.get(i)).build().perform();


        }









    }
}
