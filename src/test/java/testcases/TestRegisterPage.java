package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegistrationPage;
import utilities.DriverSetUp;

public class TestRegisterPage extends DriverSetUp {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    @Test
    public void testUserRegistration(){
        getDriver().get(homePage.baseUrl);
        homePage.clickOnElement(homePage.loginOrRegister);

        registrationPage.userRegister();
        //Assert.assertEquals(registrationPage.getElementText(registrationPage.registrationSuccess_Msg),registrationPage.successRegistrationText);
        Assert.assertEquals(getDriver().getCurrentUrl(),registrationPage.registerUrl);
        Assert.assertEquals(registrationPage.getElementText(registrationPage.usedEmail),registrationPage.usedEmailText);
    }

    @Test
    public void testRegistrationPage(){
        getDriver().get(registrationPage.registerUrl);

        Assert.assertTrue(registrationPage.isElementVisible(registrationPage.registerButton));
        Assert.assertEquals(getDriver().getTitle(),registrationPage.registerTitle);
    }
}
