package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class checkOutPagePF {

    WebDriver driver;
    @FindBy(xpath = "//*[@class=\"input-text\" and @name=\"firstname\"]")
    WebElement ele_Hp_FirstName;

    @FindBy(xpath = "//*[@class=\"input-text\" and @name=\"lastname\"]")
    WebElement ele_Hp_LastName;

    @FindBy(xpath = "//*[@class=\"input-text\" and @name=\"company\"]")
    WebElement ele_Hp_Company;

    @FindBy(xpath = "//*[@class=\"input-text\" and @name=\"street[0]\"]")
    WebElement ele_Hp_Street1;

    @FindBy(xpath = "//*[@class=\"input-text\" and @name=\"street[1]\"]")
    WebElement ele_Hp_Street2;

    @FindBy(xpath = "//*[@class=\"input-text\" and @name=\"street[2]\"]")
    WebElement ele_Hp_Street3;
    ;

    @FindBy(xpath = "//*[@class=\"input-text\" and @name=\"city\"]")
    WebElement ele_Hp_City;

    @FindBy(xpath = "//*[@name=\"region_id\"]")
    WebElement ele_Hp_StateProvince;


    @FindBy(xpath = "//*[@name=\"postcode\"]")
    WebElement ele_Hp_ZipCode;

    @FindBy(xpath = "//*[@name=\"country_id\"]")
    WebElement ele_Hp_Country;


    @FindBy(xpath = "//*[@name=\"telephone\"]")
    WebElement ele_Hp_Telephone;

    @FindBy(xpath = "//*[@name=\"ko_unique_1\"]")
    WebElement ele_Hp_TableRateRadioButton;

    @FindBy(xpath = "//*[text()='Next']")
    WebElement ele_Hp_NextButton;

    public checkOutPagePF(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void enter_co_Name(String FirstName, String LastName)
    {
        ele_Hp_FirstName.clear();
        ele_Hp_FirstName.sendKeys(FirstName);

        ele_Hp_LastName.clear();
        ele_Hp_FirstName.sendKeys(LastName);
    }

    public void enter_co_Company(String company)
    {
        ele_Hp_Company.sendKeys(company);
    }

    public void enter_co_Street(String Street1, String Street2, String Street3)
    {
        ele_Hp_Street1.sendKeys(Street1);
        ele_Hp_Street2.sendKeys(Street2);
        ele_Hp_Street3.sendKeys(Street3);
    }

    public void enter_co_City(String City)
    {
        ele_Hp_City.sendKeys(City);
    }

    public  void enter_co_State(String State)
    {
        Select sel=new Select(ele_Hp_StateProvince);
        sel.selectByVisibleText("Alabama");
        if(sel.equals(State))
        {
            System.out.println("State is selected");
        }else
            System.out.println("State not selected");

    }
    public void enter_co_Zip(String zip)
    {
        ele_Hp_ZipCode.sendKeys(zip);
    }

    public void enter_co_Country(String country)
    {
        Select sel=new Select(ele_Hp_Country);
          sel.selectByVisibleText("Afghanistan");

        if(sel.equals(country))
        {
            System.out.println("Country is selected");
        }else
        {
            System.out.println("Country is selected");
        }
    }
    public void enter_co_phone(String phone)
    {
        ele_Hp_Telephone.sendKeys(phone);
    }
    public void enter_co_tableRateRadioButton()
    {
        ele_Hp_TableRateRadioButton.click();
    }
    public void enter_co_NextButton()
    {
        ele_Hp_NextButton.click();
    }
}
