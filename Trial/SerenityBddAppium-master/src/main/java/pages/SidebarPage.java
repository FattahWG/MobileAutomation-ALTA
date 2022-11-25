package pages;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class SidebarPage extends BasePage {

    By elementHamburgerMenu = MobileBy.xpath("//android.widget.ImageButton[@content-desc='Open navigation drawer']");
    By elementSecondMenu = MobileBy.id("com.isl.simpleapp:id/et_2");
    By elementScreenToAction = MobileBy.id("com.isl.simpleapp:id/recycler_view");

    By elementListOfText = MobileBy.id("com.isl.simpleapp:id/text_view");

    public SidebarPage clickHamburgerMenu() {
        clickObject(elementHamburgerMenu);
        return this;
    }

    public void clickSecondMenu() {
        clickObject(elementSecondMenu);
    }

    public boolean isHamburgerMenuDisplayed() {
        return find(elementHamburgerMenu).isDisplayed();
    }

    public void swipeInSecondMenu() {
        swipeScreen(elementScreenToAction);
    }

    public void longPressInTheSecondMenu() {
        longPressObject(findElements(elementListOfText).get(4));
    }

    public void tapMultipleTimesInTheSecondMenu() {
        tapMultipleTimes(findElements(elementListOfText).get(1));
    }

    public void scrollToTextInTheSecondMenu() {
        scrollToText("List ke-50");
    }
}
