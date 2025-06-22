import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


///html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]
public class HoverMouse {

    public static void main(String[] args) {
       WebDriver driver = new ChromeDriver();
       driver.get("https://demo.guru99.com/test/newtours/index.php");
       driver.manage().window().maximize();

       WebElement home = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]"));

       Actions builder = new Actions(driver);
       Action mouseoverhome = builder.moveToElement(home).build();

       String bgcolor = home.getCssValue("background-color");
        System.out.println("before"+bgcolor);
        mouseoverhome.perform();
        bgcolor = home.getCssValue("background-color");
        System.out.println("After hover: "+bgcolor);
        builder.doubleClick(home);


    }
}