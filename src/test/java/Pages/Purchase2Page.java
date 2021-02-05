package Pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Purchase2Page extends TestBase {

    @FindBy (how = How.ID,using = "email")
    public static WebElement insertUserId;

    @FindBy (how = How.ID,using = "passwd")
    public static WebElement insertPassword;

    @FindBy (how = How.ID,using = "SubmitLogin")
    public static WebElement summitLogin;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    public static WebElement blockTopMenu;


    @FindBy (how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")
    public static WebElement hoverOnProduct;

        @FindBy (how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[2]/span")
    public static WebElement clickOnMore;

    @FindBy(how = How.ID, using = "quantity_wanted")
    public static WebElement clearQuantity;

    @FindBy (how = How.ID, using = "quantity_wanted")
    public static WebElement addQuantity;

    @FindBy(how = How.ID, using = "group_1")
    public static WebElement selectSize;

    @FindBy(how = How.XPATH, using = "//*[@id=\"add_to_cart\"]/button/span")
    public static  WebElement addToCart;

    @FindBy(how = How.XPATH, using ="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    public static WebElement CheckoutDialogue;

    @FindBy (how = How.XPATH, using = "//*[@id=\"center_column\"]/p[2]/a[1]")
    public static WebElement CheckoutSummary;

    @FindBy (how = How.XPATH, using = "//*[@id=\"center_column\"]/form/p/button")
    public static WebElement CheckoutAddress;

    @FindBy (how = How.XPATH, using = "//*[@id=\"cgv\"]")
    public static WebElement termsOfService;

    @FindBy (how = How.XPATH, using ="//*[@id=\"form\"]/p/button")
    public static WebElement CheckoutShipping;

    @FindBy (how = How.XPATH, using = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a" )
    public static WebElement payByBankWire;

    @FindBy (how = How.XPATH, using = "//*[@id=\"cart_navigation\"]/button")
    public static WebElement confirmOrder;

    @FindBy (how = How.XPATH, using = "//*[@id=\"order-confirmation\"]")
    public static WebElement purchaseSuccessful;


    public void insertUserId() {insertUserId.sendKeys("bidemi2020@yahoo.com");}
    public void insertPassword() {insertPassword.sendKeys("Poiuy123");}
    public void summitLogin() {summitLogin.click();}
    public void blockTopMenu() {blockTopMenu.click();}
    public void hoverOnProduct() {
        Actions builder = new Actions(driver);
        WebElement element = hoverOnProduct;
        builder.moveToElement(element).build().perform();}
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
