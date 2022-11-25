package com.example.app.drivers;
import com.example.app.properties.PropertiesReader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidDriverInit {

  public static AndroidDriver<AndroidElement> driver;

  public static void initialize() {
    DesiredCapabilities caps = new DesiredCapabilities();
    PropertiesReader reader = new PropertiesReader();
    HashMap<String,String> data = reader.readProperties().getAppiumProperties();
    data.forEach((key,value) -> caps.setCapability(key,value));
    String url = "http://localhost:4723/wd/hub";
    try {
      driver = new AndroidDriver<>(new URL(url), caps);
      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
  }

  public static void quit() {
    driver.quit();
  }
}
