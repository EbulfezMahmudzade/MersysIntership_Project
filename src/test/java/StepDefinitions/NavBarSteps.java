package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class NavBarSteps {
    DialogContent dc = new DialogContent();



    @Given("Navigate to Campus")
    public void navigateToCampus() {
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username and password and click login button")
    public void enterUsernameAndPasswordAndClickLoginButton() {
        dc.mySendKeys(dc.Kusername, "Student_9");
        dc.mySendKeys(dc.Kpassword, "S12345");
        dc.myClick(dc.KloginButton);
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.LoginContainsText(dc.KheadText, "Internship");
    }

    @When("user clicks all navbar items and goes back")
    public void userClicksAllNavbarItemsAndGoesBack() {
        dc.NavBar();

    }



    @Given("user clicks all HamburgerMenu items and goes back")
    public void userClicksAllHamburgerMenuItemsAndGoesBack() {
        dc.myClick(dc.KhamburgerMenu);
        dc.myClick(dc.KmsgItem);
        GWD.getDriver().navigate().back();

    }
}

