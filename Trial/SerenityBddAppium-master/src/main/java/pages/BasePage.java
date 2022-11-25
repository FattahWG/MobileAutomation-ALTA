package pages;

import driver.AndroidDriverInstance;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {

    WebDriverWait driverWait;

    TouchAction touchAction;

    public AndroidDriver<AndroidElement> getDriver() {
        return AndroidDriverInstance.getAndroidDriver();
    }

    public AndroidElement find(By locatorName) {
        return getDriver().findElement(locatorName);
    }

    public List<AndroidElement> findElements(By locatorName) {
        return getDriver().findElements(locatorName);
    }

    public void type(By locatorName, String value) {
        find(locatorName).sendKeys(value);
    }

    public void clickObject(By locatorName) {
        find(locatorName).click();
    }

    public WebDriverWait getDriverWait() {
        driverWait = new WebDriverWait(getDriver(), 10);
        return driverWait;
    }

    public TouchAction getTouchAction() {
        touchAction = new TouchAction(getDriver());
        return touchAction;
    }

    public void swipeScreen(By elementToSwipe) {
        Point coordinate = find(elementToSwipe).getCenter();
        getTouchAction().press(PointOption.point(coordinate))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(coordinate.getX(), coordinate.getY() + -500))
                .release()
                .perform();
    }

    public void longPressObject(By elementToPress) {
        getTouchAction().longPress(PointOption.point(find(elementToPress).getCenter()))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
                .release()
                .perform();
    }

    public void longPressObject(AndroidElement elementToPress) {
        getTouchAction().longPress(PointOption.point(elementToPress.getCenter()))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
                .release()
                .perform();
    }

    public void tapMultipleTimes(AndroidElement elementToTap) {
        getTouchAction().tap(TapOptions.tapOptions().withTapsCount(5)
                        .withElement(ElementOption.element(elementToTap)))
                .perform();
    }

    public void tapMultipleTimes(List<AndroidElement> elementToTap, int loop) {
        for (int i = 0; i < loop; i++) {
            getTouchAction().tap(TapOptions.tapOptions().withTapsCount(1)
                            .withElement(ElementOption.element(elementToTap.get(i))))
                    .perform();

        }
    }

    public void scrollToText(String textToScroll) {
        getDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"" + textToScroll + "\"))"));
    }
}
