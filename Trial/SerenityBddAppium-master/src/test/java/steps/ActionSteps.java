package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SidebarPage;

public class ActionSteps {

    SidebarPage sidebarPage = new SidebarPage();

    @Given("User is already log in")
    public void userAlreadyLogIn() {
        Assert.assertTrue(sidebarPage.isHamburgerMenuDisplayed());
    }

    @When("User go to second menu")
    public void userGoToSecondMenu() {
        sidebarPage.clickHamburgerMenu()
                .clickSecondMenu();
    }

    @Then("User doing swipe in the screen")
    public void userDoingSwipeInTheScreen() {
        sidebarPage.swipeInSecondMenu();
    }

    @Then("User doing long press in the list")
    public void userDoingLongPressInTheList() {
        sidebarPage.longPressInTheSecondMenu();
    }

    @Then("User doing tap multiple times in the list")
    public void userDoingTapMultipleTimesInTheList() {
        sidebarPage.tapMultipleTimesInTheSecondMenu();
    }

    @Then("User doing scroll to text in the list")
    public void userDoingScrollToTextInTheList() {
        sidebarPage.scrollToTextInTheSecondMenu();
    }
}
