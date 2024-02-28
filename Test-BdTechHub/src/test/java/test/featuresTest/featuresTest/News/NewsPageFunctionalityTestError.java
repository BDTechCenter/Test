package test.featuresTest.featuresTest.News;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.featuresTest.configurations.Configurations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewsPageFunctionalityTestError extends Configurations {

    @BeforeEach
    public void setUpTest(){
        setUP("news");
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
        String messageError = "News not found";
        //};

        //TEST SCRIPT
        //{
        // identify 'text': 'Top news not found'
        WebElement textError = driver.findElement(By.xpath("//h1[text()=\"News not found\"]"));
        // Compare the variable 'messageError' error message with the 'text' value of the 'textError' element
        assertEquals(messageError, textError.getText());
        //};
    }

    @AfterEach
    public void tearDown(){
        tearDown(driver);
    }
}
