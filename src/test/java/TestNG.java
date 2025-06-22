import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestNG {

    @Test//(priority = 1)
    public void testexecution() {

        WebDriver driver = new ChromeDriver();
        //Browser Url Open
        driver.get("https://sampleapp.tricentis.com/101/app.php");
        //Browser Window Maximise
        driver.manage().window().maximize();
        //Find By Link and Click on Link
        driver.findElement(By.linkText("Automobile")).click();
        String Url = driver.getCurrentUrl();
        driver.findElement(By.linkText("Truck")).click();
        String Url1 = driver.getCurrentUrl();
        driver.findElement(By.linkText("Motorcycle")).click();
        String Url2 = driver.getCurrentUrl();
        driver.findElement(By.linkText("Camper")).click();
        String Url3 = driver.getCurrentUrl();
        driver.close();

    }

    @Test
    public void testexecution2() {

        WebDriver driver = new ChromeDriver();
        //Browser Url Open
        driver.get("https://sampleapp.tricentis.com/101/app.php");
        //Browser Window Maximise
        driver.manage().window().maximize();
        //Find By Link and Click on Link
        driver.findElement(By.linkText("Automobile")).click();
        String Url = driver.getCurrentUrl();
        driver.findElement(By.linkText("Truck")).click();
        String Url1 = driver.getCurrentUrl();
        driver.findElement(By.linkText("Motorcycle")).click();
        String Url2 = driver.getCurrentUrl();
        driver.findElement(By.linkText("Camper")).click();
        String Url3 = driver.getCurrentUrl();
        driver.close();

    }
}
