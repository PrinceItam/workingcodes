package Step_Definition;

import Base.TestBase;
import Pages.CreateNewUserPage;
import Pages.InvalidLoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.xalan.xsltc.runtime.ErrorMessages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class InvalidLoginTest extends TestBase {

    @And("^I enter wrong \"([^\"]*)\"$")
    public void iEnterWrong() throws Throwable {
        //driver.findElement(By.id("email")).sendKeys(email);

        InvalidLoginPage page = PageFactory.initElements(driver, InvalidLoginPage.class);
        page.userEmailId();
    }

    @And("^I enter correct \"([^\"]*)\"$")
    public void iEnterCorrect() throws Throwable {
        //driver.findElement(By.id("passwd")).sendKeys(password);
        InvalidLoginPage page = PageFactory.initElements(driver, InvalidLoginPage.class);
        page.userPassword();

    }

    @When("^I select login button$")
    public void iSelectLoginButton() {
        //driver.findElement(By.id("SubmitLogin")).click();

        InvalidLoginPage page = PageFactory.initElements(driver, InvalidLoginPage.class);
        page.submissionButton();
    }

    @Then("^i should get an \"([^\"]*)\"$")
    public void iShouldGetAn(String ErrorMessage) throws Throwable {
        String ExpectedErrorMessage = ErrorMessage;
        String ActualErrorMessage = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li")).getText();
        Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
        System.out.println(ActualErrorMessage);

    }





    }





