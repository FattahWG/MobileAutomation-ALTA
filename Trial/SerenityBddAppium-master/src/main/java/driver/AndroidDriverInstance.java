package driver;

import helper.PropertiesReader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class AndroidDriverInstance {
    public static AndroidDriver<AndroidElement> androidDriver;
    static DesiredCapabilities capabilities = new DesiredCapabilities();
    static String URL_APPIUM = "http://localhost:4723/wd/hub";

    public static void fillAndroidDriver() {
        setupCapabilitiesDevice();
        try {
            androidDriver = new AndroidDriver<>(new URL(URL_APPIUM), capabilities);
            androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (Exception ignored) {

        }
    }

    public static AndroidDriver<AndroidElement> getAndroidDriver() {
        return androidDriver;
    }

    public static void quit() {
        androidDriver.quit();
    }

    static void setupCapabilitiesDevice() {
        PropertiesReader reader = new PropertiesReader();
        HashMap<String, String> data = reader.readProperties().getAppiumProperties();
        data.forEach((key, value) -> capabilities.setCapability(key, value));

        /*capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/azzamnizar/Downloads/sample-apk.apk");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
        capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);*/
    }
}
