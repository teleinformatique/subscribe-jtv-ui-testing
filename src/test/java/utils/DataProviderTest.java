package utils;

import org.testng.annotations.DataProvider;

public class DataProviderTest {

    @DataProvider(name="test-data-with-addon")
    public Object[][] getPlanDataWithAddon(){

        return new Object[][]{
                {"ma","lite","khadim@hldrive.com","N1uDeDkn#WcI","2.00","12.33"},
                {"ae","classic","test@hldrive.com","N1uDeDkn#WcI","10.90","21.23"},
                {"dz","premium","hello@hldrive.com","N1uDeDkn#WcI", "8.00","16,13"}
        };

    }

    @DataProvider(name="test-data-without-addon")
    public Object[][] getPlanDataWithoutAddon(){

        return new Object[][]{
                {"ma","lite","khadim@hldrive.com","N1uDeDkn#WcI","2.00","2.00"},
                {"ae","classic","test@hldrive.com","N1uDeDkn#WcI","10.90","10.90"},
                {"dz","premium","hello@hldrive.com","N1uDeDkn#WcI", "8.00","8.00"}
        };

    }
}
