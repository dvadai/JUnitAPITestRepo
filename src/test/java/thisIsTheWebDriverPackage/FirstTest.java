package thisIsTheWebDriverPackage;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FirstTest {


    public  static class FirstAutomationTest {

        @Test
        public void firefftest(){
            System.setProperty("webdriver.gecko.driver", "/Users/dia/Downloads/geckodriver");
            WebDriver driver = new FirefoxDriver();

            driver.navigate().to("http://www.phptravels.net/");
            Assert.assertEquals("The title is not: PHPTRAVELS | Travel Technology Partner", "PHPTRAVELS | Travel Technology Partner", driver.getTitle());

            driver.close();
        }
    }
}
