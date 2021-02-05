

package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Purchase1Page {


    @FindBy(how = How.XPATH, using = "//*[@id=\"email\"]")
    public static WebElement userName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"passwd\"]")
    public static WebElement passWord;

    @FindBy(how = How.XPATH, using = "//*[@id=\"SubmitLogin\"]/span")
    public static WebElement logIn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
    public static WebElement Menu;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[2]/span")
    public static WebElement quantity;

    @FindBy(how = How.ID, using = "quantity_wanted")
    public static WebElement cleanQuantity;

    @FindBy(how = How.ID, using = "quantity_wanted")
    public static WebElement changeQuantity;

    @FindBy(how = How.ID, using = "group_1")
    public static WebElement Size;

    @FindBy(how = How.XPATH, using = "//*[@id=\"add_to_cart\"]/button/span")
    public static WebElement clickout;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]")
    public static WebElement enterBasket;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
    public static WebElement firstcheckOut;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/p[2]/a[1]/span ")
    public static WebElement secondCheckout;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/form/p/button/span")
    public static WebElement thirdCheckout;

    @FindBy(how = How.ID, using = "cgv")
    public static WebElement agreeToTandC;

    @FindBy(how = How.XPATH, using = "//*[@id=\"form\"]/p/button/span")
    public static WebElement confirmation1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")
    public static WebElement payment;

    @FindBy(how = How.XPATH, using = "//*[@id=\"cart_navigation\"]/button/span")
    public static WebElement confirmPayment;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/p[1]")
    public static WebElement orderConfirmation;


    public void selectemailID() {userName.sendKeys("bidemi2020@yahoo.com");}
    public void selectPassword() {passWord.sendKeys("Poiuy123");}
    public void clickLogin() {logIn.click();}
    public void clickMenu() {Menu.click();}
    public void clickMore() {}
    public void selectQuantity() {quantity.click();}
    public void clearQuantity() {cleanQuantity.clear();}
    public void sendQuantity() {changeQuantity.sendKeys("3");}
    public void selectSize() {Select state =new Select(Size);
        state.selectByVisibleText("L");}
    public void clickAway() {clickout.click();}
    public void clickCart() {enterBasket.click();}
    public void checkoutone() {firstcheckOut.click();}
    public void checkouttwo() {secondCheckout.click();}
    public void checkoutthree() {thirdCheckout.click();}
    public void termsandconditions() {agreeToTandC.click();}
    public void confirmation() {confirmation1.click();}
    public void makePayment() {payment.click();}
    public void paymentConfirm() {confirmPayment.click();}
    public void confirmOrder() { String OrderSummary = orderConfirmation.getText();
    System.out.println(OrderSummary);
    }


}
