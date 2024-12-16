package StepDefinitions;

import Pages.DialogContent;
import Pages.TopNov;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_21_AssignmentsSteps {
    DialogContent dialogContentElement = new DialogContent();
    TopNov topNavElement = new TopNov();

    @When("The user hovers over the Hamburger Menu and clicks on Assignments")
    public void the_user_hovers_over_the_hamburger_menu_and_clicks_on_assignments() {
        dialogContentElement.wait.until(ExpectedConditions.visibilityOf(topNavElement.assignmentsBtn));
        topNavElement.hoverOver(topNavElement.assignmentsBtn);
        topNavElement.myClick(topNavElement.assignmentsBtn);
    }
}
