package Step_Definition;

import Base.TestBase;
import Pages.CreateNewUserPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class commonTest extends TestBase {

     @Before
     public void setup() throws IOException {
      initialize();

     }
    @Given("^I am on the  homepage$")
    public void iAmOnTheHomepage() {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();

    }

    @And("^I click sign in$")
    public void iClickSignIn() {
        CreateNewUserPage Page = PageFactory.initElements(driver, CreateNewUserPage.class);
        Page.clickSignIn();
    }
}
