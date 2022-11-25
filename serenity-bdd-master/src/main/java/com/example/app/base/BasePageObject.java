package com.example.app.base;

import com.example.app.drivers.AndroidDriverInit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePageObject {

  TouchAction touchAction;

  public TouchAction getTouchAction() {
    touchAction = new TouchAction(getDriver());
    return touchAction;
  }
  public AndroidDriver<AndroidElement> getDriver(){
    return AndroidDriverInit.driver;
  }
  public AndroidElement find(By by){
    return getDriver().findElement(by);
  }

  public String getText(By by){
    return find(by).getText();
  }
  public List<AndroidElement> findElements(By locatorName) {
    return getDriver().findElements(locatorName);
  }
  public void type(By by, String text){
    AndroidElement element = find(by);
    element.clear();
    element.sendKeys(text);
  }
  public void click(By by){
    find(by).click();
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
}
