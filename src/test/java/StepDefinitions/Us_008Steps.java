package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Us_008Steps {
    DialogContent dc = new DialogContent();

    @Given("Going to more from the hamburger menu")
    public void goingToMoreFromTheHamburgerMenu() {
        dc.myClick(dc.more);

    }

    @When("Click on the finance section from the menu")
    public void clickOnTheFinanceSectionFromTheMenu() {
        dc.myClick(dc.finance);
        dc.myClick(dc.MyFinance);
    }

    @Then("Access the finance page")
    public void accessTheFinancePage() {

    }
}
