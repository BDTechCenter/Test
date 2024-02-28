package test.featuresTest.featuresTest.Home;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import test.featuresTest.configurations.Configurations;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class HomePageFunctionalityTest extends Configurations {

    @BeforeEach
    public void setUpTest(){
        setUP("home");
    }


    @Test
    public void checkingTheExistenceOfNewsOnTheHomePage(){
        //TEST OBJECTIVE
        //{
        // This test aims to check if there is news on the home page,
        // if you have the test you will click on the news.
        //};

        // TEST SCRIPT
        //{
            // check existence of 'id' component: 'newsComponentHomeTest'
            WebElement newsComponent = driver.findElement(By.id("newsComponentHomeTest"));
            // click on the 'id' component: 'newsComponentHomeTest'
            newsComponent.click();
        //};
    }

    @Test
    public void clickInReadMoreButton() throws InterruptedException {
        //TEST OBJECTIVE
        //{
        // check if there is a 'button' with 'text':'Read more'
        // and if there is a click and check if you have accessed the news page
        //};

        // TEST VARIABLES
        //{
            String textBanner = "Follow the main news of the moment...";
        //};

        // TEST SCRIPT
        //{
            // check 'button' with 'text':'Read MOre'
            WebElement buttonReadMOre = driver.findElement(By.xpath("//a/button[text()=\"Read More\"]"));
            // scroll the page to the element
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'end', behavior: 'smooth'});", buttonReadMOre);
            // click on the 'button': 'buttonReadMOre'
            sleep(2000);
            buttonReadMOre.click();
            // check if you went to the news page
            WebElement textBannerNewsPage = driver.findElement(By.xpath("//h1/p"));
            assertEquals(textBanner, textBannerNewsPage.getText());

        //};
    }

    @AfterEach
    public void tearDown(){
        tearDown(driver);
    }
}
