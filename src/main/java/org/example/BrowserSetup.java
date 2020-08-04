package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSetup extends BasePage {

    LoadProp loadProp = new LoadProp();
    String browser = loadProp.getproperty("browser");

    public void setUPBrowser() {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src\\Resources\\Driver\\chromedriver.exe");
            driver = new ChromeDriver();
        } else {
            System.out.println("Browser is Wrong");

        }
    }
}