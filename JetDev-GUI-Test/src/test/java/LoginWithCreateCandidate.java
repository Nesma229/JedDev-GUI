import org.testng.Assert;
import org.testng.annotations.Test;
import static utils.DataDrivenReaderClass.JsonClass.readJson;

public class LoginWithCreateCandidate extends BaseTest{

 String jsonLoginFilePath = "D:\\selenium projects\\JetDev-GUI-Test\\src\\test\\resources\\loginData.json";
 String jsonCandidateInfoFilePath = "D:\\selenium projects\\JetDev-GUI-Test\\src\\test\\resources\\candidateInfoData.json";


    @Test
    public void loginWithCreateNewCandidate(){
     String actualResult =   loginPage.fillUserNameAndPasswordFields(
                        readJson(jsonLoginFilePath,"userName"),
                        readJson(jsonLoginFilePath,"password"))
                .clickLoginBtn()
                .clickRecruitmentBtn()
                .clickAddBtn()
                .fillFullName(
                        readJson(jsonCandidateInfoFilePath,"firstName"),
                        readJson(jsonCandidateInfoFilePath,"middleName"),
                        readJson(jsonCandidateInfoFilePath,"lastName"))
                .selectVacancy()
                .fillEmailField(readJson(jsonCandidateInfoFilePath,"email"))
                .fillContactNoField(readJson(jsonCandidateInfoFilePath,"contactNumber"))
                //.fillDateOfApplication(readJson(jsonCandidateInfoFilePath,"dateOfApplication"))
                //.checkedConsentKeepData()
               //.uploadAttachment("//C:/Users/Desha/Desktop/helloooo.pdf")
                .clickSaveCandidate()
             .getSuccessMsg();

        Assert.assertTrue(actualResult.contains("Success"), "Expected 'Success' but found: "+ actualResult);
    }
}
