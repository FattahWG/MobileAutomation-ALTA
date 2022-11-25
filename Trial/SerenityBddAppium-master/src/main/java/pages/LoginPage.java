package pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    By elementInputUsername = MobileBy.id("com.isl.simpleapp:id/username");
    By elementInputPassword = MobileBy.id("com.isl.simpleapp:id/password");
    By elementButtonSignInRegister = MobileBy.id("com.isl.simpleapp:id/login");

    public LoginPage inputUsername() {
        type(elementInputUsername, "admin");
        return this;
    }

    public void inputUsername(String usernameValue) {
        type(elementInputUsername, usernameValue);
    }

    public LoginPage inputPassword() {
        getDriverWait().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementInputPassword));
        type(elementInputPassword, "admin");
        return this;
    }

    public void inputPassword(String passwordValue) {
        type(elementInputPassword, passwordValue);
    }

    public void andClickButtonRegister() {
        clickObject(elementButtonSignInRegister);
    }

    public boolean isButtonRegisterDisplayed() {
        return find(elementButtonSignInRegister).isDisplayed();
    }
}
