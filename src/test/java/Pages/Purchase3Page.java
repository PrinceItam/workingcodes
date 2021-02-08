package Pages;

import Base.TestBase;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Purchase3Page extends TestBase {
    @FindBy(how = How.ID, using = "email")
    public static WebElement enterUserEmail;

    @FindBy(how = How.ID, using = "passwd")
    public static WebElement enterUserPassword;

    @FindBy(how = How.ID, using = "SubmitLogin")
    public static WebElement signInButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    public static WebElement SelectDressesModule;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[5]/div/div[1]/div/a[1]/img")
    public static WebElement hoverOnSelectedDress;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[5]/div/div[2]/div[2]/a[2]/span")
    public static WebElement moreButtonClick;

    @FindBy(how = How.ID, using = "quantity_wanted")
    public static WebElement quantity_Dress;

    @FindBy(how = How.ID, using = "group_1")
    public static WebElement size_Dress;

    @FindBy(how = How.XPATH, using = "//*[@id=\"add_to_cart\"]/button/span")
    public static WebElement add_Cart;

    @FindBy(how = How.XPATH, using = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
    public static WebElement checkOut_proceed1;

    @FindBy(how =How.XPATH, using = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
    public static WebElement checkOut_proceed2;

    @FindBy(how = How.NAME, using = "same")
    public static WebElement address_Checkbox;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ordermsg\"]/textarea")
    public static WebElement order_message;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/form/p/button/span")
    public static WebElement checkOut_Proceed3;

    @FindBy(how = How.ID, using = "cgv")
    public static WebElement terms_checkBox;

    @FindBy(how = How.XPATH, using = "//*[@id=\"form\"]/p/button/span")
    public static WebElement payment_bankWire;

    @FindBy(how = How.XPATH, using = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")
    public static WebElement payment_cheque;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/form/div/p[1]/strong")
    public static WebElement wire_orderSummary;

    @FindBy(how = How.XPATH, using = "//*[@id=\"cart_navigation\"]/button/span")
    public static WebElement payment_confirmOrder;

    @FindBy(how = How.ID, using = "order-confirmation")
    public static WebElement orderConfirm_message;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
    public static WebElement signOut;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    public static WebElement signInLink;








    public void typeUserEmail() {enterUserEmail.sendKeys("lanre.ikuesan447@gmail.com");}
    public void typeUserPassword() {enterUserPassword.sendKeys("automation");}
    public void clickSignInButton() {signInButton.click();}
    public void clickDressModule() {SelectDressesModule.click();}
    public void hoverOnDress() {Actions builder = new Actions(driver);
        WebElement element = hoverOnSelectedDress;
        builder.moveToElement(element).build().perform();
    }
    public void clickMoreButton() {moreButtonClick.click();}
    public void enterQuantityOfDress() {quantity_Dress.sendKeys("2");}
    public void clearQuantityField() {quantity_Dress.clear();}
    public void selectDressSize() {Select size = new Select(size_Dress);
    size.selectByVisibleText("M");}
    public void clickAddToCart() {add_Cart.click();}
    public void clickCheckOut1() {checkOut_proceed1.click();}
    public void clickCheckOut2() {checkOut_proceed2.click();}
    public void clickAddCheckBox() {address_Checkbox.click();}
    public void typeOrderMessage() {order_message.sendKeys("Selected Order confirmed");}
    public void clickCheckOut3() {checkOut_Proceed3.click();}
    public void clickTermsCheckBox() {terms_checkBox.click();}
    public void clickWirePayment() {payment_bankWire.click();}
    public void clickChequePayment() {payment_cheque.click();}
    public void assertBankWirePay() {String BankWireMessage = wire_orderSummary.getText();
    System.out.println(BankWireMessage);}
    public void clickOrderConfirmButton() {payment_confirmOrder.click();}
    public void orderComplete() {String OrderConfirmation = orderConfirm_message.getText();
    System.out.println(OrderConfirmation);}
    public void clickSignOutButton() {signOut.click();}
    public void assertSignedOutUser() {String SignIn = signInLink.getText();
    System.out.println(SignIn);}



}
