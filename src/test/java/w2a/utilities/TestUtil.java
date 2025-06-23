package w2a.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import org.apache.commons.io.FileUtils;
import w2a.base.TestBase;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestUtil extends TestBase {

    public static String screenshotPath;
    public static String screenshotName;
    public static void CaptureScreenShot() throws IOException {
        Date d = new Date();
        screenshotName = d.toString().replace(":", "_").replace(" ", "_")+ ".jpg";;
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile,new File(System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\"+screenshotName));



    }


}
