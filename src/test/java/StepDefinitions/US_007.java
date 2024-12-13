package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class US_007 {
    DialogContent dc = new DialogContent();

    @Given("Click on the messaging trash box from the hamburger menu")
    public void click() {
        dc.myClick(dc.menu);
        dc.myClick(dc.more);
        dc.myClick(dc.trash);

    }

    @When("You should see a delete and undo icon")
    public void icon() {
        dc.myClick(dc.çopKutusu);
        dc.myClick(dc.restore);

    }

    @Then("Messages deleted successfully")
    public void messagesDeletedSuccessfully() {
        dc.LoginContainsText(dc.successMesajı,"Mesaj Görüldü");

    }

}





