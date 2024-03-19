package test.featuresTest.featuresTest.All;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.featuresTest.configurations.Configurations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NavBarFunctionalityTest extends Configurations {
    @BeforeEach
    public void setUpTest() throws InterruptedException {
        setUP("/news");
    }

    @Test
    public void HomeNavigationLinkTest(){
        //TEST OBJECTIVE
        //{
            //testing each of the Nav Bar links individually
        //};

        // TEST VARIABLES
        //{
            String bannerHome = "Follow the main news of the moment...";
        //};

        // TEST SCRIPT
        //{
            //identify 'text': 'Home' link
            WebElement homeLink = driver.findElement(By.xpath("//h1[text()=\"Home\"]"));
            //click in 'Home' link
            homeLink.click();
            //compare the variable 'bannerHome' with the text on the 'Home' page banner
            WebElement banerPage = driver.findElement(By.id("topBannerPage"));
            assertEquals(bannerHome, banerPage.getText());
        // }
    }

    @Test
    public void BoschNavigationLinkTest(){
        //TEST OBJECTIVE
        //{
        //testing each of the Nav Bar links individually
        //};

        // TEST VARIABLES
        //{
        String bannerHome = "Follow the main news of the moment...";
        //};

        // TEST SCRIPT
        //{
        //identify 'img': 'Bosch' link
        WebElement boschLink = driver.findElement(By.xpath("//a/img"));
        //click in 'Bosch' link
        boschLink.click();
        //compare the variable 'bannerHome' with the text on the 'Home' page banner
        WebElement banerPage = driver.findElement(By.id("topBannerPage"));
        assertEquals(bannerHome, banerPage.getText());
        // }
    }

    @Test
    public void NewsNavigationLinkTest(){
        //TEST OBJECTIVE
        //{
        //testing each of the Nav Bar links individually
        //};

        // TEST VARIABLES
        //{
        String bannerNews = "Follow the main news of the moment...";
        //};

        // TEST SCRIPT
        //{
        //identify 'text': 'News' link
        WebElement homeLink = driver.findElement(By.xpath("//h1[text()=\"News\"]"));
        //click in 'Home' link
        homeLink.click();
        //compare the variable 'bannerNews' with the text on the 'News' page banner
        WebElement banerPage = driver.findElement(By.id("topBannerPage"));
        assertEquals(bannerNews, banerPage.getText());
        // }
    }

    @AfterEach
    public void tearDown(){
        tearDown(driver);
    }
}
