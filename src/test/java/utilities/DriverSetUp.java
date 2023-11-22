package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class DriverSetUp {
    private static String browserName = System.getProperty("browser","Chrome");
    private static final ThreadLocal <WebDriver> LOCAL_DRIVER = new ThreadLocal<>();
    public static void setDriver(WebDriver driver){
        DriverSetUp.LOCAL_DRIVER.set(driver);
    }
    public static WebDriver getDriver(){
        return LOCAL_DRIVER.get();
    }
    public static WebDriver createDriver(String browserName){
        //equalsIgnoreCase will ignore caseSensitive
        if(browserName.equalsIgnoreCase("chrome")){
            return new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            return new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            return new EdgeDriver();
        }
        else {
            throw new RuntimeException("Browser Not Found:" + browserName);
        }

    }

    @BeforeSuite
    public static synchronized void setBrowser(){
        WebDriver driver = createDriver(browserName);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        setDriver(driver);
    }

    @AfterSuite
    public static synchronized void quiteBrowser(){
        getDriver().quit();
    }
}
