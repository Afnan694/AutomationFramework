package w2a.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import w2a.base.TestBase;

public class LoginTestCase extends TestBase {
    @Test
    public void vehicleInsurance() throws InterruptedException {
        // Test case logic for vehicle insurance
//        System.out.println("Vehicle Insurance Test Case Executed");

        System.setProperty("org.uncommons.reportng.escape-output", "false");
        driver.findElement(By.id(OR.getProperty("MotorCycleLink"))).click();
        log.debug("Clicked on Motor Cycle Link");
        Thread.sleep(3000);

        String vehicleType = driver.findElement(By.id(OR.getProperty("Insurancetype"))).getText();
        Assert.assertEquals(vehicleType, "Motorcycle Insurance ");

        Reporter.log("Vehicle Insurance Test Case Passed");
//        Reporter.log("<a href = "C:\\Users\\afnan\\Downloads\\ChatGPT Image Apr 10, 2025, 02_22_14 PM.png">ScreenShot</a>");

        Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\afnan\\Downloads\\Photo1.jpg\"><img src=\"C:\\Users\\afnan\\Downloads\\Photo1.jpg\"></img></a>");

    }
}
