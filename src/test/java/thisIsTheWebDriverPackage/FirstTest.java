package thisIsTheWebDriverPackage;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class FirstTest {


    public  static class FirstAutomationTest {

        private static final String PHPTRAVELS_TITLE_TEXT = "PHPTRAVELS | TravelTechnologyPartner";

        @Test
        public void firefftest(){
            System.setProperty("webdriver.gecko.driver", "/Users/dia/Downloads/geckodriver");
            WebDriver driver = new FirefoxDriver();

            driver.navigate().to("http://www.phptravels.net/");
            Assert.assertEquals("The title is not: " + PHPTRAVELS_TITLE_TEXT, PHPTRAVELS_TITLE_TEXT, driver.getTitle());

            driver.close();
        }
    }
}
