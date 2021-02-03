package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Purchase2Page {



    @FindBy (how = How.XPATH, using = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    public static WebElement selectProduct;

    @FindBy (how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")
    public static WebElement clickOnMore;

    @FindBy(how = How.ID, using = "quantity_wanted")
    public static WebElement clearQuantity;

    @FindBy (how = How.ID, using = "quantity_wanted")
    public static WebElement addQuantity;

    @FindBy(how = How.ID, using = "group_1")
    public static WebElement selectSize;

    @FindBy(how = How.XPATH, using = "//*[@id=\"add_to_cart\"]/button/span")
    public static  WebElement addToCart;

    @FindBy(how = How.XPATH, using ="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    public static WebElement CheckoutDialogue;

    @FindBy (how = How.XPATH, using = "//*[@id=\"center_column\"]/p[2]/a[1]")
    public static WebElement CheckoutSummary;

    @FindBy (how = How.XPATH, using = "//*[@id=\"center_column\"]/form/p/button")
    public static WebElement CheckoutAddress;

    @FindBy (how = How.CLASS_NAME, using = "cgv")
    public static WebElement termsOfService;

    @FindBy (how = How.XPATH, using ="//*[@id=\"form\"]/p/button")
    public static WebElement CheckoutShipping;

    @FindBy (how = How.XPATH, using = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a" )
    public static WebElement payByBankWire;

    @FindBy (how = How.XPATH, using = "//*[@id=\"cart_navigation\"]/button")
    public static WebElement confirmOrder;

    @FindBy (how = How.XPATH, using = "//*[@id=\"order-confirmation\"]")
    public static WebElement purchaseSuccessful;


    public void selectProduct() throws InterruptedException {selectProduct.click();Thread.sleep(3000);}
    public void clickOnMore() {clickOnMore.click();}
    public void clearQuantity() {clearQuantity.clear();}
    public void addQuantity() {addQuantity.sendKeys("3");}
    public void selectSize() {Select size = new Select(selectSize);
    size.selectByVisibleText("M");}
    public void addToCart() {addToCart.click();}
    public void clickCheckoutDialogue() {CheckoutDialogue.click();}
    public void CheckoutSummary() {CheckoutSummary.click();}
    public void CheckoutAddress() {CheckoutAddress.click();}
    public void termsOfService() {termsOfService.click();}
    public void CheckoutShipping() {CheckoutShipping.click();}
    public void payByBankWire() {payByBankWire.click();}
    public void confirmOrder() {confirmOrder.click();}
    public void purchaseSuccessful() {purchaseSuccessful.click();}






}
