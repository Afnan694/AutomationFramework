import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();

        driver.findElement(By.name("cusid")).sendKeys("56011");
        driver.findElement(By.name("submit")).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.switchTo().alert().dismiss();
        driver.findElement(By.name("submit")).click();
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();













    }
}
