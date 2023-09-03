package pom;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registrationPagePOM {

    WebDriver driver;
//    By ele_clickCreateAccountHP=By.xpath("(//a[text()='Create an Account'])[1]");
    By ele_clickCreateAccountHP = By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[3]/a");
    By ele_firstNameRP = By.id("firstname");
    By ele_lastNameRP = By.id("lastname");

  //  By ele_isSubscribedRP = By.name("is_subscribed");
    By ele_emailAddressRP = By.id("email_address");
    By ele_passwordRP = By.id("password");
    By ele_passwordConfirmationRP = By.id("password-confirmation");

    By ele_logInBtn=By.xpath("//*[@title='Create an Account']");


    public registrationPagePOM(WebDriver driver) {
//        WebDriverManager.chromedriver().setup();
//        this.driver = new ChromeDriver();
        this.driver=driver;
    }


//    public WebDriver getDriver() {
//        return this.driver;
//    }

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

        driver.findElement(ele_clickCreateAccountHP).click();
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
        driver.findElement(ele_firstNameRP).sendKeys("TestFN");
    }


    public void enter_lastNameRP() {
        driver.findElement(ele_lastNameRP).sendKeys("TestLN");
    }

//
//    public void enter_isSubscribedRP() {
//        driver.findElement(ele_isSubscribedRP).click();
//    }


    public void enter_emailAddressRP() {
        driver.findElement(ele_emailAddressRP).sendKeys("Test@gmail.com");
    }


    public void enter_passwordRP() {
        String pass = System.getProperty("password");
        driver.findElement(ele_passwordRP).sendKeys(pass);
    }


    public void enter_passwordConfirmationRP() {
        driver.findElement(ele_passwordConfirmationRP).sendKeys("Test@123");

    }

    public void enter_logInBtn() {
driver.findElement(ele_logInBtn).click();
        System.out.println("Clicked on Login button");
    }

}

