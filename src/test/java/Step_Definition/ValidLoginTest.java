package Step_Definition;

import Base.TestBase;
import Pages.CreateNewUserPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ValidLoginTest extends TestBase {

    @When("^I enter my username$")
    public void iEnterMyUsername() {
        driver.findElement(By.id("email")).sendKeys("lanre.ikuesan2@gmail.com");
    }

    @And("^I enter my password$")
    public void iEnterMyPassword() {
        driver.findElement(By.id("passwd")).sendKeys("automation");
        driver.findElement(By.id("SubmitLogin")).click();
    }

    @Then("^I should be logged in successfully$")
    public void iShouldBeLoggedInSuccessfully() {
        String NameOfLoggedInUSer = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();
        System.out.println(NameOfLoggedInUSer);

        driver.close();
    }



}
