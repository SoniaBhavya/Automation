//package StepDefinitions;
//import Utilities.excelUtil1;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import pom.loginPagePF;
//
//;import java.io.IOException;
//
//public class loginPageusingutilityFileExcel1 extends excelUtil1 {
//WebDriver driver;
//    loginPagePF lppf;
//    //excelUtil eu;
//    String filepath="src\\test\\resources\\utilityFile.xlsx";
//
////    public loginPageusingutilityFileExcel1(String filepath) {
////        super(filepath);
////    }
//
//
//    public void launchingChromeBrowser() throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        Thread.sleep(3000);
//        lppf=new loginPagePF(driver);
//
//    }
//
//    @Given("Navigate to the  login page")
//    public void navigate_to_the_login_page() throws InterruptedException {
//        launchingChromeBrowser();
//       lppf.on_loginPage();
//    }
//
//
//        @Given("User enters email and password")
//        public void user_enters_email_and_password() throws IOException {
//
//        // eu=new excelUtil(filepath);
//           // eu=new excelUtil(filepath);
//            String Email = readExcel(filepath, "Sheet1", "email");
//            lppf.enter_lp_email(Email);
//
//            String password = readExcel(filepath,"Sheet1", "password");
//      lppf.enter_lp_password(password);
//    }
//
//    @When("User clicks  sign in button")
//    public void user_clicks_sign_in_button() {
//       lppf.click_lp_loginbtn();
//    }
//
//    @Then("User should be able to navigate to login page")
//    public void user_should_be_able_to_navigate_to_login_page() {
//        System.out.println("utilityFileExcel");
//    }
//
//
//}
