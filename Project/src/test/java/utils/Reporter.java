package utils;

import java.io.File;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporter {

    private static ExtentSparkReporter spark;
    private static ExtentReports reports;
    private static Properties prop = Base.prop;

    public static ExtentReports createReport(){
        String path = System.getProperty("user.dir") + "/reports";
        File file = new File(path);

        if(!file.exists()){
            file.mkdirs();
        }

        spark = new ExtentSparkReporter(file);

        reports = new ExtentReports();
        reports.attachReporter(spark);

        spark.config().setTheme(Theme.STANDARD);
        spark.config().setDocumentTitle("Mayors Automation Report");
        spark.config().setTimeStampFormat("yyyy.MM.dd.HH.mm.ss");

        reports.setSystemInfo("Application URL", prop.getProperty("url"));
        reports.setSystemInfo("Browser Name", prop.getProperty("browser"));
        reports.setSystemInfo("Operating System", System.getProperty("os.name"));
        reports.setSystemInfo("Java Version", System.getProperty("java.version"));
        reports.setSystemInfo("Selenium Version", "4.15.0");

        return reports;
    }
}