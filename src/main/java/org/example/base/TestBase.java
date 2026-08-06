package org.example.base;

import org.example.driver.Driver;
import org.example.driver.DriverManager;
import org.example.utility.PropertyUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.time.Duration;

import static java.util.Objects.nonNull;


public class TestBase {

    @BeforeMethod
    public void setUp(){
        String browser= PropertyUtils.getValue("browser");
        Driver.initDriver(browser);
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.valueOf(PropertyUtils.getValue("time"))));
    }


    @AfterMethod
    public void  quit(){
        if(nonNull(DriverManager.getDriver())){
            DriverManager.getDriver().quit();
        }
    }
}
