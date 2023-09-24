package StepDefinitions;


import Utilities.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.w3c.dom.DOMConfiguration;
import pom.loginPagePF;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class loginPageUsingConfigFile extends BaseClass {

    //WebDriver driver;
    loginPagePF lppf;
    Properties prop;

    Logger log= LogManager.getLogger(loginPageUsingConfigFile.class);


//launching browser us already their in base class writtten in @before class so no need to initialse here
    @Test(priority = 1)
    @Given("Navigate to  login page")

    public void navigate_to_login_page() throws InterruptedException {
     //   launchChromeBrowser();
            log.info("This is Login page");
        lppf = new loginPagePF(driver);
        lppf.on_loginPage();


    }
//String string, String string2
//    @Test(priority = 2)
//    @Given("User enter email and password")
//    public void user_enter_and() throws IOException {
////        System.out.println(string);
////        System.out.println(string2);
//        prop = new Properties();
//        FileInputStream fis = new
//                FileInputStream("C:\\Users\\uruku\\IdeaProjects\\Automation\\src\\test\\resources\\configFile");
//        prop.load(fis);
//        lppf.enter_lp_email(prop.getProperty("email"));
//        lppf.enter_lp_password(prop.getProperty("password"));
//    }
//
//    @Test(priority = 3)
//    @When("User click  sign in button")
//    public void user_click_sign_in_button() {
//        lppf.click_lp_loginBtn();
//    }
//
//    @Test(priority = 4)
//    @Then("User should be able to navigate login page")
//    public void user_should_be_able_to_navigate_login_page() {
//        System.out.println("j");
//
//
//    }

//    @AfterTest
//    public void closingBrowser() {
//        System.out.println("close");
//        lppf.Teardown();
//    }


}
