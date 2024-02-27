package test.featuresTest.configurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Configurations {
    public WebDriver driver;

    public void setUP(String url){
        // Open Drive
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\ct67ca\\driver\\geckodriver.exe");
        driver = new FirefoxDriver();
        // Open site
        driver.get("http://localhost:3000/"+url);
    }
}
