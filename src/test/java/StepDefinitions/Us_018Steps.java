package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Us_018Steps {
    DialogContent dc=new DialogContent();
    Actions aksiyonlar= new Actions(GWD.getDriver());


    @Given("Click on assingnments from the hamburger menu")
    public void clickOnAssingnmentsFromTheHamburgerMenu() {
        Assert.assertTrue(dc.assıgnments.isDisplayed());
        dc.myClick(dc.assıgnments);
    }

    @When("Student should see the total number of assignments")
    public void studentShouldSeeTheTotalNumberOfAssignments() {
        Action action= aksiyonlar.click(dc.gorevsayısı).build();
        action.perform();


    }

    @Then("Student must see all tasks")
    public void studentMustSeeAllTasks() {
        dc.myClick(dc.assıgnments);
        Action action= aksiyonlar.click(dc.assıgnments).build();
        action.perform();

    }
}
