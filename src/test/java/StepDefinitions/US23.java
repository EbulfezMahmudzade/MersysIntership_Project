package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import Utilities.Tools;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class US23 {
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();
    LocalDate tarih = LocalDate.now();
    Actions aksiyonlar = new Actions(GWD.getDriver());
    JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();

    @Given("navigate to calender")
    public void navigateToCalender() {

        ln.myClick(ln.calendar);
        wait.until(ExpectedConditions.visibilityOf(dc.c));
    }

    @When("click to ended lesson")
    public void clickToEndedLesson() {
        for (int i = 1; i < dc.calendarList.size(); i++) {
            System.out.println(dc.calendarList.get(i) + " " + i);
            if (!dc.calendarList.get(i).getText().contains(dc.endedLesson.getFirst().getText())) {
                for (int j = 1; j < dc.endedLesson.size(); j++) {
                    {
                        {
                            System.out.println(dc.endedLesson.get(i).getText());
                            GWD.Bekle(2);
                            js.executeScript("arguments[0].click();",dc.calendarList.get(i));
                            dc.myClick(dc.recordingBtn);
                            GWD.Bekle(2);
                            aksiyonlar.moveToElement(dc.playButton).click(dc.playButton).build().perform();
//                            js.executeScript("arguments[0].click();",dc.playButton);
                            GWD.Bekle(10);
                        }
                    }
                }

            }


        }
    }

    @When("visible date and course")
    public void visibleDateAndCourse() {
        Assert.assertTrue(dc.date.isDisplayed());
    }

    @And("displayed icons")
    public void displayedIcons() {
        Assert.assertTrue(dc.c.isDisplayed());
        Assert.assertTrue(dc.p.isDisplayed());
        Assert.assertTrue(dc.e.isDisplayed());
        Assert.assertTrue(dc.s.isDisplayed());

    }

    @Then("What do the icons mean")
    public void whatDoTheIconsMean() {

        Assert.assertTrue(dc.cancelled.getText().toLowerCase().contains(dc.c.getText().toLowerCase()));
        Assert.assertTrue(dc.ended.getText().toLowerCase().contains(dc.e.getText().toLowerCase()));
        Assert.assertTrue(dc.started.getText().toLowerCase().contains(dc.s.getText().toLowerCase()));
        Assert.assertTrue(dc.published.getText().toLowerCase().contains(dc.p.getText().toLowerCase()));
    }

    @And("is displayed and clickable weekly and calendar")
    public void isDisplayedAndClickableWeeklyAndCalendar() {
        Assert.assertTrue(dc.calenderLink.isDisplayed());
        Assert.assertTrue(dc.calenderLink.isEnabled());
        Assert.assertTrue(dc.coursePlan.isDisplayed());
        Assert.assertTrue(dc.coursePlan.isEnabled());
    }

    @And("is displayed and clickable Previous, Today, Next")
    public void isDisplayedAndClickablePreviousTodayNext() {
        Assert.assertTrue(dc.previous.isDisplayed());
        Assert.assertTrue(dc.today.isDisplayed());
        Assert.assertTrue(dc.next.isDisplayed());
        Assert.assertTrue(dc.previous.isEnabled());
        Assert.assertTrue(dc.today.isEnabled());
        Assert.assertTrue(dc.next.isEnabled());
    }

    @Then("is displayed and clickable lessons")
    public void isDisplayedAndClickableLessons() {

        for (int i = 1; i < dc.calendarList.size(); i++) {

           Assert.assertTrue(dc.calendarList.get(i).isDisplayed());

        }
    }
}
