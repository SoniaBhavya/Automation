package StepDefinitions;

import Utilities.BaseClass;
import Utilities.excelUtil;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom.*;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class checkOut extends BaseClass {
    loginPagePF lppf;
    HomePagePF hppf;
    performanceFabricsPagePF pppf;
    checkOutPagePF cppf;
   String filepath="C:\\Users\\uruku\\IdeaProjects\\Automation\\src\\test\\resources\\utilityFile.xlsx";

    @BeforeClass
    public void prerequisite() throws IOException, InterruptedException, AWTException {

//         lppf=new loginPagePF(driver);
//         lppf.on_loginPage();
//        Properties prop=new Properties();
//        FileInputStream fis=new FileInputStream("src/test/resources/configFile");
//        prop.load(fis);
//         lppf.enter_lp_email(prop.getProperty("email"));
//         lppf.enter_lp_password(prop.getProperty("password"));
//         lppf.click_lp_loginBtn();
//         lppf.enter_myAccount();
//         lppf.click_LogoToNavigateFromApToHomePage();
//        hppf =new HomePagePF(driver);
//        hppf.Enter_Hp_OnHomePage();
//        hppf.click_Hp_SelectOneImage();
//        hppf.enter_validationToNavigateFromHpToPerformanceFabrics();
        pppf =new performanceFabricsPagePF(driver);
//        pppf.select_Pp_listView();
//        pppf.select_Pp_nextPage();
//        pppf.select_Pp_sortBy();
//
//        pppf.select_Pp_shoppingOptionColour();
//        pppf.Select_Pp_firstImage();



        driver.get("https://magento.softwaretestingboard.com/aeon-capri.html");
        pppf.enter_Pp_listViewOfFirstImage();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        pppf.click_Pp_clickAddToCartOnListView();
        Thread.sleep(6000);
        pppf.enter_Pp_myCartButton();
        Thread.sleep(6000);
        pppf.enter_Pp_proceedToCheckoutButton();
        Thread.sleep(6000);
        pppf.enter_Pp_validationFromPptoCheckout();
        cppf =new checkOutPagePF(driver);


    }
    @Test(priority = 0)
    @Given("Product is selcted and add to cart")
    public void product_is_selcted_and_add_to_cart() {
        System.out.println("1");

    }
    @Test(priority = 1)
    @When("User fills the shipping address")
    public void user_fills_the_shipping_address() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        excelUtil eu=new excelUtil(filepath);
     String fn= eu.readExcel("Sheet3", "FirstName");
        System.out.println(fn);
      String ln= eu.readExcel("Sheet3", "LastName");
        System.out.println(ln);
      cppf.enter_co_Name(fn,ln);

       String company= eu.readExcel("Sheet3", "Company");
        cppf.enter_co_Company(company);

        String Street1= eu.readExcel("Sheet3", "Street1");
        String Street2= eu.readExcel("Sheet3", "Street2");
        String Street3= eu.readExcel("Sheet3", "Street3");
        cppf.enter_co_Street(Street1,Street2,Street3);

       String City= eu.readExcel("Sheet3", "City");
       cppf.enter_co_City(City);
        String State= eu.readExcel("Sheet3", "State");
        cppf.enter_co_State(State);
        String Zip= eu.readExcel("Sheet3", "Zip");
        cppf.enter_co_Zip(Zip);
        String Country= eu.readExcel("Sheet3", "Country");
        cppf.enter_co_Country(Country);
        String Phone=  eu.readExcel("Sheet3", "Phone");
        cppf.enter_co_phone(Phone);
        cppf.enter_co_tableRateRadioButton();
        cppf.enter_co_NextButton();




    }
    @When("User makes Payment")
    public void user_makes_payment() {

    }
    @Then("User should be able to checkout Product")
    public void user_should_be_able_to_checkout_product() {

    }

}
