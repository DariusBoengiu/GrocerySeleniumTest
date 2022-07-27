package org.example.grocery;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public interface Browser {

//    DesiredCapabilities dc = new DesiredCapabilities();
//
//    dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);



    WebDriver driver = new ChromeDriver();

    static void goTo(String url) {
        driver.get(url);
    }

    static String title() {
        return driver.getTitle();
    }
}
