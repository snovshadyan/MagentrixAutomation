package Pages;

import Base.TestBase;
import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends TestBase {

@FindBy(xpath = "//img[@src='/Contents/Assets/themes/falcon2018/img/logo-blue.png']")
    WebElement Logo;

@FindBy(xpath="//a[@class='signup-link']")
    WebElement TopSignUp;

@FindBy(xpath="//a[@class='signin-link']")
    WebElement TopSignIn;

@FindBy(xpath="//p[text()='Welcome to the portal.']")
    WebElement Welcome;

@FindBy(xpath="//input[@id='UserName']")
    WebElement UserName;

@FindBy(xpath = "//input[@id='Password']")
    WebElement Password;

@FindBy(xpath="//input[@value='Login']")
    WebElement LoginBtn;

@FindBy(xpath = "//input[@name='RememberMe']")
    WebElement RememberMe;

@FindBy(xpath = "//a[text()='Forgot your password']")
    WebElement ForgotPWD;

@FindBy(xpath = "//h4[text()='Not a Member Yet?']")
    WebElement NotMember;

@FindBy(xpath = "//a[text()='Sign Up']")
    WebElement SignUpBtn;


@FindBy(xpath = "//span[text()='Too many retries.  Please try again at a later time.']")
WebElement Error;

@FindBy(xpath = "//a[text()='Partner Home']")
WebElement Home;


    public LoginPage(){
        PageFactory.initElements(driver, this);
    }


    public boolean verify_Logo() throws Exception{
        Utils.HEY(Logo);
        return Logo.isDisplayed();
    }

    public boolean verify_TopSignUp() throws Exception{
        Utils.HEY(TopSignUp);
        return TopSignUp.isDisplayed();
    }

    public boolean verify_TopSignIn() throws Exception{
        Utils.HEY(TopSignIn);
        return TopSignIn.isDisplayed();
    }

    public boolean verify_Welcome() throws Exception{
        Utils.HEY(Welcome);
        return Welcome.isDisplayed();
    }

    public boolean verify_UserName() throws Exception{
        Utils.HEY(UserName);
        return UserName.isDisplayed();
    }

    public boolean verify_Password() throws Exception{
        Utils.HEY(Password);
        return Password.isDisplayed();
    }

    public boolean verify_LoginBtn() throws Exception{
        Utils.HEY(LoginBtn);
        return LoginBtn.isDisplayed();
    }

    public boolean verify_RememberMe() throws Exception{
        Utils.HEY(RememberMe);
        return RememberMe.isDisplayed();
    }

    public boolean verify_ForgotPWD() throws Exception{
        Utils.HEY(ForgotPWD);
        return ForgotPWD.isDisplayed();
    }

    public boolean verify_NotMember() throws Exception{
        Utils.HEY(NotMember);
        return NotMember.isDisplayed();
    }

    public boolean verify_SignUpBtn() throws Exception{
        Utils.HEY(SignUpBtn);
        return SignUpBtn.isDisplayed();
    }


    public boolean verify_WrongLogin() throws Exception{
        UserName.sendKeys(prop.getProperty("WrongUsername"));
        Password.sendKeys(prop.getProperty("WrongPassword"));
        LoginBtn.click();
        Thread.sleep(500);
        return Error.isDisplayed();
    }



    public boolean verify_CorrectLogin() throws Exception{

        UserName.clear();
        Password.clear();
        Thread.sleep(500);
        UserName.sendKeys(prop.getProperty("Username"));
        Password.sendKeys(prop.getProperty("Password"));
        LoginBtn.click();
//        Utils.WFEV(By.xpath("//a[text()='Partner Home']"));
        Thread.sleep(2000);
        return Home.isDisplayed();

    }



}
