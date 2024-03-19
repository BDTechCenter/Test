package test.featuresTest.configurations;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.lang.Thread.sleep;


public class Configurations {
    public WebDriver driver;

    public void setUP(String url) throws InterruptedException {
        // Open Drive
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\ct67ca\\driver\\geckodriver.exe");
        driver = new FirefoxDriver();
        // Open site
        driver.get("http://localhost:3000/"+url);
        sleep(7000);
        try{
            Alert alert = driver.switchTo().alert();
        }catch (NoAlertPresentException e){
            System.out.println(e);
        }
    }

    public void tearDown(WebDriver driver){
        // Close driver
        driver.close();
    }
}
