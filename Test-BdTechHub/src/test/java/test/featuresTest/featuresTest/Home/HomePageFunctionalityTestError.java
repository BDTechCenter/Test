package test.featuresTest.featuresTest.Home;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import test.featuresTest.configurations.Configurations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class HomePageFunctionalityTestError extends Configurations {
    // Obs:
    // These tests must be run, without API information,
    // so that we can test the error functionalities,
    // and not allow interactions with the buttons

    @BeforeEach
    public void setUpTest(){
        setUP("home");
    }

    @Test
    public void errorNotFindingNews(){
        //TEST OBJECTIVE
        //{
        // This test should be run without the API information to ensure the error message
        // is displayed rather than a blank screen.
        //};

        // TEST VARIABLES
        //{
        String messageError = "Top news not found";
        //};

        //TEST SCRIPT
        //{
        // identify 'text': 'Top news not found'
        WebElement textError = driver.findElement(By.xpath("//h1[text()=\"Top news not found\"]"));
        // Compare the variable 'messageError' error message with the 'text' value of the 'textError' element
        assertEquals(messageError, textError.getText());
        //};
    }

    @Test
    public void notFindingTheReadMoreButtonWhenItHasTheNotNewsError(){
        //TEST OBJECTIVE
        //{
        // This test aims to verify that when the 'Not new' error occurs,
        // it is not possible to view or interact with the 'Read more' button.
        //};

        // TEST SCRIPT
        //{
        try {
            // try to identify the 'button' of the 'text':'Read More'
            WebElement buttonReadMore = driver.findElement(By.xpath("//a/button[text()=\"Read More\"]"));
            // try to 'click' in 'buttonReadMore'
            buttonReadMore.click();
            // if the 'button': 'Read More' is found the test should fail
            fail();
        } catch (NoSuchElementException e){
            // if the 'button': 'Read More' is not found, the test must pass
        }
        //};
    }

    @AfterEach
    public void tearDown(){
        driver.close();
    }

}
