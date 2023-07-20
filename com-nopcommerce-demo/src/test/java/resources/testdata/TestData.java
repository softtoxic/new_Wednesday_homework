package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Jay Vaghani
 */
public class TestData {

    @DataProvider(name = "processor")
    public Object[][] getProcessor(){
        Object[][] data = new Object[][]{
                {"2.2 GHz Intel Pentium Dual-Core E2200"},
                {"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]"},
        };
        return data;
    }

}
