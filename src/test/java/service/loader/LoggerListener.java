package service.loader;

import org.pmw.tinylog.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LoggerListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) { System.out.println("Test " + result.getName() + " started"); }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test " + result.getName() + " passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test " + result.getName() + " failed");
    }

    @Override
    public void onTestSkipped(ITestResult result) { }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}

    @Override
    public void onStart(ITestContext context) { }

    @Override
    public void onFinish(ITestContext context) { }
}
