package Step_Definition;

import Base.TestBase;
import Pages.CreateNewUserPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class InvalidLoginTest extends TestBase {

    @And("^I enter wrong \"([^\"]*)\"$")
    public void iEnterWrong(String email) throws Throwable {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    @And("^I enter correct \"([^\"]*)\"$")
    public void iEnterCorrect(String password) throws Throwable {
        driver.findElement(By.id("passwd")).sendKeys(password);

    }

    @When("^I select login button$")
    public void iSelectLoginButton() {
        driver.findElement(By.id("SubmitLogin")).click();
    }

    @Then("^i should get an \"([^\"]*)\"$")
    public void iShouldGetAn(String ErrorMessage) throws Throwable {
        String ExpectedErrorMessage = ErrorMessage;
        String ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        System.out.println(ActualErrorMessage);

    }


}
