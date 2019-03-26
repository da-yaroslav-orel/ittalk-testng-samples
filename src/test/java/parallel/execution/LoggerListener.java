package parallel.execution;

import org.pmw.tinylog.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import java.util.List;

public class LoggerListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        Logger.info("Test " + result.getName() + " started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Logger.info("Test " + result.getName() + " passed");
        flushLogs(result);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Logger.info("Test " + result.getName() + " failed");
        flushLogs(result);
    }

    private void flushLogs(ITestResult result) {
        List<String> output = Reporter.getOutput(result);
        output.forEach(System.out::println);
    }


    @Override
    public void onTestSkipped(ITestResult result) { }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) { }

    @Override
    public void onStart(ITestContext context) { }

    @Override
    public void onFinish(ITestContext context) { }
}
