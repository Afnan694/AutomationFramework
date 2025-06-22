import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class upload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/upload/");
        driver.manage().window().maximize();
        String currentDirectory = System.getProperty("user.dir");

        driver.findElement(By.id("uploadfile_0")).sendKeys(currentDirectory+"\\src\\test\\java\\ChromeKill.bat");


//
//        String currentDirectory = System.getProperty("user.dir");

        // Print the current directory
        System.out.println("Current Directory: " + currentDirectory);
//

        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("submitbutton")).click();



    }
}
