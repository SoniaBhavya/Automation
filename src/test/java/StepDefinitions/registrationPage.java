package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.registrationPagePF;


public class registrationPage {

    static  WebDriver driver;
   // registrationPagePOM rPPOM;
    registrationPagePF rppf;


    public void launchingChromeBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //rPPOM= new registrationPagePOM(driver);
        rppf=new registrationPagePF(driver);
    }


    @Given("User is on the luma web application")
    public void user_is_on_the_luma_web_application() throws InterruptedException {

        //driver = rPPOM.getDriver();

        launchingChromeBrowser();
      //  rPPOM.on_HomePage();
        rppf.on_HomePage();
    }

    @Given("Click Create an Account on home page")
    public void click_create_an_account_on_home_page() throws InterruptedException {
      //  rPPOM.enter_clickCreateAccountHP();
        rppf.enter_clickCreateAccountHP();

    }

    @Given("User enters all the valid details")
    public void user_enters_all_the_valid_details() {
//        rPPOM.enter_firstNameRP();
//        rPPOM.enter_lastNameRP();
//        rPPOM.enter_emailAddressRP();
//        rPPOM.enter_passwordRP();
//        rPPOM.enter_passwordConfirmationRP();
        rppf.enter_firstNameRP();
        rppf.enter_lastNameRP();
        rppf.enter_emailAddressRP();
        rppf.enter_passwordRP();
        rppf.enter_passwordConfirmationRP();
    }

    @When("User submits the details")
    public void user_submits_the_details() {
      //  rPPOM.enter_logInBtn();
        rppf.enter_logInBtn();
    }

    @Then("User should be able to create an account in luma")
    public void user_should_be_able_to_create_an_account_in_luma() {
        System.out.println("Hello");

    }


}
