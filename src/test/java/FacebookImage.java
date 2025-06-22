import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookImage {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/identify?ctx=recover");

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@aria-label=\"Facebook\"]")).click();

    }
}
