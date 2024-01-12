package UtilsLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BaseLayer.BaseClass;

public class ITestListnerSetup extends BaseClass implements ITestListener {
	ExtentReports extentReports;
	ExtentSparkReporter extentSparkReporter;
	ExtentTest extentTest;

	@Override
	public void onStart(ITestContext context) {

		String suiteName = context.getSuite().getName();
		String date = new SimpleDateFormat("ddMMyyyy_HHmmsss").format(new Date());
		extentReports = new ExtentReports();
		extentSparkReporter = new ExtentSparkReporter(
				System.getProperty("user.dir") + "\\Reports\\" + suiteName + date + ".html");
		extentReports.attachReporter(extentSparkReporter);

	}

	@Override
	public void onTestStart(ITestResult result) {

		String methodName = result.getMethod().getMethodName();
		extentTest = extentReports.createTest(methodName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		extentTest.log(Status.PASS, methodName);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File f = ts.getScreenshotAs(OutputType.FILE);

		String methodname = result.getMethod().getMethodName();
		String date = new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());

		String path = System.getProperty("user.dir") + "\\PassScreenshot\\" + methodname + date + ".png";
		File dest = new File(path);

		try {
			FileUtils.copyFile(f, dest);
		} catch (IOException e) {

			e.printStackTrace();
		}

		extentTest.addScreenCaptureFromPath(path);
	}

	@Override
	public void onTestFailure(ITestResult result) {

		String methodName = result.getMethod().getMethodName();
		extentTest.log(Status.FAIL, methodName);

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		extentTest.log(Status.SKIP, methodName);
	}

	@Override
	public void onFinish(ITestContext context) {
		extentReports.flush();

	}

}
