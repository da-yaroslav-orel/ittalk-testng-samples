package listeners.order;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener1 implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Listener1");
    }
}
