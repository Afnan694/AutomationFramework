import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input[class=\"inputtext _55r1 _6luy\"]")).sendKeys("afnan@gmail.com");
        driver.findElement(By.cssSelector("input[class=\"inputtext _55r1 _6luy _9npi\"]")).sendKeys("Afnan123");
        driver.findElement(By.cssSelector("button[class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]")).click();


    }
}
