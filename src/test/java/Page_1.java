import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Page_1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://sampleapp.tricentis.com/101/app.php");
        driver.manage().window().maximize();

        driver.findElement(By.id("nav_automobile")).click();
        Select VehicleType = new Select(driver.findElement(By.id("make")));
        VehicleType.selectByVisibleText("Audi");

        driver.findElement(By.id("engineperformance")).sendKeys("1000");

        driver.findElement(By.id("dateofmanufacture")).sendKeys("07/10/2001");

        Select noofseat = new Select(driver.findElement(By.id("numberofseats")));
        noofseat.selectByIndex(2);

        Select fuel = new Select(driver.findElement(By.id("fuel")));
        fuel.selectByValue("Petrol");

        driver.findElement(By.id("listprice")).sendKeys("500");
        driver.findElement(By.id("licenseplatenumber")).sendKeys("1010");
        driver.findElement(By.id("annualmileage")).sendKeys("10");
        driver.findElement(By.id("nextenterinsurantdata")).click();



    }
}
