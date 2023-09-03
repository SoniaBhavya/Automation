//package StepDefinitions;
////import io.cucumber.datatable.DataTable;
//import io.cucumber.java.en.*;
//import io.cucumber.java.en.When;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import pom.loginPagePF;
//public class loginPageUsingParamitization {
//    WebDriver driver;
//    loginPagePF lppf;
////@BeforeClass
//    public void launchingChromeBrowser() throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        Thread.sleep(3000);
//         lppf=new loginPagePF(driver);
//    }
//
//    @Given("Navigate to the login page")
//    public void navigate_to_the_login_page() throws InterruptedException {
//        System.out.println("1");
//        launchingChromeBrowser();
//        lppf.on_loginPage();
//
//    }
////here @Test is not mentioned so we cannot run through Testng but we run through JUnit
//    @Given("User enters {string} and {string}")
//    public void user_enters_and(String Email, String Password)  {
//        System.out.println(Email);
//        System.out.println(Password);
//        lppf.enter_lp_email(Email);
//        lppf.enter_lp_password(Password);
//    }
//
//    @When("Users click on sign in button")
//    public void users_click_on_sign_in_button() {
//        //  public void users_click_on_sign_in_button(DataTable table) {
////        System.out.println(table.asMap().get("param1"));
////        for(Map.Entry<String,String> map:table.asMap().entrySet()){
////            System.out.println(map.getKey() +"------>"+map.getValue());
////        }
//        System.out.println("3");
//        lppf.click_lp_loginbtn();
//    }
//
//    @Then("User should be able to login page")
//    public void user_should_be_able_to_login_page() {
//        System.out.println("4");
//        //teardown();
//        driver.quit();
//    }
//  // @AfterClass
////    public void teardown()
////    {
////        driver.quit();
////    }
//
//}
//
