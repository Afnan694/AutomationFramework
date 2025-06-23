package w2a.listeners;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import w2a.base.TestBase;
import w2a.utilities.TestUtil;

import java.io.IOException;
import java.util.Date;

public class CustomListeners extends TestBase implements ITestListener {
    // Implement methods from ITestListener interface to customize test execution behavior
    // For example, you can override onTestStart, onTestSuccess, onTestFailure, etc.

    @Override
    public void onTestStart(ITestResult arg0) {
        test = rep.startTest(arg0.getName().toUpperCase());
    }

    @Override
    public void onTestSuccess(ITestResult arg0) {
//        System.out.println("Test passed: " + result.getName());
        test.log(LogStatus.PASS,arg0.getName().toUpperCase()+" Pass");
        rep.endTest(test);
        rep.flush();

    }

    @Override
    public void onTestFailure(ITestResult arg0) {
        System.setProperty("org.uncommons.reportng.escape-output", "false");
        try {
            TestUtil.CaptureScreenShot();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        test.log(LogStatus.FAIL,arg0.getName().toUpperCase()+"Failed with exception: " + arg0.getThrowable());
        test.log(LogStatus.FAIL,test.addScreenCapture(TestUtil.screenshotName));
        Reporter.log("Capuring screenshot for failed test: " + arg0.getName());
        Reporter.log("<a target=\"_blank\" href=" + TestUtil.screenshotName + ">Screenshot</a>");
        Reporter.log("<br>");
        Reporter.log("<br>");
        Reporter.log("<a target=\"_blank\" href=" + TestUtil.screenshotName + "><img src=" + TestUtil.screenshotName + "></img></a>");
        Reporter.log("<br>");
        Reporter.log("Test failed: " + arg0.getName());
        System.out.println("Test failed: " + arg0.getName());
        rep.endTest(test);
        rep.flush();
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skipped: " + result.getName());
    }

    // You can add more methods as needed for your custom listener functionality
}
