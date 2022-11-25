package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import java.util.List;
import org.openqa.selenium.By;


public class ListPage extends BasePageObject {
  By elementListOfText = MobileBy.id("com.isl.simpleapp:id/text_view");
  public void swipeList() {

    AndroidElement element = find(MobileBy.AndroidUIAutomator(
        "new UiScrollable(new UiSelector().scrollable(true))" +
            ".scrollIntoView(new UiSelector().text(\"List ke-60\"))"));
  }
  public void longPressInTheSecondMenu() {
    longPressObject(findElements(elementListOfText).get(4));
  }

  public void tapMultipleTimesInTheSecondMenu() {
    tapMultipleTimes(findElements(elementListOfText).get(5));
  }

}
