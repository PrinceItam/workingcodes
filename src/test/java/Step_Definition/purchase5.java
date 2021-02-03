package Step_Definition;

import Base.TestBase;
import Pages.purchase5Page;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class purchase5 extends TestBase {
    @Before
    public void setup() throws IOException {
        initialize();
    }

    @Given("^I am on the homepage$")
    public void iAmOnTheHomepage() {
        driver.manage().deleteAllCookies();
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
    }

    @When("^I place an order$")
    public void iPlaceAnOrder() throws InterruptedException {
        purchase5Page page = PageFactory.initElements(driver, purchase5Page.class);
        page.selectdresses();
        page.selectsummerdress();
        Thread.sleep(3000);
        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[1]/div/a[1]/img"));
        builder.moveToElement(element).build().perform();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[3]/div/div[2]/div[2]/a[2]/span")).click();
        Select size = new Select(driver.findElement(By.id("group_1")));
        size.selectByVisibleText("M");
        page.selectgreen();
        driver.findElement(By.id("quantity_wanted")).clear();
        driver.findElement(By.id("quantity_wanted")).sendKeys("65");
        page.clickaddcart();
        Thread.sleep(3000);
        page.clickproceedcheckout1();
        page.clickproceedcheckout2();
        page.selectemail();
        page.selectpassword();
        page.clicksignin();
        page.writecomments();
        page.clickproceedcheckout();
        page.clickontermsofservice();
        page.selectconfirmcheckout1();
        page.selectpayviacheck();
        page.clickconfirmorder();
        page.clickbackOrder();

    }

    @Then("^I should see my order history and reference$")
    public void iShouldSeeMyOrderHistoryAndReference() {
        String ExpectedMessage = "ORDER HISTORY";
        String Orderdetails = driver.findElement(By.xpath("//*[@id=\"order-list\"]/tbody/tr/td[7]/a[1]/span")).getText();
        System.out.println(Orderdetails);

    }
}
