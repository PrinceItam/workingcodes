package Step_Definition;

import Base.TestBase;
import com.sun.net.httpserver.Authenticator;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Purchase1 extends TestBase {



    @And("^I enter valid login credentials$")
    public void iEnterValidLoginCredentials() {
    driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("bidemi2020@yahoo.com");
    driver.findElement(By.id("passwd")).sendKeys("Poiuy123");
    driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();

    }

    @And("^I made an order$")
    public void iMadeAnOrder() throws InterruptedException {
    driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
    driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[4]/div/div[1]/div/a[1]/img")).click();
    //Thread.sleep(5000);
    //driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"category\"]/div[2]/div/div/div/div")));
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();

        //*[@id="add_to_cart"]
        //*[@id="buy_block"]/div/div[3]/div[1]
        //*[@id="add_to_cart"]/button
        //*[@id="add_to_cart"]


    }

    @When("^I click checkout$")
    public void iClickCheckout() {
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
        driver.findElement(By.name("processAddress")).click();
        driver.findElement(By.id("cgv")).click();
        driver.findElement(By.name("processCarrier")).click();
        driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a/span")).click();
        driver.findElement(By.name("//*[@id=\"cart_navigation\"]/button/span")).click();

    }

    @Then("^I am able to complete my order successfully$")
    public void iAmAbleToCompleteMyOrderSuccessfully() {
    driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[1]")).click();
    }


}
