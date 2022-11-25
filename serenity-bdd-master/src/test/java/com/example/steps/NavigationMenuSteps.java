package com.example.steps;

import com.example.BaseTest;
import io.cucumber.java.en.Then;

public class NavigationMenuSteps extends BaseTest {
  @Then("user go to list menu")
  public void userGoToListMenu() {
    navigationMenu.clickHamburgerBtn();
    navigationMenu.clickListMenu();
  }
}
