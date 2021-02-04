package Step_Definition;

import Base.TestBase;
import Pages.Purchase2Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

public class Purchase2 extends TestBase {

    @Given("^I am logged in successfully$")
    public void iAmLoggedInSuccessfully() throws InterruptedException {
        Purchase2Page Page = PageFactory.initElements(driver, Purchase2Page.class);
        Page.insertUserId();
        Page.insertPassword();
        Page.summitLogin();
        Page.blockTopMenu();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        Thread.sleep(3000);
    }



    @Given("^I add product to cart$")
    public void iAddProductToCart() {
        Purchase2Page Page = PageFactory.initElements(driver, Purchase2Page.class);
        Page.hoverOnProduct();
        Page.clickOnMore();
        Page.clearQuantity();
        Page.addQuantity();
        Page.selectSize();
        Page.addToCart();
    }

    @Then("^I click on proceed to checkout on pop up dialogue$")
    public void iClickOnProceedToCheckoutOnPopUpDialogue() throws InterruptedException {
        Thread.sleep(3000);
        Purchase2Page Page = PageFactory.initElements(driver, Purchase2Page.class);
        Page.clickCheckoutDialogue();
    }

    @Then("^continue checkout process on shopping cart summary page$")
    public void continueCheckoutProcessOnShoppingCartSummaryPage() {
        Purchase2Page Page = PageFactory.initElements(driver, Purchase2Page.class);
        Page.CheckoutSummary();

    }

    @Then("^continue checkout on address page$")
    public void continueCheckoutOnAddressPage() {
        Purchase2Page Page = PageFactory.initElements(driver, Purchase2Page.class);
        Page.CheckoutAddress();
    }

    @And("^agree to terms of service$")
    public void agreeToTermsOfService() {
        Purchase2Page Page = PageFactory.initElements(driver, Purchase2Page.class);
        Page.termsOfService();

    }

    @Then("^click on proceed to checkout on shipping page$")
    public void clickOnProceedToCheckoutOnShippingPage() {
        Purchase2Page Page = PageFactory.initElements(driver, Purchase2Page.class);
        Page.CheckoutShipping();

    }

    @Then("^click on pay by bank wire$")
    public void clickOnPayByBankWire() {
        Purchase2Page Page = PageFactory.initElements(driver, Purchase2Page.class);
        Page.payByBankWire();
    }

    @When("^I click on I confirm my order on order summary page$")
    public void iClickOnIConfirmMyOrderOnOrderSummaryPage() {
        Purchase2Page Page = PageFactory.initElements(driver, Purchase2Page.class);
        Page.confirmOrder();

    }

    @Then("^my order should be completed successfully$")
    public void myOrderShouldBeCompletedSuccessfully() {
        Purchase2Page Page = PageFactory.initElements(driver, Purchase2Page.class);
        Page.purchaseSuccessful();

    }


}
