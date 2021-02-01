package Pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InvalidLoginPage extends TestBase {

    @FindBy(how = How.ID, using = "email")
    public static WebElement emailUsername;

    @FindBy(how = How.ID, using = "passwd")
    public static WebElement passWord;

    @FindBy(how = How.ID, using = "SubmitLogin")
    public static WebElement submission;







    public void userEmailId() {emailUsername.sendKeys("email");
    }
    public void userPassword() {passWord.sendKeys("password");
    }
    public void submissionButton() {submission.click();}

}
