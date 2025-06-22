import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercury {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        driver.manage().window().maximize();


        driver.findElement(By.linkText("REGISTER")).click();
        driver.findElement(By.partialLinkText("SIGN")).click();

        String url = driver.getCurrentUrl();
        System.out.println(url);

    }
}
