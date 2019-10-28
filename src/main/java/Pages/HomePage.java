package Pages;

import Base.TestBase;
import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {


    @FindBy(xpath="//img[@src='/Contents/Assets/themes/falcon2018/img/logo-blue.png']")
    WebElement HomePageLogo;

    @FindBy(xpath="//a[text()='Partner Home']")
    WebElement PartnerHome;

    @FindBy(xpath="//a[text()='Manage Team']")
    WebElement ManageTeam;




    public HomePage(){
        PageFactory.initElements(driver, this);
    }


    public boolean verify_HomePageLogo() throws Exception{
        Utils.HEY(HomePageLogo);
        return HomePageLogo.isDisplayed();
    }


    public boolean verify_PartnerHome() throws Exception{
        Utils.HEY(PartnerHome);
        return PartnerHome.isDisplayed();
    }


    public boolean verify_ManageTeam() throws Exception{
        Utils.HEY(ManageTeam);
        return ManageTeam.isDisplayed();
    }






}
