package Pages;

import Base.TestBase;
import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {


    @FindBy(xpath="//img[@src='/Contents/Assets/themes/falcon2018/img/logo-blue.png']")
    WebElement HomePageLogo;

    @FindBy(xpath="//a[@href='/aspx/My_Home_Partners']")
    WebElement PartnerHome;

    @FindBy(xpath="//a[@href='/aspx/UserRoleAssignment']")
    WebElement ManageTeam;

    @FindBy(xpath = "//a[@href='/Force/force__lead/index']")
    WebElement DealRegistrations;

    @FindBy(xpath = "//a[@href='/Force/force__opportunity/index']")
    WebElement Opportunities;

    @FindBy(xpath = "//a[@href='/Force/force__account/index']")
    WebElement Accounts;

    @FindBy(xpath = "//a[@href='/playbook/resources']")
    WebElement Resources;

    @FindBy(xpath = "//a[@href='/articles/Blog']")
    WebElement MarketingCenter;

    @FindBy(xpath = "//a[@href='/Sys/report/index']")
    WebElement Reports;

    @FindBy(xpath = "//a[@href='/Sys/document/index']")
    WebElement Documents;

    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    WebElement DropDown;

    @FindBy(xpath = "//a[@href='/upcomingevent/calendar']")
    WebElement EventsCalendar;

    @FindBy(xpath = "//a[@href='/lms']")
    WebElement Training;

    @FindBy(xpath = "//a[@href='/Force/force__magentrixprm__mdfrequest__c/index']")
    WebElement MDF;

    @FindBy(xpath = "//a[@href='/marketplace/apps']")
    WebElement Marketplace;

    @FindBy(xpath = "//a[@href='/MarketplaceListing']")
    WebElement MarketplacePublishing;

    @FindBy(xpath = "//a[@href='/idea/index']")
    WebElement Ideas;

    @FindBy(xpath = "//a[@href='/Home/Index']")
    WebElement NewsFeed;

    @FindBy(xpath = "//a[@href='/playbook/partnertraining']")
    WebElement PartnerTraining;

    @FindBy(xpath = "//a[@href='/magentrix_configuration__c/form/7Oa000000000040009Q']")
    WebElement PortalConfiguration;

    @FindBy(xpath = "//a[@href='/Home/showAllTabs']")
    WebElement More;

    @FindBy(xpath = "//span[text()='Accounts']")
    WebElement Accounts2;

    @FindBy(xpath = "//span[text()='Appliance Request Form']")
    WebElement ApplianceRequestForm;

    @FindBy(xpath = "//span[text()='Campaigns']")
    WebElement Campaigns;

    @FindBy(xpath = "//span[text()='Community']")
    WebElement Community;

    @FindBy(xpath = "//span[text()='Customer Home']")
    WebElement CustomerHome;

    @FindBy(xpath = "//span[text()='Deal Registrations']")
    WebElement DealRegistrations2;

    @FindBy(xpath = "//span[text()='Directory']")
    WebElement Directory;

    @FindBy(xpath="//span[text()='Documents']")
    WebElement Documents2;

    @FindBy(xpath = "//span[text()='Engagement Dashboard']")
    WebElement EngagementDashboard;

    @FindBy(xpath = "//span[text()='Events Calendar']")
    WebElement EventsCalendar2;

    @FindBy(xpath = "//span[text()='Falcon Tech Store']")
    WebElement TechStore;

    @FindBy(xpath = "//span[text()='Forums']")
    WebElement Forums;

    @FindBy(xpath = "//span[text()='GoToMeeting']")
    WebElement GoToMeeting;

    @FindBy(xpath = "//span[text()='Groups']")
    WebElement Groups;

    @FindBy(xpath = "//span[text()='Help Tickets']")
    WebElement HelpTickets;

    @FindBy(xpath = "//span[text()='Ideas']")
    WebElement Ideas2;

    @FindBy(xpath="//span[text()='Knowledge Base']")
    WebElement KnowledgeBase;

    @FindBy(xpath = "//span[text()='LL Playbox']")
    WebElement LLPlaybox;

    @FindBy(xpath = "//span[text()='Manage Team']")
    WebElement ManageTeam2;

    @FindBy(xpath = "//span[text()='Marketing Center']")
    WebElement MarketingCenter2;

    @FindBy(xpath = "//span[text()='Marketplace']")
    WebElement Marketplace2;

    @FindBy(xpath = "//span[text()='Marketplace Publishing']")
    WebElement MarketplacePublishing2;

    @FindBy(xpath = "//span[text()='MDF Requests']")
    WebElement MDFRequests;

    @FindBy(xpath = "//span[text()='New Partner Training']")
    WebElement NewPartnerTraining;

    @FindBy(xpath = "//span[text()='Newsfeed']")
    WebElement Newsfeed;

    @FindBy(xpath = "//span[text()='Opportunities']")
    WebElement Opportunities2;

    @FindBy(xpath = "//span[text()='Partner Dashboard']")
    WebElement PartnerDashboard;

    @FindBy(xpath = "//span[text()='Partner Home']")
    WebElement PartnerHome2;

    @FindBy(xpath = "//span[text()='Pipeline']")
    WebElement Pipeline;

    @FindBy(xpath = "//span[text()='Playbooks']")
    WebElement Playbooks;

    @FindBy(xpath = "//span[text()='Portal Configuration']")
    WebElement PortalConfiguration2;

    @FindBy(xpath = "//span[text()='PRM Home']")
    WebElement PRMHome;

    @FindBy(xpath = "//span[text()='Reports']")
    WebElement Reports2;

    @FindBy(xpath = "//span[text()='Resources']")
    WebElement Resources2;

    @FindBy(xpath = "//span[text()='StartHere']")
    WebElement StartHere;

    @FindBy(xpath = "//span[text()='Training']")
    WebElement Training2;

    @FindBy(xpath = "//span[text()='Update Opportunity']")
    WebElement UpdateOpportunity;


















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

    public boolean verify_DealRegistrations() throws Exception{
        Utils.HEY(DealRegistrations);
        return DealRegistrations.isDisplayed();
    }

    public boolean verify_Opportunities() throws Exception{
        Utils.HEY(Opportunities);
        return Opportunities.isDisplayed();
    }

    public boolean verify_Accounts() throws Exception{
        Utils.HEY(Accounts);
        return Accounts.isDisplayed();
    }


    public boolean verify_Resources() throws Exception{
        Utils.HEY(Resources);
        return Resources.isDisplayed();
    }

    public boolean verify_MarketingCenter() throws Exception{
        Utils.HEY(MarketingCenter);
        return MarketingCenter.isDisplayed();
    }


    public boolean verify_Reports() throws Exception{
        Utils.HEY(Reports);
        return Reports.isDisplayed();
    }

    public boolean verify_Documents() throws Exception{
        Utils.HEY(Documents);
        return Documents.isDisplayed();
    }

    public boolean verify_DropDown() throws Exception{
        Utils.HEY(DropDown);
        DropDown.click();
        Thread.sleep(500);
        Utils.HEY(EventsCalendar);
//        Utils.WFEV(By.xpath("//a[@href='/upcomingevent/calendar']"));
        return EventsCalendar.isDisplayed();
    }

    public boolean verify_Training() throws Exception{
        Utils.HEY(Training);
        return Training.isDisplayed();
    }

    public boolean verify_MDF() throws Exception{
        Utils.HEY(MDF);
        return MDF.isDisplayed();
    }

    public boolean verify_Marketplace() throws Exception{
        Utils.HEY(Marketplace);
        return Marketplace.isDisplayed();
    }

    public boolean verify_MarketplacePublishing() throws Exception{
        Utils.HEY(MarketplacePublishing);
        return MarketplacePublishing.isDisplayed();
    }


    public boolean verify_Ideas() throws Exception{
        Utils.HEY(Ideas);
        return Ideas.isDisplayed();
    }

    public boolean verify_NewsFeed() throws Exception{
        Utils.HEY(NewsFeed);
        return NewsFeed.isDisplayed();
    }

    public boolean verify_PartnerTraining() throws Exception{
        Utils.HEY(PartnerTraining);
        return PartnerTraining.isDisplayed();
    }

    public boolean verify_PortalConfiguration() throws Exception{
        Utils.HEY(PortalConfiguration);
        return PortalConfiguration.isDisplayed();
    }

    public boolean verify_More() throws Exception{
        Utils.HEY(More);
        return More.isDisplayed();
    }

    public boolean verify_Accounts2() throws Exception{
        More.click();
        Thread.sleep(500);
        Utils.HEY(Accounts2);
        return Accounts2.isDisplayed();
    }

    public boolean verify_ApplianceRequestForm() throws Exception{
        Utils.HEY(ApplianceRequestForm);
        return ApplianceRequestForm.isDisplayed();
    }

    public boolean verify_Campaigns() throws Exception{
        Utils.HEY(Campaigns);
        return Campaigns.isDisplayed();
    }

    public boolean verify_Community() throws Exception{
        Utils.HEY(Community);
        return Community.isDisplayed();
    }

    public boolean verify_CustomerHome() throws Exception{
        Utils.HEY(CustomerHome);
        return CustomerHome.isDisplayed();
    }

    public boolean verify_DealRegistrations2() throws Exception{
        Utils.HEY(DealRegistrations2);
        return DealRegistrations2.isDisplayed();
    }

    public boolean verify_Directory() throws Exception{
        Utils.HEY(Directory);
        return Directory.isDisplayed();
    }

    public boolean verify_Documents2() throws Exception{
        Utils.HEY(Documents2);
        return Documents2.isDisplayed();
    }

    public boolean verify_EngagementDashboard() throws Exception{
        Utils.HEY(EngagementDashboard);
        return EngagementDashboard.isDisplayed();
    }

    public boolean verify_EventsCalendar2() throws Exception{
        Utils.HEY(EventsCalendar2);
        return EventsCalendar2.isDisplayed();
    }

    public boolean verify_TechStore() throws Exception{
        Utils.HEY(TechStore);
        return TechStore.isDisplayed();
    }

    public boolean verify_Forums() throws Exception{
        Utils.HEY(Forums);
        return Forums.isDisplayed();
    }

    public boolean verify_GoToMeeting() throws Exception{
        Utils.HEY(GoToMeeting);
        return GoToMeeting.isDisplayed();
    }


    public boolean verify_Groups() throws Exception{
        Utils.HEY(Groups);
        return Groups.isDisplayed();
    }

    public boolean verify_HelpTickets() throws Exception{
        Utils.HEY(HelpTickets);
        return HelpTickets.isDisplayed();
    }

    public boolean verify_Ideas2() throws Exception{
        Utils.HEY(Ideas2);
        return Ideas2.isDisplayed();
    }

    public boolean verify_KnowledgeBase() throws Exception{
        Utils.HEY(KnowledgeBase);
        return KnowledgeBase.isDisplayed();
    }

    public boolean verify_LLPlaybox() throws Exception{
        Utils.HEY(LLPlaybox);
        return LLPlaybox.isDisplayed();
    }


    public boolean verify_ManageTeam2() throws Exception{
        Utils.HEY(ManageTeam2);
        return ManageTeam2.isDisplayed();
    }

    public boolean verify_MarketingCenter2() throws Exception{
        Utils.HEY(MarketingCenter2);
        return MarketingCenter2.isDisplayed();
    }

    public boolean verify_Marketplace2() throws Exception{
        Utils.HEY(Marketplace2);
        return Marketplace2.isDisplayed();
    }

    public boolean verify_MarketplacePublishing2() throws Exception{
        Utils.HEY(MarketplacePublishing2);
        return MarketplacePublishing2.isDisplayed();
    }

    public boolean verify_MDFRequests() throws Exception{
        Utils.HEY(MDFRequests);
        return MDFRequests.isDisplayed();
    }

    public boolean verify_NewPartnerTraining() throws Exception{
        Utils.HEY(NewPartnerTraining);
        return NewPartnerTraining.isDisplayed();
    }

    public boolean verify_Newsfeed() throws Exception{
        Utils.HEY(Newsfeed);
        return Newsfeed.isDisplayed();
    }

    public boolean verify_Opportunities2() throws Exception{
        Utils.HEY(Opportunities2);
        return Opportunities2.isDisplayed();
    }


    public boolean verify_PartnerDashboard() throws Exception{
        Utils.HEY(PartnerDashboard);
        return PartnerDashboard.isDisplayed();
    }

    public boolean verify_PartnerHome2() throws Exception{
        Utils.HEY(PartnerHome2);
        return PartnerHome2.isDisplayed();
    }

    public boolean verify_Pipeline() throws Exception{
        Utils.HEY(Pipeline);
        return Pipeline.isDisplayed();
    }

    public boolean verify_Playbooks() throws Exception{
        Utils.HEY(Playbooks);
        return Playbooks.isDisplayed();
    }

    public boolean verify_PortalConfiguration2() throws Exception{
        Utils.HEY(PortalConfiguration2);
        return PortalConfiguration2.isDisplayed();
    }


    public boolean verify_PRMHome() throws Exception{
        Utils.HEY(PRMHome);
        return PRMHome.isDisplayed();
    }

    public boolean verify_Reports2() throws Exception{
        Utils.HEY(Reports2);
        return Reports2.isDisplayed();
    }

    public boolean verify_Resources2() throws Exception{
        Utils.HEY(Resources2);
        return Resources2.isDisplayed();
    }

    public boolean verify_StartHere() throws Exception{
        Utils.HEY(StartHere);
        return StartHere.isDisplayed();
    }

    public boolean verify_Training2() throws Exception{
        Utils.HEY(Training2);
        return Training2.isDisplayed();
    }

    public boolean verify_UpdateOpportunity() throws Exception{
        Utils.HEY(UpdateOpportunity);
        return UpdateOpportunity.isDisplayed();
    }








}
