package resources.testdata;

import org.testng.annotations.DataProvider;


public class TestData {
 @DataProvider(name = "CV Test")
 public Object[][] getData() {
  Object[][] data = new Object[][]{
          {"Engineer", "Manchester", "10 miles", "30000", "50000", "Per annum",
                  "Permanent","Permanent Engineer jobs in Manchester"},

          {"Teacher", "Wembley", "15 miles", "20000", "50000", "Per annum",
                  "Permanent","Permanent Teacher jobs in Wembley"},

          {"Plumber", "Bedfordshire", "35 miles", "35000", "70000", "Per annum",
                  "Permanent","Permanent Plumber jobs in Bedfordshire"},

          {"Developer", "Leicester", "25 miles", "30000", "70000", "Per annum",
                  "Permanent","Permanent Developer jobs in Leicester"},

          {"Tester", "Luton", "50 miles", "30000", "70000", "Per annum",
                  "Permanent","Permanent Tester jobs in Luton"},

          {"Tester", "Manchester", "75 miles", "40000", "70000", "Per annum",
                  "Permanent","Permanent Tester jobs in Manchester"}
  };
  return data;
 }
}
