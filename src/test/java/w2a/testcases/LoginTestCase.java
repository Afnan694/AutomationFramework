package w2a.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import w2a.base.TestBase;

public class LoginTestCase extends TestBase {
    @Test
    public void vehicleInsurance() throws InterruptedException {
        // Test case logic for vehicle insurance
//        System.out.println("Vehicle Insurance Test Case Executed");
        driver.findElement(By.id(OR.getProperty("MotorCycleLink"))).click();
        log.debug("Clicked on Motor Cycle Link");
        Thread.sleep(3000);

        String vehicleType = driver.findElement(By.id(OR.getProperty("Insurancetype"))).getText();
        Assert.assertEquals(vehicleType, "Motorcycle Insurance");
    }
}
