package pages;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static utilities.DriverSetUp.getDriver;

public class NewPractice extends BasePage{
    LoginPage loginPage= new LoginPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    @BeforeMethod
    public void myClass(){
        //https://www.wafilife.com/my-account
        getDriver().get(loginPage.loginUrl);
        loginPage.userLogin("polokhack1234@gmail.com","12345678");
    }
    @Test
    public void testAuthor(){
        //checkOutPage.selectAuthor();
//        public By writer = By.xpath("//span[contains(text(),'লেখক')]");
//        public By scrollToThisElement = By.xpath("//a[normalize-space()='2']");
//        public By nextPage = By.xpath("//a[normalize-space()='4']");
//        public By findWriter = By.xpath("//a[@href='/cat/books/author/']");
//        public By selectWriter = By.xpath("//h3[normalize-space()='M. Mirjahan']");
//        public By selectBook = By.xpath("//div[@class='product_thumbnail_wrapper']//a");
//        public By clickOnOrderButton = By.xpath("//div[@class='body-wrapper']//button[2]");
//        public By completeOrder = By.xpath("//span[contains(text(),'অর্ডার সম্পন্ন করুন')]");

    }
}
