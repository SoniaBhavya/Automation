package pom;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.collections.Sets;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class HomePagePF {

    WebDriver driver;
    @FindBy(xpath = "//div[@class=\"block-promo-wrapper block-promo-hp\"]/a[4]")
    WebElement ele_Hp_SelectOneImage;
    @FindBy(xpath="//span[@data-ui-id=\"page-title-wrapper\"]")
    WebElement ele_validationToNavigateFromHpToPerformanceFabrics;


    public HomePagePF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Enter_Hp_OnHomePage() {

        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Home Page";
        if (ActualTitle.equals(ExpectedTitle)) {
            System.out.println("User is on Home Page");
        } else {
            System.out.println("User is not on Home Page");
            driver.quit();
        }
    }

    public void click_Hp_SelectOneImage() throws InterruptedException, AWTException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1250)");
        Thread.sleep(4000);

        Actions act = new Actions(driver);
        act.moveToElement(ele_Hp_SelectOneImage).keyDown(Keys.LEFT_CONTROL).click(ele_Hp_SelectOneImage)
                .keyUp(Keys.LEFT_CONTROL).build().perform();
        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);
        Set<String> AllWindows = driver.getWindowHandles();
        System.out.println(AllWindows);
        Iterator<String> itr = AllWindows.iterator();


        while (itr.hasNext()) {
            String childWindow = itr.next();

            if (!parentWindow.equalsIgnoreCase(childWindow)) {
                driver.switchTo().window(childWindow);
               // driver.findElement(By.xpath("(//*[@id='mode-list'])[1]")).click();
                System.out.println("In child window");
            }

        }
    }


    public void enter_validationToNavigateFromHpToPerformanceFabrics()
    {
       Boolean Actualval =ele_validationToNavigateFromHpToPerformanceFabrics.isDisplayed();
       if(Actualval==true)
       {
           System.out.println("Validated & redirected from Home page to PerformanceFabrics page");
       }
       else {
           System.out.println("NOt Validated & redirected from Home page to PerformanceFabrics page");
           driver.quit();
       }
    }
}