package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.DataSet;
import utilities.DriverSetUp;

public class TestLoginPage extends DriverSetUp {
    LoginPage loginPage = new LoginPage();
    @BeforeMethod
    public void navigateToRegistrationPage(){
        getDriver().get(loginPage.loginUrl);
    }

    @Test
    public void testLoginWithValidCredentials(){
       // getDriver().get(loginPage.loginUrl);
        loginPage.userLogin("polokhack1234@gmail.com","12345678");
        Assert.assertEquals(getDriver().getCurrentUrl(),loginPage.loginUrl);
        Assert.assertEquals(loginPage.getElementText(loginPage.loginSuccess_Msg),loginPage.loginSuccess_Text);
    }
    @Test(dataProvider = "invalidCredentials", dataProviderClass = DataSet.class)
    public void testLoginWithInvalidCredentials(String email, String password, String error_msg){
        getDriver().get(loginPage.loginUrl);
        loginPage.writeOnElement(loginPage.userNameOrEmail,email);
        loginPage.writeOnElement(loginPage.userLoginPassword,password);
        loginPage.clickOnElement(loginPage.login_Button);

        Assert.assertEquals(getDriver().getTitle(),loginPage.loginTitle);
        Assert.assertEquals(loginPage.getElementText(loginPage.loginError),error_msg);
    }

}
