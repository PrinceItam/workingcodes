package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class purchase5Page {

    @FindBy(how = How.XPATH, using = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
    public static WebElement dresses;

    @FindBy(how = How.XPATH, using = "//*[@id=\"categories_block_left\"]/div/ul/li[3]/a" )
    public static WebElement summerdresses;

    @FindBy(how = How.NAME, using = "Green")
    public static WebElement colourgreen;

    @FindBy(how = How.ID, using = "quantity_wanted")
    public static WebElement addquantiy;

    @FindBy(how = How.ID, using = "quantity_wanted")
    public static WebElement addquantiy1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"add_to_cart\"]/button/span")
    public static WebElement addcart;

    @FindBy(how = How.XPATH, using = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    public static WebElement proceedcheckout1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/p[2]/a[1]/span ")
    public static WebElement proceedcheckout2;

    @FindBy(how = How.ID, using ="email")
    public static WebElement Email;

    @FindBy(how = How.ID, using ="passwd")
    public static WebElement Password;

    @FindBy(how = How.XPATH, using = "//*[@id=\"SubmitLogin\"]/span")
    public static WebElement signin;

    @FindBy(how = How.XPATH, using = "//*[@id=\"ordermsg\"]/textarea")
    public static WebElement sendcomments;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/form/p/button/span")
    public static WebElement proceedcheckout3;

    @FindBy(how = How.ID, using = "cgv")
    public static WebElement termsofservice;

    @FindBy(how = How.XPATH, using = "//*[@id=\"form\"]/p/button/span")
    public static WebElement confirmcheckout1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")
    public static WebElement payviacheck;

    @FindBy(how = How.XPATH, using = "//*[@id=\"cart_navigation\"]/button/span")
    public static WebElement confirmorder;




    public void selectdresses() {dresses.click();}
    public void selectsummerdress() {summerdresses.click();}
    public void selectgreen() {colourgreen.click();}
    public void increasesizes() {addquantiy.clear();}
    public void morequantity() {addquantiy1.sendKeys("35");}
    public void clickaddcart() {addcart.click();}
    public void clickproceedcheckout1() {proceedcheckout1.click();}
    public void clickproceedcheckout2() {proceedcheckout2.click();}
    public void selectemail() {Email.sendKeys("noyikowo@gmail.com");}
    public void selectpassword() {Password.sendKeys("noyikowo");}
    public void clicksignin() {signin.click();}
    public void writecomments() {sendcomments.sendKeys("I love you so much Ifeoluwa Itam");}
    public void clickproceedcheckout() {proceedcheckout3.click();}
    public void clickontermsofservice() {termsofservice.click();}
    public void selectconfirmcheckout1() {confirmcheckout1.click();}
    public void selectpayviacheck() {payviacheck.click();}
    public void clickconfirmorder() {confirmorder.click();}
}





