package test.featuresTest.featuresTest.Scripts.All;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllScripts {

    public void testNavBar(WebDriver driver, String xpath){
        // identify the button in 'NavBar'
        WebElement navBarButton = driver.findElement(By.xpath(xpath));
        // click in 'button':'navBarButton'
        navBarButton.click();
    }

    public void allNavBarButtons(WebDriver driver) throws InterruptedException {
        //TEST OBJECTIVE
        //{
        // test the nav bar, accessing all the buttons to check if it is working on all pages
        //};

        //TEST VARIABLES
        //{
            String xpath = "//nav/a[@href=\"/home\"]";
            String BannerHome = "Follow the main news of the moment...";
        //}

        //TEST SCRIPTS
        //{
            testNavBar(driver, xpath);
            sleep(2000);
            // check if you went to the home page
            WebElement textBannerNewsPage = driver.findElement(By.xpath("//h1/p"));
            assertEquals(BannerHome, textBannerNewsPage.getText());
        //}
    }
}
