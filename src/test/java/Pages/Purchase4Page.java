package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Purchase4Page {

    @FindBy(how = How.XPATH, using = "//*[@id=\"add_to_cart\"]/button/span")
    public static WebElement AddToCart;

    @FindBy(how = How.XPATH, using = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    public static WebElement ProceedToCheckOut;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
    public static WebElement Proceed;

    @FindBy(how = How.ID, using = "email")
    public static WebElement EmailAddress;

    @FindBy(how = How.ID, using = "passwd")
    public static WebElement MyPassword;

    @FindBy(how = How.XPATH, using = "//*[@id=\"SubmitLogin\"]/span")
    public static WebElement Login;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/form/p/button/span")
    public static WebElement SubmitOrder;

    @FindBy(how = How.NAME, using = "cgv")
    public static WebElement CheckBox;

    @FindBy(how = How.XPATH, using = "//*[@id=\"form\"]/p/button/span")
    public static WebElement SubmitAgain;

    @FindBy(how = How.XPATH, using = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a/span")
    public static WebElement Pay;


    @FindBy(how = How.XPATH, using = "//*[@id=\"cart_navigation\"]/button/span")
    public static WebElement Confirm;


    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/p[1]")
    public static WebElement OrderSuccess;






    public void clickAddToCart() {AddToCart.click();}

    public void clickProceedToCheckOut() {ProceedToCheckOut.click();}

    public void clickProceed() {Proceed.click();}

    public void typeEmailAddress() {EmailAddress.sendKeys("okey2@gmail.com");}

    public void typePassword() {MyPassword.sendKeys("chukwu");}

    public void clickLogin() {Login.click();}

    public void clickSubmitOrder() {SubmitOrder.click();}

    public void clickCheckBox() {CheckBox.click();}

    public void clickSubmitAgain() {SubmitAgain.click();}

    public void clickPay() {Pay.click();}

    public void clickConfirm() {Confirm.click();}

    public void assertOrderSuccess() {String NameOFOrderSuccess = OrderSuccess.getText();
        System.out.println(NameOFOrderSuccess);}


}
