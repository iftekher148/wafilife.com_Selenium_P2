package testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LogOutPage;
import pages.LoginPage;
import utilities.DriverSetUp;

public class TestLogoutPage extends DriverSetUp {
    LogOutPage logOutPage = new LogOutPage();
    LoginPage loginPage = new LoginPage();

    @BeforeMethod
    public void userLoginWithValid(){
        getDriver().get(loginPage.loginUrl);
        loginPage.userLogin("polokhack1234@gmail.com","12345678");
    }
    @Test
    public void testLogout(){
       getDriver().get(logOutPage.logOutUrl);
       logOutPage.clickOnElement(logOutPage.logOut);
    }
}
