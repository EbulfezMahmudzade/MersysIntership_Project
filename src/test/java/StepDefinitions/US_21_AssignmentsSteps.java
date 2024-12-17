package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class US_21_AssignmentsSteps {
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(10));
    JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
    Actions actions =new Actions(GWD.getDriver());
    DialogContent dialogContentElement = new DialogContent();
    Robot robot;

    {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }

    @When("Navigate to the assignment select filter and search")
    public void navigateToTheAssignmentSelectFilterAndSearch() throws InterruptedException {

        dialogContentElement.myClick(dialogContentElement.assignment);

        wait.until(ExpectedConditions.visibilityOf(dialogContentElement.course));
        js.executeScript("arguments[0].scrollIntoView({block: 'center'});", dialogContentElement.course);
        wait.until(ExpectedConditions.elementToBeClickable(dialogContentElement.course));
        dialogContentElement.course.click();

        actions.moveToLocation(750,420).click().build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(dialogContentElement.status));
        dialogContentElement.status.click();
        wait.until(ExpectedConditions.visibilityOf(dialogContentElement.checkBox));
        dialogContentElement.checkBox.click();

        actions.moveToLocation(750,420).click().build().perform();
        dialogContentElement.semester.click();
        wait.until(ExpectedConditions.visibilityOf(dialogContentElement.all));
        dialogContentElement.all.click();
    }

    @And("Checking the transactions on the homework page")
    public void checkingTheTransactionsOnTheHomeworkPage() throws InterruptedException {

        for (int i = 0; i < dialogContentElement.fileImportIcon.size() ; i++) {
            Assert.assertTrue(dialogContentElement.fileImportIcon.get(i).isDisplayed());
        }

        wait.until(ExpectedConditions.elementToBeClickable(dialogContentElement.fileImportIcon.get(3)));
        dialogContentElement.fileImportIcon.get(3).click();
        wait.until(ExpectedConditions.visibilityOf(dialogContentElement.notePad));
        actions.moveToElement(dialogContentElement.notePad).click().build().perform();
        actions.sendKeys("Example text sent").build().perform();

        //Copy
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        robot.keyPress(KeyEvent.VK_RIGHT);
        robot.keyRelease(KeyEvent.VK_RIGHT);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        //Paste
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        dialogContentElement.attachButton.click();
        dialogContentElement.fromLocal.click();
        Thread.sleep(2000);
        StringSelection folderWay = new StringSelection("C:\\Users\\GÜNAY\\Documents\\@Test.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(folderWay, null);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        for (int i = 1; i <= 2; i++) {
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        actions.moveToLocation(750,420).click().build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(dialogContentElement.saveAsDraft));
        dialogContentElement.saveAsDraft.click();

        wait.until(ExpectedConditions.visibilityOf(dialogContentElement.successMessage));
        Assert.assertTrue(dialogContentElement.successMessage.getText().toLowerCase().contains("successfully".toLowerCase()));

        dialogContentElement.submitBtn.click();
        dialogContentElement.yesBtn.click();
        wait.until(ExpectedConditions.visibilityOf(dialogContentElement.successSendMessagge));
        Assert.assertTrue(dialogContentElement.successSendMessagge.getText().toLowerCase().contains("successfully submitted"));

        dialogContentElement.rndmIconPlace.get((int) (Math.random()* dialogContentElement.rndmIconPlace.size())).click();
        wait.until(ExpectedConditions.visibilityOf(dialogContentElement.newSubmission));
        Assert.assertTrue(dialogContentElement.newSubmission.isDisplayed(),"New Submission butonu görünmüyor");
        dialogContentElement.newSubmission.click();
        wait.until(ExpectedConditions.visibilityOf(dialogContentElement.notePad));
        Assert.assertTrue(dialogContentElement.notePad.isDisplayed(),"Metin editörü açılmadı");
    }
}
