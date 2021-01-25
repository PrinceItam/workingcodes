package Step_Definition;

import Base.TestBase;
import Pages.CreateNewUserPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateNewUserTest extends TestBase {


    @And("^I enter email address for new user$")
    public void iEnterEmailAddressForNewUser() {
        CreateNewUserPage Page = PageFactory.initElements(driver, CreateNewUserPage.class);
        Page.enterRandomEmail();
    }

    @And("^I click on the create account button$")
    public void iClickOnTheCreateAccountButton() throws InterruptedException {
        CreateNewUserPage page  = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.clickCreateNewUserButton();
        Thread.sleep(3000);
    }

    @And("^I enter all necessary details$")
    public void iEnterAllNecessaryDetails() {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.selectGender();
        page.typeFirstname();
        page.typeLastname();
        page.typepassword();
        page.selectDOBDay();
        page.selectDOBMonth();
        page.selectDOBYear();
        page.SelectNewsletter();
        page.SelectOptin();
        page.typeCompany();
        page.typeAddress();
        page.typeCity();
        page.typePostcode();
        page.selectState();
        page.typephonenumber();
        page.typeAlias();

    }

    @When("^I click on the register button$")
    public void iClickOnTheRegisterButton() {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.clickRegisterButton();
    }

    @Then("^My account should be registered correctly$")
    public void myAccountShouldBeRegisteredCorrectly() {
        CreateNewUserPage page = PageFactory.initElements(driver, CreateNewUserPage.class);
        page.assertLoggedInUser();



    }


}
