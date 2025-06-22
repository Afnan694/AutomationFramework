import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Tooltips {
    public static void main(String[] args) {
        //Browser Open
        WebDriver driver = new ChromeDriver();
        //Browser Url Open
        driver.get("https://demo.guru99.com/test/social-icon.html");
        //Browser Window Maximise
        driver.manage().window().maximize();
        WebElement tooltip=driver.findElement(By.xpath("//div[@class=\"socialbtns\"]/div[1]/a[1]"));
        String titleValue=tooltip.getAttribute("class");
        System.out.println(titleValue);
        driver.quit();

    }
}
