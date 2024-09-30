import pages.RecruitmentPage;

public class CreateNewCandidate extends BaseTest{


//Start appium server first on cmd with "appium --address 127.0.0.1 --port 4723" command

    @org.testng.annotations.Test
    public void validTest(){
        recruitmentPage = new RecruitmentPage(appiumDriver);
    }
}
