package pom;

import Utilities.excelUtil;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import static java.awt.SystemColor.window;

public class performanceFabricsPagePF {
    WebDriver driver;
    String filepath="src/test/resources/utilityFile.xlsx";
    @FindBy(xpath ="(//*[@title=\"List\"])[1]")
    WebElement ele_Pp_listView;

    @FindBy(xpath = "//*[@id=\"narrow-by-list\"]/div[5]/div[1]")
    WebElement ele_Pp_shoppingOptionColour;

    @FindBy(xpath = "(//*[@id=\"sorter\"])[1]")
    WebElement ele_Pp_sortBy;

    @FindBy(xpath="(//*[@class=\"action  next\"])[2]")
    WebElement ele_Pp_nextPage;

    @FindBy(xpath = "(//*[@class=\"swatch-attribute-options clearfix\"]/a[1]/div[1])[2]")
    WebElement ele_Pp_shoppingOptionColourBlack;
    @FindBy(xpath = "(//*[@class=\"product-item-info\"]/a[1])[1]")
    WebElement ele_Pp_firstImage;

    @FindBy(xpath="//*[text()='Add to Wish List']")
    WebElement ele_Pp_validationFromPpToListViewOfFirstImage;

    @FindBy(xpath = "//*[@id=\"product-addtocart-button\"]")
    WebElement ele_Pp_clickAddToCartOnListView;
    @FindBy(xpath = "(//*[text()='28'])[1]")
    WebElement ele_Pp_size;
    @FindBy(xpath = "//*[@id=\"option-label-color-93-item-49\"]")
    WebElement ele_Pp_colour;

    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div[1]/a")
    WebElement ele_Pp_myCartButton;
    @FindBy(xpath = "//button[text()='Proceed to Checkout']")
    WebElement ele_Pp_proceedToCheckoutButton;
    @FindBy(xpath = "//*[text()='Shipping Address']")
    WebElement ele_Pp_validationFromPptoCheckout;



    public performanceFabricsPagePF(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void select_Pp_listView()
    {
        ele_Pp_listView.click();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        System.out.println("listed view");
    }

    public void select_Pp_sortBy()
    {
        Select sel=new Select(ele_Pp_sortBy);

        excelUtil eu=new excelUtil(filepath);
        String sort_By = eu.readExcel("sheet2", "Sort By");
        System.out.println(sort_By);
        if(sort_By.equals("Position"))
        {
            sel.selectByValue("position");
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            System.out.println("Sorted By Position");
        } else if (sort_By.equals("Product Name"))
        {
            sel.selectByIndex(1);
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            System.out.println("Sorted by Product Name");
        }else
        {
            sel.selectByVisibleText("Price");
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            System.out.println("Sorted By Price");
        }



    }
    public void select_Pp_shoppingOptionColour()
    {

        Actions act=new Actions(driver);
        act.moveToElement(ele_Pp_shoppingOptionColour).click(ele_Pp_shoppingOptionColour).pause(Duration.ofSeconds(5))
                .click(ele_Pp_shoppingOptionColourBlack).build().perform();
        System.out.println("black sorted");
    }

    public void select_Pp_nextPage() throws InterruptedException {

//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        js.executeScript("Arguments[0].scrollIntoView();", ele_Pp_nextPage);
        ele_Pp_nextPage.click();
        Thread.sleep(3000);
        ele_Pp_nextPage.click();
        System.out.println("on last page");

    }
    public void Select_Pp_firstImage()
    {

        Actions act=new Actions(driver);
        act.moveToElement(ele_Pp_firstImage).keyDown(Keys.LEFT_CONTROL).click(ele_Pp_firstImage).keyUp(Keys.LEFT_CONTROL).build().perform();
        String ParentWindow=driver.getWindowHandle();
        Set<String> AllWindows=driver.getWindowHandles();
        Iterator<String> itr=AllWindows.iterator();
        while (itr.hasNext())
        {
            String childWindow=itr.next();
            if(!ParentWindow.equalsIgnoreCase(childWindow))
            {
                driver.switchTo().window(childWindow);
                System.out.println("In child window");
            }
        }

    }
    public void click_Pp_clickAddToCartOnListView()
    {
        ele_Pp_size.click();
        ele_Pp_colour.click();
        ele_Pp_clickAddToCartOnListView.click();
    }
    public void enter_Pp_listViewOfFirstImage()
    {
        Boolean va=ele_Pp_validationFromPpToListViewOfFirstImage.isDisplayed();
        System.out.println(va);
        if(va.equals(true))
        {
            System.out.println("In ListView Of First Image");
        }else
        {
            System.out.println("Not in ListView Of First Image");
        }
    }
    public  void enter_Pp_myCartButton()
    {
        ele_Pp_myCartButton.click();

    }
    public  void enter_Pp_proceedToCheckoutButton()
    {

        ele_Pp_proceedToCheckoutButton.click();
    }
    public void enter_Pp_validationFromPptoCheckout()
    {
       Boolean va= ele_Pp_validationFromPptoCheckout.isDisplayed();
       if(va.equals(true))
       {
           System.out.println("On Checkout Page");
       }else
       {
           System.out.println("Not On Checkout Page");
       }
    }
}
