package Step_Definition;

import Pages.Purchase4Page;
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

public class Purchase4 {
    public WebDriver driver;

    @Given("^I am on the home$")
    public void iAmOnTheHome() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com/");
        driver.manage().window().maximize();

    }

    @When("^I place an order$")
    public void iPlaceAnOrder() throws InterruptedException {

        Purchase4Page page = PageFactory.initElements(driver, Purchase4Page.class);

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[4]/div/div[1]/div/a[1]/img"));
        builder.moveToElement(element).build().perform();
        driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[4]/div/div[2]/div[2]/a[2]/span")).click();
        driver.findElement(By.id("quantity_wanted")).clear();
        driver.findElement(By.id("quantity_wanted")).sendKeys("6");
        Select size =new Select(driver.findElement(By.id("group_1")));
        size.selectByVisibleText("M");

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
