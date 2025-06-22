import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Vehicle_Page {
    public static void main(String[] args) {
        //Browser Open
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


        System.out.println("Automobile "+Url);
        System.out.println("Truck "+Url1);
        System.out.println("Motorcycle "+Url2);
        System.out.println("Camper "+Url3);

        driver.findElement(By.linkText("Automobile")).click();
        String vehicletype = driver.findElement(By.xpath("//span[@id=\"selectedinsurance\"]")).getText();
        System.out.println(vehicletype);






        Select makeDropdown = new Select(driver.findElement(By.name("Make")));
        makeDropdown.selectByVisibleText("Audi");
        driver.findElement(By.id("engineperformance")).sendKeys("1000");
        driver.findElement(By.id("dateofmanufacture")).sendKeys("07/20/2023");

        Select seatsDropdown = new Select(driver.findElement(By.id("numberofseats")));
        seatsDropdown.selectByVisibleText("4");
        seatsDropdown.selectByIndex(1);


        Select drpFuelType = new Select(driver.findElement((By.id("fuel"))));
        drpFuelType.selectByVisibleText("Petrol");
        drpFuelType.selectByIndex(3);

        driver.findElement(By.id("listprice")).sendKeys("1000");
        driver.findElement(By.id("licenseplatenumber")).sendKeys("1000");
        driver.findElement(By.id("annualmileage")).sendKeys("10");
        driver.findElement(By.id("nextenterinsurantdata")).click();


        //Second Page




    }
}
