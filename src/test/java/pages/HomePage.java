package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
    public String baseUrl = "https://www.wafilife.com/";
    public String homePageTitle = "Buy Islamic Books - Online Book Shop in Bangladesh | Wafilife";
    public By loginOrRegister = By.xpath("//a[@title='আমার অ্যাকাউন্ট']");
    public By bookFairBook = By.xpath("//h3[contains(text(),'বইমেলা ২০২৩ এর নতুন বই')]");
    public String bookFairBookText = "বইমেলা ২০২৩ এর নতুন বই";

}
