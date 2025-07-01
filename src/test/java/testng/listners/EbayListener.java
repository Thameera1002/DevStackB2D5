package testng.listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import reporter.ExtentReportManager;

public class EbayListener implements ITestListener {

    public void onTestStart(ITestResult result) {
        ExtentReportManager.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        ExtentReportManager.logPass(result.getMethod().getMethodName()+" passed !");
    }

    public void onTestFailure(ITestResult result) {
        ExtentReportManager.logFail(result.getMethod().getMethodName()+" failed !");
    }

    public void onTestSkipped(ITestResult result) {
        ExtentReportManager.logSkip(result.getMethod().getMethodName()+" skipped !");
    }

    public void onStart(ITestContext context) {
        ExtentReportManager.initReport();
    }

    public void onFinish(ITestContext context) {
        ExtentReportManager.flushReport();
    }
}
