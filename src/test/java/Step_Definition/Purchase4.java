package Step_Definition;

import Base.TestBase;
import Pages.Purchase4Page;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class Purchase4 extends TestBase {

    @Before
    public void setup() throws IOException {
        initialize();

    }

    @Given("^I am on the home$")
    public void iAmOnTheHome() {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
        
    }

    @When("^I place an order$")
    public void iPlaceAnOrder() throws InterruptedException {

        Purchase4Page page = PageFactory.initElements(driver, Purchase4Page.class);

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[4]/div/div[1]/div/a[1]/img"));
        builder.moveToElement(element).build().perform();
        page.clickMore();
        page.clearQuantity1();
        page.typeQuantity();
        page.selectSize();
        page.clickColour();
        page.clickAddToCart();
        Thread.sleep(3000);
        page.clickProceedToCheckOut();
        page.clickProceed();
        page.typeEmailAddress();
        page.typePassword();
        page.clickLogin();
        page.clickSubmitOrder();
        page.clickCheckBox();
        page.clickSubmitAgain();

    }


    @And("^I make payment$")
    public void iMakePayment() {

        Purchase4Page page = PageFactory.initElements(driver, Purchase4Page.class);
        page.clickPay();
        page.clickConfirm();

    }

    @Then("^I should successfully complete my order$")
    public void iShouldSuccessfullyCompleteMyOrder() {

        Purchase4Page page = PageFactory.initElements(driver, Purchase4Page.class);
        page.assertOrderSuccess();

    }
}
