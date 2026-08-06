package org.example.driver;

import org.openqa.selenium.WebDriver;

public class DriverManager {


    private  static  ThreadLocal<WebDriver> threadLocal=new ThreadLocal<>();


    public static WebDriver getDriver(){

        return threadLocal.get();
    }

    public static void serDriver(WebDriver driverRef){

        threadLocal.set(driverRef);
    }

    public   static void unLoad(){

        threadLocal.remove();

    }
}
