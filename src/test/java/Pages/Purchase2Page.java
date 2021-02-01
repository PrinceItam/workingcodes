package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Purchase2Page {

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
    public static WebElement selectProduct;

    @FindBy(how = How.XPATH, using = "//*[@id=\"quantity_wanted\"]")
    public static WebElement changeQuantity;

    @FindBy(how = How.XPATH, using = "//*[@id=\"group_1\"]")
    public static WebElement changeSize;

    @FindBy(how = How.CLASS_NAME, using = "Add to cart" )
    public static  WebElement addToCart;

    @FindBy(how = How.XPATH, using ="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")
    public static WebElement proceedtoCheckout;



    public void setSelectProduct() {selectProduct.click();}
    public void setChangeQuantity() {Select number =new Select(changeQuantity);
    number.selectByValue("3");}
    public void setChangeSize() {Select size = new Select(changeSize);
    size.selectByVisibleText("M");}
    public void setAddToCart() {addToCart.click();}
    public void setClickCheckout() {proceedtoCheckout.click();}




}
