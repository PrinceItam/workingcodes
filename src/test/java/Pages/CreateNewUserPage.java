package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CreateNewUserPage {
    public  int random;
    @FindBy(how = How.CLASS_NAME, using = "login")
    public static WebElement signInLink;

    @FindBy(how = How.XPATH, using = "//*[@id=\"SubmitCreate\"]/span")
    public static WebElement createNewUserButton;

    @FindBy(how = How.ID, using = "id_gender1")
    public static WebElement gender;

    @FindBy(how = How.NAME, using = "customer_firstname")
    public static WebElement UserFirstname;

    @FindBy(how = How.NAME, using = "customer_lastname")
    public static WebElement UserLastname;

    @FindBy(how = How.XPATH, using = "//*[@id=\"passwd\"]")
    public static WebElement password;

    @FindBy(how = How.XPATH, using = "//*[@id=\"days\"]")
    public static WebElement DOBDay;

    @FindBy(how = How.XPATH, using = "//*[@id=\"months\"]")
    public static WebElement DOB_Month;

    @FindBy(how = How.XPATH, using = "//*[@id=\"years\"]")
    public static WebElement DOB_Year;

    @FindBy(how = How.ID, using = "newsletter")
    public static WebElement newsletter;

    @FindBy(how = How.ID, using = "optin")
    public static WebElement optin;

    @FindBy(how = How.ID, using = "company")
    public static WebElement company;

    @FindBy(how = How.ID, using = "address1")
    public static WebElement UserAdd;

    @FindBy(how = How.ID, using = "city")
    public static WebElement userCity;

    @FindBy(how = How.ID, using = "id_state")
    public static WebElement State;

    @FindBy(how = How.ID, using = "postcode")
    public static WebElement AddPostCode;

    @FindBy(how = How.NAME, using = "phone_mobile")
    public static WebElement phoneNumber;

    @FindBy(how = How.ID, using = "alias")
    public static WebElement addAlias;

    @FindBy(how = How.ID, using = "submitAccount")
    public static WebElement registerButton;

    @FindBy(how = How.ID, using = "email_create")
    public static WebElement newUserEmail;

    @FindBy(how =How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")
    public static WebElement LoggedInUser;






    public void enterRandomEmail()  {random = 100 + (int)(Math.random()* (1000-1) + 1);
    newUserEmail.sendKeys("lanre.ikuesan" + random + "@gmail.com");}
    public void clickSignIn() {signInLink.click();}
    public void clickCreateNewUserButton() {createNewUserButton.click();}
    public void selectGender() {gender.click();}
    public void typeFirstname() {UserFirstname.sendKeys("Faith");}
    public void typeLastname() {UserLastname.sendKeys("Okey");}
    public void typepassword() {password.sendKeys("automation");}
    public void selectDOBDay() {Select day =new Select(DOBDay);
    day.selectByValue("23");}
    public void selectDOBMonth() {Select month = new Select(DOB_Month);
    month.selectByIndex(2);}
    public void selectDOBYear() {Select year =new Select(DOB_Year);
    year.selectByValue("1998");}
    public void SelectNewsletter() {newsletter.click();}
    public void SelectOptin() {optin.click();}
    public void typeCompany() {company.sendKeys("FaithBev Ltd");}
    public void typeAddress() {UserAdd.sendKeys("3 prince street automation island");}
    public void typeCity() {userCity.sendKeys("Chicago");}
    public void selectState() {Select state =new Select(State);
    state.selectByVisibleText("Illinois");}
    public void typephonenumber() {phoneNumber.sendKeys("123456789");}
    public void typePostcode() {AddPostCode.sendKeys("00000");}
    public void typeAlias() {addAlias.sendKeys("FaithBev House");}
    public void clickRegisterButton() {registerButton.click();}
    public void assertLoggedInUser() { String NameOfLoggedInUSer = LoggedInUser.getText();
    System.out.println(NameOfLoggedInUSer);

    }

}
