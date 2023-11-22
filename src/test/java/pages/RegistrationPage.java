package pages;

import org.openqa.selenium.By;

public class RegistrationPage extends BasePage {
    public String registerUrl = "https://www.wafilife.com/my-account";
    public String registerTitle = "আমার অ্যাকাউন্ট";
    public By name = By.xpath("//input[@id='reg_billing_first_name']");
    public By phoneNumber = By.xpath("//input[@id='reg_billing_phone']");
    public By email= By.xpath("//input[@id='reg_email']");
    public By password = By.xpath("//input[@id='reg_password']");
    public By confirmPassword = By.xpath("//input[@id='reg_confirm_password']");
    public By registerButton = By.xpath("//input[@name='register']");
    public By usedEmail = By.xpath("//li[contains(text(),'এই ইমেইল অ্যাড্রেস দিয়ে ইতিমধ্যে একটি অ্যাকাউন্ট খ')]");
    public String usedEmailText = "Error: এই ইমেইল অ্যাড্রেস দিয়ে ইতিমধ্যে একটি অ্যাকাউন্ট খোলা হয়েছে। অনুগ্রহ করে নতুন ইমেইল অ্যাড্রেস ব্যবহার করুন অথবা লগইন করুন";
    public void userRegister(){
        writeOnElement(name,"Polok Ahmed");
        writeOnElement(phoneNumber,"01835385018");
        writeOnElement(email,"polokhack1234@gmail.com");
        writeOnElement(password,"12345678");
        writeOnElement(confirmPassword,"12345678");
        clickOnElement(registerButton);
    }

}
