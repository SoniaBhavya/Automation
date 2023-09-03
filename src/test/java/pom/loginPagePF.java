package pom;

import Utilities.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class loginPagePF {
    //   public class loginPagePF extends BaseClass {

    WebDriver driver;

    @FindBy(id = "email")
    WebElement ele_lp_email;

    @FindBy(name = "login[password]")
    WebElement ele_lp_password;

    @FindBy(xpath = "(//*[@id=\"send2\"])[1]")
    WebElement ele_lp_loginbtn;

    @FindBy(xpath = "(//*[text()='My Account'])[4]")
    WebElement ele_myAccount;

    @FindBy(xpath = "//a[@class='logo']")
    WebElement ele_LogoToNavigateFromApToHomePage;

    public loginPagePF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void on_loginPage() {
        driver.get("https://magento.softwaretestingboard.com/customer/account/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        String actualtitle = driver.getTitle();
        String exptitle = "Customer Login";

        if (actualtitle.equals(exptitle)) {
            System.out.println("user is on login page");
        } else {
            System.out.println("user is not on login page");
            driver.close();
        }

    }
//    Actions act=new Actions(driver);
//       act.moveToElement(ele_Hp_SelectOneImage).
//    keyDown(Keys.LEFT_CONTROL).keyDown(Keys.LEFT_SHIFT).click(ele_Hp_SelectOneImage)
//               .keyUp(Keys.LEFT_CONTROL).keyUp(Keys.LEFT_SHIFT).build().perform();

    public void enter_lp_email(String email) {

        ele_lp_email.sendKeys(email);
    }

    public void enter_lp_password(String pass) {
        ele_lp_password.sendKeys(pass);
    }

    public void click_lp_loginBtn() {
        // waitForElement(driver, ele_lp_loginbtn);
        ele_lp_loginbtn.click();
    }

    public void enter_myAccount() {
        boolean MyAccountDisplay = ele_myAccount.isDisplayed();
        if (MyAccountDisplay == true) {
            System.out.println("Im Logged into App & on Account Page");
        } else {
            System.out.println("User failed to login to the page");
        }

    }
    public void click_LogoToNavigateFromApToHomePage()
    {
       ele_LogoToNavigateFromApToHomePage.click();
    }

    public void Teardown() {
        driver.quit();
    }
}





