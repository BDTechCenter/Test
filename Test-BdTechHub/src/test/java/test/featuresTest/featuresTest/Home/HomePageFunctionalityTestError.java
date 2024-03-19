package test.featuresTest.featuresTest.Home;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import test.featuresTest.configurations.Configurations;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class HomePageFunctionalityTestError extends Configurations {
    // Obs:
    // These tests must be run, without API information,
    // so that we can test the error functionalities,
    // and not allow interactions with the buttons

    @BeforeEach
    public void setUpTest() throws InterruptedException {
        setUP("");
    }

    @Test
    public void errorNotFindingNews() throws InterruptedException {
        //TEST OBJECTIVE
        //{
        // This test should be run without the API information to ensure the error message
        // is displayed rather than a blank screen.
        //};

        // TEST VARIABLES
        //{
        String messageError = "Error News";
        //};

        //TEST SCRIPT
        //{
            sleep(200000);
            // identify 'text': 'Top news not found'
            WebElement textError = driver.findElement(By.xpath("//h1[text()=\"Error News\"]"));
            // Compare the variable 'messageError' error message with the 'text' value of the 'textError' element
            assertEquals(messageError, textError.getText());
        //};
    }
    @AfterEach
    public void tearDown(){
        tearDown(driver);
    }

}
