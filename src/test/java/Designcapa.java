import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;


public class Designcapa {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");

        ChromeOptions options = new ChromeOptions();
        options.merge(capabilities);
//        options.addArguments("--headless");

        // URL of the Selenium Grid hub

        URL gridUrl = new URL("http://localhost:4444/wd/hub");

        // Initialize RemoteWebDriver for Selenium Grid
        WebDriver driver = new RemoteWebDriver(gridUrl, options);

        driver.get("https://sampleapp.tricentis.com/101/app.php");
        driver.manage().window().maximize();
        Thread.sleep(5000); // Wait for the page to load

        driver.findElement(By.linkText("Automobile")).click();
        String Url = driver.getCurrentUrl();
        driver.findElement(By.linkText("Truck")).click();
        String Url1 = driver.getCurrentUrl();
        driver.findElement(By.linkText("Motorcycle")).click();
        String Url2 = driver.getCurrentUrl();
        driver.findElement(By.linkText("Camper")).click();
        String Url3 = driver.getCurrentUrl();
        driver.quit();
    }
}
