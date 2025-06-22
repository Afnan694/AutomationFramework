import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Dynamictable {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        driver.manage().window().maximize();
        double[] priceCells = new double[100];
        double max = 0;
        double max1 = 0;
        for (int i = 1; i <= 26; i++)
        {
            priceCells[i] = Double.parseDouble(driver.findElement(By.xpath("//table/tbody[1]/tr["+i+"]/td[4]")).getText());
                if(priceCells[i] > max)
                {
                    max = priceCells[i];
                }
                else if(priceCells[i] == max)
                {
                    continue;
                }
                else if(priceCells[i] < max && priceCells[i] > max1)
                {
                    max1 = priceCells[i];
                }

        }
        System.out.println("The highest price is: " + max);
//        System.out.println(max);
        System.out.println("The second highest price is: " + max1);





    }
}
