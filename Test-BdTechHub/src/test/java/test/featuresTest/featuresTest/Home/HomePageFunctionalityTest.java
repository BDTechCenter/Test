package test.featuresTest.featuresTest.Home;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import test.featuresTest.configurations.Configurations;

import javax.swing.*;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class HomePageFunctionalityTest extends Configurations {

    @BeforeEach
    public void setUpTest() throws InterruptedException {
        setUP("");
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
    public void identifyClickAndMakeSureTheTitlesMatch() throws InterruptedException {
        //TEST OBJECTIVE
        //{
        // The objective is to check whether the previous news corresponds to the
        // advanced news.
        //};

        // TEST SCRIPT
        //{
        // check existence of 'id' component: 'newsComponentHomeTest'
        WebElement newsComponent = driver.findElement(By.id("componentNewsTest"));
        // store news title preveaw
        WebElement titleNewsPreveaw = driver.findElement(By.xpath("//*[@id=\"componentNewsTest\"]/div/h1"));
        String titleNewsPrwveawText = titleNewsPreveaw.getText();
        // click on the 'id' component: 'newsComponentHomeTest'
        newsComponent.click();
        sleep(5000);
        // store news title advanced
        WebElement titleNewsAdvanced = driver.findElement(By.id("titleAdvanced"));
        // Compare the variable 'titleNewsPreveaw' with the variable 'titleNewsAdvanced'
        assertEquals(titleNewsPrwveawText, titleNewsAdvanced.getText());
        //};
    }

    @AfterEach
    public void tearDown(){
        tearDown(driver);
    }
}
