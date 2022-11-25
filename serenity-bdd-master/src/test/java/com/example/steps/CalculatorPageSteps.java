package com.example.steps;

import com.example.BaseTest;
import com.example.app.Calculator;
import com.example.app.pages.CalculatorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;

public class CalculatorPageSteps extends BaseTest{

    @Given("user is on calculator page")
    public void userIsOnCalculatorPage() {
        //kosong
    }

    @When("user input first number {int}")
    public void userInputFirstNumberAngka(int angka) {
        calculatorPage.TextArea1(String.valueOf(angka));
    }

    @And("user input second number {int}")
    public void userInputSecondNumberAngka(int angka) {
        calculatorPage.TextArea2(String.valueOf(angka));
    }

    @Then("user click button result")
    public void userClickButtonResult() {
        calculatorPage.clickResultBtn();
    }

    @And("result should be {string}")
    public void resultShouldBeResult(String Result) {
        String result = calculatorPage.ResultString();
        Assertions.assertEquals(Result, result);
    }

    @Then("user click dropdown")
    public void userClickDropdown() {
        calculatorPage.clickOptionBtn();
    }

    @And("user select option minus button")
    public void userSelectOption() {
        calculatorPage.clickOptionMinus();
    }

    @And("user select option divided button")
    public void userSelectOptionDividedButton() {
        calculatorPage.clickOptionDivide();
    }

    @And("user select option multiple button")
    public void userSelectOptionMultipleButton() {
        calculatorPage.clickOptionMulti();
    }
}
