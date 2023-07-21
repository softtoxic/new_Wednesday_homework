package uk.co.library.testsuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestData;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.BaseTest;

@Listeners(CustomListeners.class)
public class JobSearchTest extends BaseTest {

    HomePage homePage;
    ResultPage resultPage;

    SoftAssert softAssert = new SoftAssert();

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        resultPage = new ResultPage();
    }

    @Test(dataProvider = "CV Test", dataProviderClass = TestData.class, groups = {"smoke", "regression"})
    public void verifyJobSearchResultUsingDifferentDataSet
            (String jobTitle, String location, String distance, String salaryMin,
             String salaryMax, String salaryType, String jobType, String result) throws InterruptedException {
        Thread.sleep(1000);
        homePage.acceptCookies();
        Thread.sleep(1000);
        homePage.enterJobTitle(jobTitle);
        Thread.sleep(1000);
        homePage.enterLocation(location);
        Thread.sleep(1000);
        homePage.selectDistance(distance);
        Thread.sleep(1000);
        homePage.clickOnMoreSearchOption();
        Thread.sleep(1000);
        homePage.enterMinSalary(salaryMin);
        Thread.sleep(1000);
        homePage.enterMaxSalary(salaryMax);
        Thread.sleep(1000);
        homePage.selectSalaryType(salaryType);
        Thread.sleep(1000);
        homePage.selectJobType(jobType);
        Thread.sleep(1000);
        homePage.clickOnFindJobsButton();
        Thread.sleep(1000);
        resultPage.verifyTheResults(result);

    }
}
