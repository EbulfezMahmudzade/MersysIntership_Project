package StepDefinitions;

import Pages.DialogContent;
import Pages.TopNov;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.io.File;

public class US_12_ReportSteps {
    DialogContent dialogContentElement=new DialogContent();
    TopNov topNavElement=new TopNov();
    String downloadDir = System.getProperty("user.home") + "/Downloads";

    @Given("The user clicks on the hamburger menu")
    public void theUserClicksOnTheHamburgerMenu() {
        topNavElement.myClick(topNavElement.hamburgerMenu);
    }

    @When("The user navigates to Finance and then to My Finance")
    public void theUserNavigatesToFinanceAndThenToMyFinance() {
        topNavElement.hoverOver(topNavElement.financeButton);
        topNavElement.myClick(topNavElement.myFinanceButton);
    }

    @Then("The user should access the finance page")
    public void theUserShouldAccessTheFinancePage() {
        dialogContentElement.wait.until(ExpectedConditions.urlToBe("https://test.mersys.io/student-finance/active"));
        Assert.assertTrue(GWD.getDriver().getCurrentUrl().equals("https://test.mersys.io/student-finance/active"));
    }

    @When("The user clicks on the Overflow menu for report types")
    public void theUserClicksOnTheThreeDotDropdownMenuForReportTypes() {
        dialogContentElement.myClick(dialogContentElement.overFlowMenuBtn);
    }

    @And("The user selects a report format")
    public void theUserSelectsAReportFormat() {
        dialogContentElement.myClick(dialogContentElement.excelBtn);
    }

    @Then("The user should be successfully downloaded to the local drive")
    public void theUserShouldBeSuccessfullyDownloadedToTheLocalDrive() {
        dialogContentElement.Wait(5); // Time to wait until the file is downloaded

        File downloadFolder = new File(downloadDir);
        File[] files = downloadFolder.listFiles((dir, name) -> name.endsWith(".xlsx"));
        Assert.assertNotNull(files);
        Assert.assertTrue(files.length > 0);
    }
}
