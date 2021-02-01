package Step_Definition;

import Base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class Purchase2 extends TestBase {
    //@Given("^I am logged in successfully on the main page$")
    {//public void i_am_on_a_Homepage() throws Throwable {
        // System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        //driver = new ChromeDriver();
        //driver.navigate().to("http://automationpractice.com/");
        //driver.manage().window().maximize();
        //}
    }

    @And("^I select a product$")
    public void iSelectAProduct() {
        Purchase2 Page = PageFactory.initElements(driver, Purchase2.class);
        Page.iSelectAProduct();

    }

    @And("^I change the quantity$")
    public void iChangeTheQuantity() {
        Purchase2 Page = PageFactory.initElements(driver, Purchase2.class);
        Page.iChangeTheQuantity();

    }

    @And("^I change the size$")
    public void iChangeTheSize() {
        Purchase2 Page = PageFactory.initElements(driver, Purchase2.class);
        Page.iChangeTheSize();
    }

    @And("^add it to the cart$")
    public void addItToTheCart() {
        Purchase2 Page = PageFactory.initElements(driver, Purchase2.class);
        Page.addItToTheCart();
    }

    @When("^I click on proceed to checkout on dialogue$")
    public void iClickOnProceedToCheckoutOnDialogue() {
        Purchase2 Page = PageFactory.initElements(driver, Purchase2.class);
        Page.iClickOnProceedToCheckoutOnDialogue();
    }


    @Then("^continue checkout process on shopping cart summary page$")
    public void continueCheckoutProcessOnShoppingCartSummaryPage() {
        Purchase2 Page = PageFactory.initElements(driver, Purchase2.class);
        Page.continueCheckoutProcessOnShoppingCartSummaryPage();
    }

    @Then("^continue checkout on address page$")
    public void continueCheckoutOnAddressPage() {
        Purchase2 Page = PageFactory.initElements(driver, Purchase2.class);
        Page.continueCheckoutOnAddressPage();

    }

    @And("^agree to terms of service$")
    public void agreeToTermsOfService() {
        Purchase2 Page = PageFactory.initElements(driver, Purchase2.class);
        Page.agreeToTermsOfService();

    }

    @Then("^click of proceed to checkout on shipping page$")
    public void clickOfProceedToCheckoutOnShippingPage() {
        Purchase2 Page = PageFactory.initElements(driver, Purchase2.class);
        Page.clickOfProceedToCheckoutOnShippingPage();

    }

    @Then("^click on pay by bank wire$")
    public void clickOnPayByBankWire() {
        Purchase2 Page = PageFactory.initElements(driver, Purchase2.class);
        Page.clickOnPayByBankWire();

    }

    @When("^I click on confirm my order on order summary page$")
    public void iClickOnConfirmMyOrderOnOrderSummaryPage() {
        Purchase2 Page = PageFactory.initElements(driver, Purchase2.class);
        Page.iClickOnConfirmMyOrderOnOrderSummaryPage();
    }

    @Then("^my order should be completed successfully$")
    public void myOrderShouldBeCompletedSuccessfully() {
        Purchase2 Page = PageFactory.initElements(driver, Purchase2.class);
        Page.myOrderShouldBeCompletedSuccessfully();
    }

}
