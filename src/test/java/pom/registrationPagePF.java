package pom;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.PageFactory.initElements;

public class registrationPagePF {

    WebDriver driver;

    @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/ul/li[3]/a")
    WebElement ele_clickCreateAccountHP;

    @FindBy(id="firstname")
    WebElement ele_firstNameRP;

    @FindBy(id="lastname")
    WebElement ele_lastNameRP;

    @FindBy(id="email_address")
    WebElement ele_emailAddressRP;

    @FindBy(id="password")
    WebElement ele_passwordRP;

    @FindBy(id="password-confirmation")
    WebElement ele_passwordConfirmationRP;

    @FindBy(xpath="//*[@title='Create an Account']")
    WebElement ele_logInBtn;



    public registrationPagePF(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    public void on_HomePage() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        Thread.sleep(3000);
        String title = driver.getTitle();
        System.out.println(title);
        if (title.equals("Home Page")) {
            System.out.println("User is on Home Page");
        } else {
            System.out.println("User is not on Home Page");
            driver.quit();
        }
    }

    public void enter_clickCreateAccountHP() {

        ele_clickCreateAccountHP.click();
        String aurl = driver.getCurrentUrl();
        String eurl = "https://magento.softwaretestingboard.com/customer/account/create/";
        if (aurl.equals(eurl)) {
            System.out.println("User is on registration page");
        } else {
            System.out.println("User is not on registration page");
            driver.close();
        }
    }


    public void enter_firstNameRP() {
        ele_firstNameRP.sendKeys("TestFN");
    }


    public void enter_lastNameRP() {
        ele_lastNameRP.sendKeys("TestLN");
    }

//
//    public void enter_isSubscribedRP() {
//        driver.findElement(ele_isSubscribedRP).click();
//    }


    public void enter_emailAddressRP() {
       ele_emailAddressRP.sendKeys("Test1.kl@gmail.com");
    }


    public void enter_passwordRP() {
        String pass=System.getProperty("password");
        ele_passwordRP.sendKeys(pass);
    }


    public void enter_passwordConfirmationRP() {
       ele_passwordConfirmationRP.sendKeys("Test@123");

    }

    public void enter_logInBtn() {
       ele_logInBtn.click();
    }

}

