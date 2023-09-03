package StepDefinitions;
//import io.cucumber.datatable.DataTable;

import Utilities.BaseClass;
import Utilities.DataProviderClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pom.loginPagePF;

import java.io.File;
import java.io.IOException;

@Listeners(Utilities.ListenerTest.class)
public class loginPageParamitizationUsingDataProvider extends BaseClass {

    loginPagePF lppf;

//launching browser us already their in base class writtten in @before class so no need to initialse here
    @Test(priority = 1)
    @Given("Navigate to the login page")
    public void navigate_to_the_login_page() {
        System.out.println("1");
//        launchingChromeBrowser();
        lppf = new loginPagePF(driver);
        lppf.on_loginPage();

    }

    @Test(priority = 2, dataProvider = "SearchProvider", dataProviderClass = DataProviderClass.class)
    @Given("User enters {string} and {string}")
    public void user_enters_and(String Email, String Password) throws IOException {
        System.out.println(Email);
        System.out.println(Password);
        lppf.enter_lp_email(Email);
        lppf.enter_lp_password(Password);

    }

    @Test(priority = 3)
    @When("Users click on sign in button")
    public void users_click_on_sign_in_button() {
        //  public void users_click_on_sign_in_button(DataTable table) {
//        System.out.println(table.asMap().get("param1"));
//        for(Map.Entry<String,String> map:table.asMap().entrySet()){
//            System.out.println(map.getKey() +"------>"+map.getValue());
//        }
        System.out.println("3");
        lppf.click_lp_loginBtn();
    }

    @Test(priority = 4)
    @Then("User should be able to login page")
    public void user_should_be_able_to_login_page() {
        System.out.println("4");
        lppf.enter_myAccount();
        lppf.click_LogoToNavigateFromApToHomePage();
    }

    @AfterTest
    public void teardown() {
        System.out.println("5");
        lppf.Teardown();
    }

}

