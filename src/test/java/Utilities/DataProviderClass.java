package Utilities;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

    @DataProvider(name = "SearchProvider")
    public static Object[][] getDataFromDataprovider(){
        return new Object[][]
                {
                        {"Test1.kl@gmail.com","Test@123"}
                };
    }

    }
