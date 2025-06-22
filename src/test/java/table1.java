import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/accessing-nested-table.html");
        driver.manage().window().maximize();

        for (int i = 1; i <=2 ; i++) {
            for (int j = 1; j <=2 ; j++) {
                WebElement tablerowvalue1 = driver.findElement(By.xpath("//center/table[1]/tbody[1]/tr["+i+"]/td["+j+"]"));
                String tablelabelrow1 = tablerowvalue1.getText();
                System.out.println(tablelabelrow1);
            }
        }

    }
}
