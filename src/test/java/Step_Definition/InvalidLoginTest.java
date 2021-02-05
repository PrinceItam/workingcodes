package Step_Definition;

import Base.TestBase;
import Pages.CreateNewUserPage;
import Pages.InvalidLoginPage;
import Pages.Purchase1Page;
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

import static org.openqa.selenium.support.PageFactory.initElements;

public class InvalidLoginTest extends TestBase {

    @And("^I enter wrong \"([^\"]*)\"$")
    public void iEnterWrong(String email)  {
        InvalidLoginPage page = PageFactory.initElements(driver, InvalidLoginPage.class);
        page.enterwrongemail(email);
    }

    @And("^I enter correct \"([^\"]*)\"$")
    public void iEnterCorrect(String password) throws Throwable {
        InvalidLoginPage page = PageFactory.initElements(driver, InvalidLoginPage.class);
        page.enterpassword(password);

    }

    @When("^I select login button$")
    public void iSelectLoginButton() {
        InvalidLoginPage page = PageFactory.initElements(driver, InvalidLoginPage.class);
        page.submissionButton();
    }

    @Then("^i should get an \"([^\"]*)\"$")
    public void iShouldGetAn(String ErrorMessage) throws Throwable {
        InvalidLoginPage page = PageFactory.initElements(driver, InvalidLoginPage.class);
        page.selectErrorMessage(ErrorMessage);


    }





    }





