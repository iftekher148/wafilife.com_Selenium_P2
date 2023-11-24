package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    public String loginUrl = "https://www.wafilife.com/my-account";
    public String loginTitle = "আমার অ্যাকাউন্ট";
    public By userNameOrEmail = By.xpath("//input[@id='username']");
    public  By userLoginPassword = By.xpath("//input[@id='password']");
    public By login_Button = By.xpath("//input[@name='login']");
    public By loginSuccess_Msg = By.xpath("//strong[1]");
    public String loginSuccess_Text = "polokhack1234";
    public By loginError = By.xpath("//ul[@class='woocommerce-error']");

     public void userLogin(String userEmail, String userPassword){
         writeOnElement(userNameOrEmail,userEmail);
         writeOnElement(userLoginPassword,userPassword);
         clickOnElement(login_Button);
     }
}
