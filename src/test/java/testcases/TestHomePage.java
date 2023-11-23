package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utilities.DriverSetUp;

public class TestHomePage extends DriverSetUp {
    HomePage homePage = new HomePage();

//    @BeforeMethod
//    public void navigateToHomePage(){
//        getDriver().get(homePage.baseUrl);
//    }

    @Test
    public void testHomePage(){
        getDriver().get(homePage.baseUrl);
        Assert.assertEquals(getDriver().getCurrentUrl(),homePage.baseUrl);
        Assert.assertEquals(getDriver().getTitle(),homePage.homePageTitle);
    }
    @Test
    public void testHomePageClickableUrl(){
        getDriver().get(homePage.baseUrl);
        Assert.assertTrue(homePage.isElementVisible(homePage.loginOrRegister));
        Assert.assertEquals(homePage.getElementText(homePage.bookFairBook),homePage.bookFairBookText);
    }
}
