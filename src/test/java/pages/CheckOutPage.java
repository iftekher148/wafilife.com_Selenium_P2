package pages;

import org.openqa.selenium.By;

public class CheckOutPage extends BasePage{


    public String writerPageUrl = "https://www.wafilife.com/my-account/";
    public By writer = By.xpath("//span[contains(text(),'লেখক')]");
    public By scrollToThisElement = By.xpath("//a[normalize-space()='2']");
    public By nextPage = By.xpath("//a[contains(text(),'4')]");
    public By findWriter = By.xpath("//a[@href='/cat/books/author/']");
    public By selectWriter = By.xpath("//h3[normalize-space()='M. Mirjahan']");
    public By selectBook = By.xpath("//div[@class='product_thumbnail_wrapper']//a");
    public By clickOnOrderButton = By.xpath("//div[@class='body-wrapper']//button[2]");
    public By completeOrder = By.xpath("//span[contains(text(),'অর্ডার সম্পন্ন করুন')]");




    public String checkoutUrl = "https://www.wafilife.com/checkout";
   // public By billingName = By.xpath("//input[@id='billing_first_name']");
   // public By billingPhone = By.xpath("//input[@id='billing_phone']");
    public By billingUrgentPhone = By.xpath("//input[@id='billing_alternative_phone']");
   // public By billingEmail = By.xpath("//input[@id='billing_email']");
    public  By billingZila = By.xpath("//select[@id='billing_state']");
    public By billingArea = By.xpath("//select[@id='billing_area']");
    public By billingAddress = By.xpath("//textarea[@id='billing_address_1']");
    public By billingOtherInfo = By.xpath("//textarea[@id='order_comments']");
    public By shippingProcess = By.xpath("//input[@id='shipping_method_0_flat_rate12']");
    public By shippingMethod = By.xpath("//input[@value='bkash']");
    public By completeBillingOrder = By.xpath("//button[@id='place_order']");

    public By successfulOder_Msg = By.xpath("//p[contains(text(),'আপনাকে ধন্যবাদ। আপনার অর্ডার পেয়েছি।')]");
    public String successfulOrder_Text = "আপনাকে ধন্যবাদ। আপনার অর্ডার পেয়েছি।";



    public void selectAuthor()  {
        clickOnElement(writer);
        scrollToElement(scrollToThisElement);
        clickOnElement(nextPage);
        clickOnElement(findWriter);
        clickOnElement(selectWriter);
        clickOnElement(selectBook);
        clickOnElement(clickOnOrderButton);
        clickOnElement(completeOrder);

    }

    public void userBilling() {
       // writeOnElement(billingName,"Polok Khan");
        //writeOnElement(billingPhone,"01521212121");
        writeOnElement(billingUrgentPhone,"01621212121");
       // writeOnElement(billingEmail,"test@gmail.com");
        selectWithVisibleText(billingZila,"Gaibandha");
        selectWithVisibleText(billingArea,"পলাশবাড়ী");
        writeOnElement(billingAddress,"Polashbari, Gaibandha, Bangladesh");
        writeOnElement(billingOtherInfo,"Sent product as soon as possible");
        clickOnElement(shippingProcess);
        clickOnElement(shippingMethod);
        clickOnElement(completeBillingOrder);
    }
}
