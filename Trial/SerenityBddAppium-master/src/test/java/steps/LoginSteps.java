package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();
    
    @Given("User is on login page")
    public void userIsOnLoginPage() {
        Assert.assertTrue(loginPage.isButtonRegisterDisplayed());
    }

    @When("User input username")
    public void userInputUsername() {
        loginPage.inputUsername();
    }

    @And("User input password")
    public void userInputPassword() {
        loginPage.inputPassword();
    }

    @And("User click button sign in")
    public void userClickButtonSignIn() {
        loginPage.andClickButtonRegister();
    }

    @Then("User successfully log in")
    public void userSuccessfullyLogIn() {
    }

    @When("User input username {string}")
    public void userInputUsername(String username) {
        loginPage.inputUsername(username);
    }

    @And("User input password {string}")
    public void userInputPassword(String password) {
        loginPage.inputPassword(password);
    }

    @When("User login with valid user data")
    public void userLoginWithValidUserData() {
        loginPage.inputUsername()
                .inputPassword()
                .andClickButtonRegister();
    }
}
