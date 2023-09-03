package Utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom.loginPagePF;


import java.io.File;
import java.io.IOException;
import java.time.Duration;



public class BaseClass {
    public static WebDriver driver;

    @BeforeClass
    public void launchingChromeBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    public void waitForElement(WebDriver driver, WebElement element) {
        try {

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOf(element));
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("The element is not visible");
        }
    }

    public void captureScreenshot(String MethodName) throws IOException
    {
        System.out.println("Trying to get screenshot for failed case");
       TakesScreenshot ts = ((TakesScreenshot) driver);
       File src = ts.getScreenshotAs(OutputType.FILE);
       File trg = new File("C:\\Users\\uruku\\IdeaProjects\\Automation\\Screenshots\\Fail1.png");
       FileUtils.copyFile(src, trg);
       System.out.println(MethodName);
    }
}
