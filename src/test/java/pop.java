import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class pop {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/popup.php");
        driver.manage().window().minimize();

        driver.findElement(By.partialLinkText("Click Here")).click();

        String MainWindow = driver.getWindowHandle();

        driver.switchTo().window(MainWindow);
        driver.findElement(By.name("emailid")).sendKeys("afnan@gmail.com");
        System.out.println(MainWindow);


        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();

            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);

                driver.findElement(By.name("emailid"))
                        .sendKeys("gaurav.3n@gmail.com");

                System.out.println(ChildWindow);

                driver.findElement(By.name("btnLogin")).click();

                driver.switchTo().window(MainWindow);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                driver.switchTo().window(ChildWindow);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                driver.switchTo().window(MainWindow);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                driver.switchTo().window(ChildWindow);
                driver.switchTo().window(ChildWindow);
                  driver.switchTo().window(MainWindow);


                // Closing the Child Window.
//                driver.close();
            }


        }
    }
}
