package pages;

import org.openqa.selenium.By;

public class LogOutPage extends BasePage{
    public String logOutUrl = "https://www.wafilife.com/my-account";
    public By logOut = By.xpath("//a[contains(text(),'লগআউট')]");
}
