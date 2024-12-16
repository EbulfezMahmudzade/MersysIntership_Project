package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import Utilities.Tools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class US05 {
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    Actions aksiyonlar = new Actions(GWD.getDriver());

    @And("Navigate to hamburger menu")
    public void navigateToHamburgerMenu() {
        ln.myClick(ln.hamburgerMenu);
    }

    @When("Navigate to message")
    public void navigateToMessage() {

        Action action = aksiyonlar.moveToElement(ln.messaging).build();
        action.perform();
    }

    @And("Send Message")
    public void sendMessage() {
        ln.myClick(ln.sendMessage);
    }

    @When("Click to Users Icon")
    public void clickToUsersIcon() {
        dc.myClick(dc.userIcon);
    }

    @When("Write {string} in input")
    public void writeInInput(String string) {
        dc.mySendKeys(dc.userInput, string);
        GWD.Bekle(2);


        for (int i = 1; i < 7; i++) {
            WebElement element = GWD.getDriver().findElement(By.xpath("//*[@id='ms-table-0']/div/table/tbody/tr[" + i + "]/td[3]"));
            Assert.assertTrue(element.getText().toLowerCase().contains(string));

        }
    }

    @And("Click to user recipient name")
    public void clickToUserRecipientName() {
        dc.myClick(dc.select);
        dc.myClick(dc.addButton);
    }

    @And("Click to user recipient name addAndClose")
    public void clickToUserRecipientNameAddAndClose() {
        dc.myClick(dc.select);
        dc.myClick(dc.addAndCloseButton);
    }

    @When("send also via selected")
    public void sendAlsoViaSelected() {
        dc.myClick(dc.sendAlsoVia);
        dc.myClick(dc.email);
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    @And("enter subject")
    public void enterSubject() {
        dc.mySendKeys(dc.subject, "Java ");
        GWD.getDriver().switchTo().frame(0);
        dc.mySendKeys(dc.enterSubject, " Intellij ile ilgili bir sıkıntı yaşıyorum.");
        GWD.getDriver().switchTo().parentFrame();
        dc.myClick(dc.send);
    }

    @When("Navigate to outbox")
    public void navigateToOutbox() {
        ln.myClick(ln.outbox);
    }

    @Then("Is displayed Move to Trash")
    public void isDisplayed() {
        for (WebElement e : dc.trashBoxes)
            Assert.assertTrue(e.isDisplayed());
    }

    @And("Click to Move to trash")
    public void clickToMoveToTrash() {
        dc.myClick(dc.trashBox);
    }

    @Then("Is displayed confirm")
    public void ısDisplayedConfirm() {
        Assert.assertTrue(dc.confirm.isDisplayed());
    }

    @And("Click to Yes")
    public void clickToYes() {
        dc.myClick(dc.btnYes);
    }

    @Then("Is displayed successfully")
    public void isDisplayedSuccessfully() {

        dc.verifyMessageContainsTextINCELEME(dc.messageBox, "successfully ");
    }
}
