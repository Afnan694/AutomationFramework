import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TestNGParallelExecution {
    @Test
    public void executSessionOne(){
        //First session of WebDriver
        WebDriver driver = new ChromeDriver();
        //Goto guru99 site
        driver.get("https://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 1");
        driver.close();
    }

    @Test
    public void executeSessionTwo(){
        //Second session of WebDriver

        WebDriver driver = new ChromeDriver();
        //Goto guru99 site
        driver.get("https://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 2");
        driver.close();

    }

    @Test
    public void executSessionThree(){
        //Third session of WebDriver
        WebDriver driver = new ChromeDriver();
        //Goto guru99 site
        driver.get("https://demo.guru99.com/V4/");
        //find user name text box and fill it
        driver.findElement(By.name("uid")).sendKeys("Driver 3");
        driver.close();
    }
}