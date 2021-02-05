package Step_Definition;




import Base.TestBase;
import Pages.CreateNewUserPage;
import Pages.Purchase1Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;
import static org.openqa.selenium.support.PageFactory.initElements;

public class Purchase1 extends TestBase {


    @And("^I enter valid login credentials$")
    public void iEnterValidLoginCredentials() {

        Purchase1Page page = initElements(driver, Purchase1Page.class);
        page.selectemailID();
        page.selectPassword();
        page.clickLogin();
    }

    @And("^I made an order$")
    public void iMadeAnOrder() throws InterruptedException {
        Purchase1Page page = initElements(driver, Purchase1Page.class);
        page.clickMenu();
        Thread.sleep(3000);
        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img"));
        builder.moveToElement(element).build().perform();
        page.clickMore();
        page.selectQuantity();
        page.clearQuantity();
        page.sendQuantity();
        page.selectSize();
        page.clickAway();
        page.clickCart();

    }

    @When("^I click checkout$")
    public void iClickCheckout() {
        Purchase1Page page = initElements(driver, Purchase1Page.class);
        page.checkoutone();
        page.checkouttwo();
        page.checkoutthree();
        page.termsandconditions();
        page.confirmation();
        page.makePayment();
        page.paymentConfirm();
    }

    @Then("^I am able to complete my order successfully$")
    public void iAmAbleToCompleteMyOrderSuccessfully() {
        Purchase1Page page = initElements(driver, Purchase1Page.class);
        page.confirmOrder();

    }


}



















