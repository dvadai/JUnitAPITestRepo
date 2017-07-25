# JUnitTestRepo
This is a skeleton test framework using Junit with instructions in Readme

# Step by step basic setup

1. create a new maven project
2. Add JUnit dependency (create  <dependencies> </dependencies> first)
into your POM file from https://github.com/junit-team/junit4/wiki/Download-and-Install
3. Add the WebDriver dependency into the POM file from http://www.seleniumhq.org/download/maven.jsp
4. Create a new package in scr>test>youPackage
5. Create a new class within this package
6. Add the @Test annotation to every separate test you write so JUnit will run it.
7. Driver documentation on how Selenium client bindings will pick up the geckodriver binary executable.
https://github.com/mozilla/geckodriver
You can just add it liek this: System.setProperty("webdriver.gecko.driver", "/Users/yourfolder/geckodriver");
8. The test method should end with "test", eg: public  static class FirstAutomationTest
9. Instantiate driver object, in this case as FirefoxDriver:
WebDriver driver = new FirefoxDriver();
10. Test: eg, Assertion
11. Close/quit driver: driver.close();
12. A new test will have a different @Test annotation

# Additional improvements
1. Use the @Before annotation on a method to initialise your driver

# API testing framework
1. Add the dependency. Find it here: https://mvnrepository.com/artifact/io.rest-assured/rest-assured
2. Make sure you have the proper imports
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



