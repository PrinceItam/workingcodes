package Step_Definition;

import Base.TestBase;
import Pages.Purchase3Page;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class Purchase3 extends TestBase {


    @Given("^I signed in$")
    public void iSignedIn() throws InterruptedException {
        Purchase3Page page = PageFactory.initElements(driver, Purchase3Page.class);
        page.typeUserEmail();
        page.typeUserPassword();
        page.clickSignInButton();
        Thread.sleep(3000);
        page.clickDressModule();
    }

    @And("^I select product to cart$")
    public void iSelectProductToCart() throws InterruptedException {
        Purchase3Page page = PageFactory.initElements(driver, Purchase3Page.class);
        page.hoverOnDress();
        page.clickMoreButton();
        page.clearQuantityField();
        page.enterQuantityOfDress();
        page.selectDressSize();
        page.clickAddToCart();
        Thread.sleep(3000);



    }

    @When("^I checked out$")
    public void iCheckedOut() throws InterruptedException {
        Purchase3Page page = PageFactory.initElements(driver, Purchase3Page.class);
        page.clickCheckOut1();
        page.clickCheckOut2();
        page.clickAddCheckBox();
        page.typeOrderMessage();
        page.clickCheckOut3();
        page.clickTermsCheckBox();
        Thread.sleep(3000);
        page.clickWirePayment();
        page.clickChequePayment();
        page.assertBankWirePay();
        page.clickOrderConfirmButton();



    }

    @Then("^Order completed$")
    public void orderCompleted() {
        Purchase3Page page = PageFactory.initElements(driver, Purchase3Page.class);
        page.orderComplete();


    }

    @Then("^I should logout$")
    public void iShouldLogout() {
        Purchase3Page page = PageFactory.initElements(driver, Purchase3Page.class);
        page.clickSignOutButton();
        page.assertSignedOutUser();






    }
}
