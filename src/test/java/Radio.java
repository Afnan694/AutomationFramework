import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().window().maximize();

        WebElement radio1 = driver.findElement(By.xpath("//input[@value = \"Option 1\"]"));
        radio1.click();
        Boolean radioB1 = radio1.isSelected();

        WebElement radio2 = driver.findElement(By.xpath("//input[@value = \"Option 2\"]"));
        radio2.click();
        Boolean radioB2 = radio2.isSelected();
        System.out.println("Button Clicekd "+radioB2);

        WebElement radio3 = driver.findElement(By.xpath("//input[@value = \"Option 3\"]"));
        radio3.click();
        Boolean radiob3 = radio3.isEnabled();
        System.out.println(radiob3);

        WebElement checkbox1 = driver.findElement(By.xpath("//input[@value = \"checkbox1\"]"));
        checkbox1.click();

        WebElement CheckBox2 = driver.findElement(By.xpath("//input[@value = \"checkbox1\"]"));
        Boolean CheckBoxClicked2 = CheckBox2.isSelected();
        CheckBox2.click();
        System.out.println("Check Box is Checked "+CheckBoxClicked2);

        WebElement CheckBox3 = driver.findElement(By.xpath("//input[@value = \"checkbox3\"]"));
        CheckBox3.click();
        Boolean CheckBoxClicked3 = CheckBox3.isSelected();
        System.out.println("Check Box 3 Selected "+CheckBoxClicked3);

        System.out.println("All TestCase Passed");






    }
}
