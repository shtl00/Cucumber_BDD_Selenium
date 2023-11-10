package org.example.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;

public class DriverManager {
    public static WebDriver driver;
    String browser="chrome";
    String baseUrl="https://demo.nopcommerce.com/";

    public DriverManager(){
        PageFactory.initElements(driver,this);
    }
    public void runOnLocalBrowser() throws IllegalAccessException {switch (browser){
        case "chrome":
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();

            break;
        case "edge":
            WebDriverManager.edgedriver().setup();
            driver= new EdgeDriver();
            break;
        case "safari":
            driver= new SafariDriver();
            break;
        case "firefox":
            WebDriverManager.firefoxdriver().setup();
            driver =new FirefoxDriver();
            break;
        default:
            throw new IllegalAccessException("Unexpected browser");
    }

    }
    public void maxBrowser(){
        driver.manage().window().maximize();
    }
    public void openUrl(){
        driver.get(baseUrl);
    }
    public String getCurrentUrl(){
       return driver.getCurrentUrl();
    }
    public void closeBrowser(){
        driver.quit();
    }

    public void sleepBrowser(int ms) throws InterruptedException {
        Thread.sleep(ms);

    }

}
