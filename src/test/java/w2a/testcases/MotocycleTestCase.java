package w2a.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import w2a.base.TestBase;

public class MotocycleTestCase extends TestBase {
    @Test
    public void MotorcycleInsurance() throws InterruptedException {
        System.setProperty("org.uncommons.reportng.escape-output", "false");
        driver.findElement(By.id(OR.getProperty("MotorCycleLink"))).click();
        log.debug("Clicked on Motor Cycle Link");
        Thread.sleep(3000);

        String vehicleType = driver.findElement(By.id(OR.getProperty("Insurancetype"))).getText();
        Assert.assertEquals(vehicleType, "Motorcycle Insurance");
        Reporter.log("Vehicle Insurance Test Case Passed");
    }
}
