package w2a.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import w2a.utilities.TestUtil;

import java.io.IOException;
import java.util.Date;

public class CustomListeners implements ITestListener {
    // Implement methods from ITestListener interface to customize test execution behavior
    // For example, you can override onTestStart, onTestSuccess, onTestFailure, etc.

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {


        System.setProperty("org.uncommons.reportng.escape-output", "false");
        try {
            TestUtil.CaptureScreenShot();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Reporter.log("Capuring screenshot for failed test: " + result.getName());
        Reporter.log("<a target=\"_blank\" href=" + TestUtil.screenshotName + ">Screenshot</a>");
        Reporter.log("<br>");
        Reporter.log("<br>");
        Reporter.log("<a target=\"_blank\" href=" + TestUtil.screenshotName + "><img src=" + TestUtil.screenshotName + "></img></a>");
        Reporter.log("<br>");
        Reporter.log("Test failed: " + result.getName());
        System.out.println("Test failed: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skipped: " + result.getName());
    }

    // You can add more methods as needed for your custom listener functionality
}
