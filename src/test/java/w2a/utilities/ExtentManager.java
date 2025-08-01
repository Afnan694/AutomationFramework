package w2a.utilities;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

import java.io.File;

public class ExtentManager {
    public static ExtentReports extent;

    public static ExtentReports getInstance() {

        if (extent == null) {
            extent = new ExtentReports(System.getProperty("user.dir") + "\\target\\surefire-reports\\html\\extent.html",true, DisplayOrder.OLDEST_FIRST);
            extent.loadConfig(new File(System.getProperty("user.dir")+"\\src\\test\\resources\\extendconfig\\ReportsConfig.xml"));
        }
        return extent;
    }
}
