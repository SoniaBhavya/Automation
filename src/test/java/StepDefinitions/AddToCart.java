package StepDefinitions;

import Utilities.BaseClass;
import Utilities.excelUtil;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom.HomePagePF;
import pom.loginPagePF;
import pom.performanceFabricsPagePF;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class AddToCart extends BaseClass {
    loginPagePF lppf;
    HomePagePF hppf;
    performanceFabricsPagePF pppf;


    @BeforeClass
    public void prerequiste() throws IOException {
        lppf = new loginPagePF(driver);
        lppf.on_loginPage();

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/test/resources/configFile");
        prop.load(fis);
        lppf.enter_lp_email(prop.getProperty("email"));
        lppf.enter_lp_password(prop.getProperty("password"));

        lppf.click_lp_loginBtn();
        lppf.enter_myAccount();
        lppf.click_LogoToNavigateFromApToHomePage();
        hppf = new HomePagePF(driver);
        pppf=new performanceFabricsPagePF(driver);
    }

    @Test(priority = 1)
    @Given("User is on home page")
    public void user_is_on_home_page() {

        // hppf = new HomePagePF(driver);
        hppf.Enter_Hp_OnHomePage();


    }

    @Test(priority = 2)
    @When("Click on any required image")
    public void click_on_any_required_image() throws InterruptedException, AWTException {
        hppf.click_Hp_SelectOneImage();
    }
    @Test(priority = 3)
    @When("verify user is redirected to the new tab")
    public void verify_user_is_redirected_to_the_new_tab() {
        hppf.enter_validationToNavigateFromHpToPerformanceFabrics();

    }

    @Test(priority = 4)
    @When("User selects list view")
    public void user_selects_list_view() {
        pppf.select_Pp_listView();
    }

    @Test(priority = 5)
    @When("User navigates to last page and select one product")
    public void user_navigates_to_last_page_and_select_one_product() throws InterruptedException {
        pppf.select_Pp_nextPage();
    }

    @Test(priority = 6)
    @When("User Sort by with Product Name")
    public void user_sort_by_with_product_name() {
        pppf.select_Pp_sortBy();

    }
    @Test(priority = 7)
    @When("User Select colour black in  Shopping options")
    public void user_select_colour_black_in_shopping_options() {
        pppf.select_Pp_shoppingOptionColour();
    }



    @Test(priority = 8)
    @When("User click on Add to cart")
    public void user_click_on_add_to_cart() {
pppf.Select_Pp_firstImage();
pppf.enter_Pp_listViewOfFirstImage();
pppf.click_Pp_clickAddToCartOnListView();

    }
    @Test(priority = 9)
    @Then("User should be able to add product in cart")
    public void user_should_be_able_to_add_product_in_cart() {
        pppf.enter_Pp_myCartButton();
        pppf.enter_Pp_proceedToCheckoutButton();
        pppf.enter_Pp_validationFromPptoCheckout();
    }

}
