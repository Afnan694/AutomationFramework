import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class FindElements {
    public static void main(String[] args) {
        //Browser Open
        WebDriver driver = new ChromeDriver();
        //Browser Url Open
        driver.get("https://sampleapp.tricentis.com/101/app.php");
        //Browser Window Maximise
        driver.manage().window().maximize();

        List<WebElement> webelement= driver.findElements(By.xpath("//li[@class=\"menu-item\"]/a"));


        for (int i=0;i<webelement.size();i++)
        {
            System.out.println(webelement.get(i).getText());
        }
        //Find By Link and Click on Link

    }
}
