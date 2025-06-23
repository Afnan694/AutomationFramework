package w2a.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import w2a.base.TestBase;

public class AutomobileTestCase extends TestBase {

    @Test
    public void AutoMobile() {
        driver.findElement(By.id(OR.getProperty("AutoMobileLink"))).click();
        String AutoMobiledriver = driver.findElement(By.id(OR.getProperty("Insurancetype"))).getText();
        System.out.println("AutoMobiledriver: " + AutoMobiledriver);
        Assert.assertEquals(AutoMobiledriver, "Automobile Insurance");
    }

}
