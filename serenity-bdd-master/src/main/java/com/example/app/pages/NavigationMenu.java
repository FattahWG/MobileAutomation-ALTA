package com.example.app.pages;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;

public class NavigationMenu extends BasePageObject {

  public void clickHamburgerBtn(){
    click(MobileBy.AccessibilityId("Open navigation drawer"));
  }

  public void clickListMenu(){
    click(MobileBy.id("nav_list"));
  }

}
