package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListPageSteps extends BaseTest {

  @And("user do scroll")
  public void userDoScroll() {
    listPage.swipeList();
  }

  @When("user on list page")
  public void userOnListPage() {
    //kosong
  }


  @Then("User doing long press in the list")
  public void userDoingLongPressInTheList() {
    listPage.longPressInTheSecondMenu();
  }

  @Then("User doing tap multiple times in the list")
  public void userDoingTapMultipleTimesInTheList() {
    listPage.tapMultipleTimesInTheSecondMenu();
  }

}
