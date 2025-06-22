import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://sampleapp.tricentis.com/101/app.php");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        String Url = driver.getCurrentUrl();

        driver.findElement(By.name("Navigation Automobile")).click();
        driver.findElement(By.name("Navigation Truck")).click();
        driver.findElement(By.id("nav_motorcycle")).click();
        driver.findElement(By.name("Navigation Camper")).click();
//        driver.findElement(By.name("")).


        System.out.println(title);
        System.out.println("This is Url "+Url);

//        driver.close();









    }
}
