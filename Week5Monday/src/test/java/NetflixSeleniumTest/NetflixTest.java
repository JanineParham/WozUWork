package NetflixSeleniumTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NetflixTest {

    private WebDriver driver;

    @BeforeEach
    void setUp(){
        System.setProperty("webdriver.chrome.driver", "/Users/janineparham/selenium/chromedriver");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.netflix.com");
    }

    @Test
    public void testSignInRoute(){
        WebElement signIn = driver.findElement(By.tagName("a"));
        signIn.click();
        assertEquals("https://www.netflix.com/login", driver.getCurrentUrl());
    }

    @Test
    void testLogoButton(){
        WebElement signIn = driver.findElement(By.tagName("a"));
        signIn.click();
        WebElement netflixHome = driver.findElement(By.className("svg-nfLogo signupBasicHeader"));
        assertEquals("Netflix - Watch TV Shows Online, Watch Movies Online", driver.getTitle());
    }

    @Test
    void emailInput(){
        driver.findElement(By.name("email")).sendKeys("johndoe@gmail.com", Keys.ENTER);
        assertEquals("https://www.netflix.com/signup/password?locale=en-US", driver.getCurrentUrl());
    }

    @Test
    void testHasAnchors(){
        List<WebElement> divs = driver.findElements(By.tagName("div"));
        assertEquals(67, divs.size());
    }

    @Test
    void testInputs(){
        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        for(WebElement input : inputs){
            System.out.println(input.getLocation());
        }
        //not sure what to do to find location
    }

    @AfterEach
    void tearDown(){
        driver.close();
    }
}
