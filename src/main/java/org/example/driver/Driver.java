package org.example.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import static java.util.Objects.isNull;

public class Driver {

    public Driver(){}

    public static void initDriver(String browser){
        if(isNull(DriverManager.getDriver())){

           WebDriver driver= DriverFactory.get(browser);
            DriverManager.serDriver(driver);
        }
    }
}
