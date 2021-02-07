package Step_Definition;

import Base.TestBase;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class purchaseTest extends TestBase {

    @Given("^I am logged in$")
    public void i_am_logged_in() throws Throwable {
        driver.findElement(By.id("email")).sendKeys("lanre.ikuesan447@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("automation");
        driver.findElement(By.id("SubmitLogin")).click();
    }


    @And("^I add dress to cart$")
    public void iAddDressToCart() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();
        Thread.sleep(3000);
        //This code hovers/places the mouse on the product you want to add to cart. be sure you have the correct xpath to the product you want to select
        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img"));
        builder.moveToElement(element).build().perform();
        //This code clicks on the "more" button after you have hovered your mouse on the product you want
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[2]/span")).click();
        //This line changes clears the quanity field
        driver.findElement(By.id("quantity_wanted")).clear();
        //This line enters the quantity
        driver.findElement(By.id("quantity_wanted")).sendKeys("3");
        //This line Changes the size
        Select size =new Select(driver.findElement(By.id("group_1")));
        size.selectByVisibleText("S");
        //This line clicks the add to cart button
        driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
    }

    @When("^I check out$")
    public void i_check_out() throws Throwable {



    }

    @Then("^Order should be complete$")
    public void order_should_be_complete() throws Throwable {

    }


}
