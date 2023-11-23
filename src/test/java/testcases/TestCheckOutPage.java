package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.CheckOutPage;
import pages.LoginPage;
import utilities.DriverSetUp;

public class TestCheckOutPage extends DriverSetUp {
    CheckOutPage checkOutPage = new CheckOutPage();
    LoginPage loginPage = new LoginPage();

    @BeforeMethod
    public void userLoginWithValid(){
        getDriver().get(loginPage.loginUrl);
        loginPage.userLogin("polokhack1234@gmail.com","12345678");
    }


    @Test
    public void testUserCheckOutDetails()  {
       //getDriver().get(checkOutPage.writerPageUrl);
       checkOutPage.selectAuthor();
       checkOutPage.userBilling();

        Assert.assertEquals(checkOutPage.getElementText(checkOutPage.successfulOder_Msg),checkOutPage.successfulOrder_Text);

    }

}
