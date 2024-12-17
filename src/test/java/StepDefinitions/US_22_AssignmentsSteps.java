package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class US_22_AssignmentsSteps {
    DialogContent dialogContentElement = new DialogContent();
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(8));
    JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();

    @Then("from the drop-down sort menu select and verify show by course, type, date and chart")
    public void fromTheDropDownSortMenuSelectAndVerifyShowByCourseTypeDateAndChart() {

        dialogContentElement.defaultView.click();
        wait.until(ExpectedConditions.visibilityOf(dialogContentElement.showbyCourse));
        dialogContentElement.showbyCourse.click();
        wait.until(ExpectedConditions.visibilityOf(dialogContentElement.math));
        Assert.assertEquals(dialogContentElement.math.getText(),"11A-Mathematics");

        dialogContentElement.showbyCourse.click();
        wait.until(ExpectedConditions.visibilityOf(dialogContentElement.showbyType));
        dialogContentElement.showbyType.click();
        wait.until(ExpectedConditions.visibilityOf(dialogContentElement.homework));
        Assert.assertEquals(dialogContentElement.homework.getText(),"Homework");

        dialogContentElement.showbyType.click();
        wait.until(ExpectedConditions.visibilityOf(dialogContentElement.showbyDate));
        js.executeScript("arguments[0].click();", dialogContentElement.showbyDate);

        dialogContentElement.showbyDate.click();
        wait.until(ExpectedConditions.visibilityOf(dialogContentElement.showbyChart));
        js.executeScript("arguments[0].click();", dialogContentElement.showbyChart);
    }
}
