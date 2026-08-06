package testCases;

import org.example.base.TestBase;
import org.example.driver.DriverManager;
import org.example.utility.PropertyUtils;
import org.testng.annotations.Test;

public class Launch extends TestBase {

    @Test
    public void  LaunchBrowser() throws InterruptedException {
        Thread.sleep(2000);
        DriverManager.getDriver().get(PropertyUtils.getValue("url"));
    }
}
