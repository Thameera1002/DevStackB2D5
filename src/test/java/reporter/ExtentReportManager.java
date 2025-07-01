package reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.util.Objects;

public class ExtentReportManager {
    private static ExtentReports extent;
    private static ExtentTest test;

    public static void initReport() {
        extent = new ExtentReports();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("reports/ExtentSparkReport.html");
        sparkReporter.config().setTheme(Theme.STANDARD);
        sparkReporter.config().setDocumentTitle("Ebay Report");
        sparkReporter.config().setReportName("Ebay Report Results");
        extent.attachReporter(sparkReporter);
    }

    public static void createTest(String testName) {
        test = extent.createTest(testName);
    }

    public static void logPass(String message) {
        if(Objects.nonNull(test)) {
            test.log(Status.PASS, message);
        }
    }

    public static void logFail(String message) {
        if(Objects.nonNull(test)) {
            test.log(Status.FAIL, message);
        }
    }

    public static void logSkip(String message) {
        if(Objects.nonNull(test)) {
            test.log(Status.SKIP, message);
        }
    }

    public static void logInfo(String message) {
        if(Objects.nonNull(test)) {
            test.log(Status.INFO, message);
        }
    }

    public static void flushReport() {
        if(Objects.nonNull(test)) {
            extent.flush();
        }
    }

}
