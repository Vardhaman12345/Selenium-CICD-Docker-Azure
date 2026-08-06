package org.example.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private DriverFactory(){}

    protected static WebDriver get(String browser){

        WebDriver driver = null;
        if(browser.equalsIgnoreCase("Chrome")){
            driver=new ChromeDriver();
        } else if(browser.equalsIgnoreCase("edge")){
            driver=new EdgeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver=new FirefoxDriver();
        }
        return driver;
    }
}
