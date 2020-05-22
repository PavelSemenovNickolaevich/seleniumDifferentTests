package com.herokuapp.theinternet.base;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TestListener implements ITestListener {

    Logger log;
    String testName;
    String testMethodName;


    @Override
    public void onTestStart(ITestResult result) {
        this.testMethodName = result.getMethod().getMethodName();
        log.info("[Starting " + testMethodName + "]");

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        log.info("[Starting " + testMethodName + " passed ]");

    }

    @Override
    public void onTestFailure(ITestResult result) {
        log.info("[Starting " + testMethodName + " failed ]");

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext context) {
        this.testName = context.getCurrentXmlTest().getName();
        this.log - LogManager.getLogger(testName);
        log.info("[Test " + testName + " Started ]");

    }

    @Override
    public void onFinish(ITestContext context) {
        log.info("[All " + testName + " finished ]");

    }
}
