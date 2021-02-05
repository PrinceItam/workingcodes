package Pages;

import Base.TestBase;
import org.apache.xalan.xsltc.runtime.ErrorMessages;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class InvalidLoginPage extends TestBase {

    @FindBy(how = How.ID, using = "email")
    public static WebElement emailUsername;

    @FindBy(how = How.ID, using = "passwd")
    public static WebElement passWord;

    @FindBy(how = How.ID, using = "SubmitLogin")
    public static WebElement submission;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div[1]/ol/li")
    public static WebElement errorMessage;





    public void enterwrongemail(String email) {emailUsername.sendKeys(email);}
    public void submissionButton() {submission.click();}
    public void selectErrorMessage(String ErrorMessage)
    {String ExpectedErrorMessage = ErrorMessage;
    String ActualErrorMessage = errorMessage.getText();
    Assert.assertEquals(ExpectedErrorMessage, ActualErrorMessage);
    System.out.println(ActualErrorMessage);
    }


    public void enterpassword(String password)  {passWord.sendKeys(password);}
}
