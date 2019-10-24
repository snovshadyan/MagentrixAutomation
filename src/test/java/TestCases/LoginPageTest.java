package TestCases;

import Base.TestBase;
import Pages.LoginPage;
import Utilities.Utils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginpage;
    private static Logger log = LogManager.getLogger(LoginPageTest.class);

    public LoginPageTest(){
        super();
    }

    @BeforeMethod
    public void  setup(ITestResult result){
        loginpage = new LoginPage();
        log.info("Testing " + result.getMethod().getMethodName());
    }


    @Test(priority = 1)
    public void TitleTest() {

        String title = driver.getTitle();
        Assert.assertEquals(title, "Guest Home Page | Falcon Tech Community | Trancending Value");
    }


    @Test(priority = 2)
    public void Test_Logo() throws Exception{
        Assert.assertTrue(loginpage.verify_Logo());
    }

    @Test(priority = 3)
    public void Test_TopSignUp() throws Exception{
        Assert.assertTrue(loginpage.verify_TopSignUp());
    }

    @Test(priority = 4)
    public void Test_TopSignIn() throws Exception{
        Assert.assertTrue(loginpage.verify_TopSignIn());
    }

    @Test(priority = 5)
    public void Test_Welcome() throws Exception{
        Assert.assertTrue(loginpage.verify_Welcome());
    }

    @Test(priority = 6)
    public void Test_UserName() throws Exception{
        Assert.assertTrue(loginpage.verify_UserName());
    }

    @Test(priority = 7)
    public void Test_Password() throws Exception{
        Assert.assertTrue(loginpage.verify_Password());
    }

    @Test(priority = 8)
    public void Test_LoginBtn() throws Exception{
        Assert.assertTrue(loginpage.verify_LoginBtn());
    }

    @Test(priority = 9)
    public void Test_RememberMe() throws Exception{
        Assert.assertTrue(loginpage.verify_RememberMe());
    }

    @Test(priority = 10)
    public void Test_ForgotPWD() throws Exception{
        Assert.assertTrue(loginpage.verify_ForgotPWD());
    }

    @Test(priority = 11)
    public void Test_NotMember() throws Exception{
        Assert.assertTrue(loginpage.verify_NotMember());
    }

    @Test(priority = 12)
    public void Test_SignUpBtn() throws Exception{
        Assert.assertTrue(loginpage.verify_SignUpBtn());
    }



    @Test(priority = 13)
    public void Test_WrongLogin() throws Exception{
        Assert.assertTrue(loginpage.verify_WrongLogin());
    }


    @Test(priority = 14)
    public void Test_CorrectLogin() throws Exception{
        Assert.assertTrue(loginpage.verify_CorrectLogin());
    }









    @AfterMethod
    public void getResults(ITestResult result) {

        if (result.getStatus() == ITestResult.FAILURE) {
            Utils.captureScreenshot(driver, result.getMethod().getMethodName() );
            log.info("Test: " + result.getMethod().getMethodName() + " == Failed");
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            log.info("Test: " + result.getMethod().getMethodName() + " == Passed");
        } else if (result.getStatus() == ITestResult.SKIP){
            log.info("Test: " + result.getMethod().getMethodName() + " == Skipped");

        }
    }



}
