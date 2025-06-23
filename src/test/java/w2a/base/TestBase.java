package w2a.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {

    public static WebDriver driver;
    public static Properties config = new Properties();
    public static Properties OR = new Properties();
    public static FileInputStream fis;
    public static String browser;
    //    public static final Logger logger = LogManager.getLogger(TestBase.class);
    public static Logger log = Logger.getLogger("devpinoyLogger");


    @BeforeMethod
    public void setUp() throws IOException {
        if (driver == null) {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
            config.load(fis);

            fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\OR.properties");
            OR.load(fis);

            if (config.getProperty("browser").equals("chrome")) {
                driver = new ChromeDriver();
                log.info("Chrome browser launched successfully.");
            } else if (config.getProperty("browser").equals("firefox")) {
                driver = new FirefoxDriver();
                log.info("Firefox browser launched successfully.");
            } else if (config.getProperty("browser").equals("ie")) {
                driver = new InternetExplorerDriver();
                log.info("Internet Explorer browser launched successfully.");
            } else if (config.getProperty("browser").equals("edge")) {
                driver = new EdgeDriver();
                log.info("Internet Explorer browser launched successfully.");
            }

        }
        driver.get(config.getProperty("url"));
        log.info("Navigated to URL: " + config.getProperty("url"));
        driver.manage().window().maximize();
        log.info("Browser window maximized.");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        log.info("Implicit wait set to 10 seconds.");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }


}


