package StepDefinitions;


import Utilities.excelUtil;
import io.cucumber.java.en.*;
;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.loginPagePF;



public class loginPageusingutilityFileExcel {
WebDriver driver;
    loginPagePF lppf;
    excelUtil eu;
    String filepath="src\\test\\resources\\utilityFile.xlsx";


    public void launchingChromeBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(3000);
        lppf=new loginPagePF(driver);

    }

    @Given("Navigate to the  login page")
    public void navigate_to_the_login_page() throws InterruptedException {
        launchingChromeBrowser();
       lppf.on_loginPage();
    }


        @Given("User enters email and password")
        public void user_enters_email_and_password() {

         eu=new excelUtil(filepath);
            String Email = eu.readExcel("Sheet1", "email");
            lppf.enter_lp_email(Email);

            String password = eu.readExcel("Sheet1", "password");
      lppf.enter_lp_password(password);
    }

    @When("User clicks  sign in button")
    public void user_clicks_sign_in_button() {
       lppf.click_lp_loginBtn();
    }

    @Then("User should be able to navigate to login page")
    public void user_should_be_able_to_navigate_to_login_page() {
        System.out.println("utilityFileExcel");
    }


}
