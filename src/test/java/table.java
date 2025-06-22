import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class table {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/write-xpath-table.html");
        driver.manage().window().maximize();

        for(int i = 1; i <= 2; i++)
        {
            for(int j = 1; j <= 2; j++)
            {
                WebElement tablevalue1 = driver.findElement(By.xpath("//tr["+i+"]/td["+j+"]"));
                String tablelabel1 = tablevalue1.getText();
                System.out.println(tablelabel1);
            }
        }
//        WebElement tablevalue1 = driver.findElement(By.xpath("//tr[1]/td[1]"));
//        String tablelabel1 = tablevalue1.getText();
//        System.out.println(tablelabel1);
//     driver.findElement(By.xpath(/html/body/center/table));
//        System.out.println("This is Value "+value);









    }
}
