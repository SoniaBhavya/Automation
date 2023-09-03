package Utilities;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;


public class ListenerTest extends BaseClass implements ITestListener {



//    @Override
//    public void onFinish(ITestContext arg0) {
//        // TODO Auto-generated method stub
//
//    }
//
//    @Override
//    public void onStart(ITestContext arg0) {
//        // TODO Auto-generated method stub
//
//    }
//
//    @Override
//    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
//        // TODO Auto-generated method stub
//
//    }
    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("Test failed");
        try {
            captureScreenshot(result.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    @Override
//    public void onTestSkipped(ITestResult arg0) {
//        // TODO Auto-generated method stub
//
//    }
//
//    @Override
//    public void onTestStart(ITestResult arg0) {
//        // TODO Auto-generated method stub
//
//    }
//
//    @Override
//    public void onTestSuccess() {
//        // TODO Auto-generated method stub
//

    }

