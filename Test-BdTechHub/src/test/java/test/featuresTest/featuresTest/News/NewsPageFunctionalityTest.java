package test.featuresTest.featuresTest.News;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import test.featuresTest.configurations.Configurations;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewsPageFunctionalityTest extends Configurations {
    @BeforeEach
    public void setUpTest(){
        setUP("news");
    }

    @Test
    public void checkCardNews() throws InterruptedException {
        //TEST OBJECTIVE
        //{
        // check if there is any news, store the news title value and click on the news,
        // then check if the 'Read more' title is the same as the news title
        //};

        //TEST VARIABLES
        //{
        String title;
        //};

        //TEST SCRIPTS
        //{
            // identify the news from 'id': 'componentNewsTestNewsPage'
            WebElement newsComponent = driver.findElement(By.id("componentNewsTestNewsPage"));
            // identify the news title: 'newsComponent'
            WebElement textNewsComponent = driver.findElement(By.xpath("//a[@id=\"componentNewsTestNewsPage\"]/div/h1"));
            title = textNewsComponent.getText();
            // click on the news: 'componentNewsTestNewsPage'
            newsComponent.click();
            sleep(2000);
            // identify the title of the news page the test was directed to
            WebElement titleNewsPage = driver.findElement(By.xpath("//h1"));
            // compare the news title: 'title' with the news page title: 'titleNewsPage'
            assertEquals(title, titleNewsPage.getText());
        //};
    }

    @AfterEach
    public void tearDown(){
        tearDown(driver);
    }
}
