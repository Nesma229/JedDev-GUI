package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utils.CustomMethods;

public class RecruitmentPage {
   private WebDriver driver;
    public RecruitmentPage(WebDriver driver) {
        this.driver = driver;
    }


private final By addNewCandidateBtn = By.xpath("//div[@class=\"orangehrm-header-container\"]//button[contains(@class,'secondary')]");
private final By firstNameField = By.xpath("//input[@name='firstName']");
private final By middleNameField = By.xpath("//input[@name='middleName']");
private final By lastNameField = By.xpath("//input[@name='lastName']");
private final By vacancyExpandBtn = By.xpath("//div[@class='oxd-select-text--after']");
private final By secondSelection = By.xpath("//div[@role='listbox']//div[1]");
//label[text()='Email']
private final By emailField = By.xpath("//label[text()='Email']//following::input[@class='oxd-input oxd-input--active'][1]");
private final By contactNoField = By.xpath("//label[text()='Contact Number']//following::input[@class='oxd-input oxd-input--active'][1]");
private final By uploadFileField = By.xpath("//input[@type='file']");
private final By dateOfApplicationField = By.xpath("//label[text()='Date of Application']//following::input[@class='oxd-input oxd-input--focus'][1]");
private final By consentKeepDataCheckBox = By.xpath("//i[contains(@class,'oxd-icon bi-check')]");
private final By saveBtn = By.xpath("//button[contains(@class,'secondary orangehrm-left-space')]");
private final By successToastMessage = By.xpath("//div[contains(@class,'toast-container oxd-toast')]//p");

@Step
public RecruitmentPage clickAddBtn(){
        CustomMethods.click(driver, addNewCandidateBtn);
        return new RecruitmentPage(driver);
    }

    @Step
    public RecruitmentPage fillFullName(String firstName, String middleName, String lastName){
        CustomMethods.findElementVisible(driver, firstNameField).sendKeys(firstName);
        CustomMethods.findElementVisible(driver, middleNameField).sendKeys(middleName);
        CustomMethods.findElementVisible(driver, lastNameField).sendKeys(lastName);
        return new RecruitmentPage(driver);
    }

    @Step
    public RecruitmentPage selectVacancy(){
        CustomMethods.click(driver,vacancyExpandBtn);
        CustomMethods.click(driver, secondSelection);
        return new RecruitmentPage(driver);
    }

    @Step
    public RecruitmentPage fillEmailField(String email){
       CustomMethods.findElementVisible(driver,emailField).sendKeys(email);
        return new RecruitmentPage(driver);
    }
    @Step
    public RecruitmentPage fillContactNoField(String contactNo){
        CustomMethods.findElementVisible(driver, contactNoField).sendKeys(contactNo);
        return new RecruitmentPage(driver);
    }
    @Step
    public RecruitmentPage fillDateOfApplication(String dateOfApplication){
        Actions action = new Actions(driver);
        action.moveToElement(CustomMethods.findElementVisible(driver,dateOfApplicationField)).click().build().perform();
        CustomMethods.findElementVisible(driver,dateOfApplicationField).clear();
        CustomMethods.findElementVisible(driver,dateOfApplicationField).sendKeys(dateOfApplication);
//        CustomMethods.clickUsingJavaScript(driver,dateOfApplicationField);
//        CustomMethods.findElementVisible(driver, dateOfApplicationField).sendKeys(Keys.CONTROL,Keys.chord("a",Keys.BACK_SPACE));
//        CustomMethods.findElementVisible(driver,dateOfApplicationField).sendKeys(dateOfApplication);
        return new RecruitmentPage(driver);
    }

    @Step
    public RecruitmentPage uploadAttachment(String filePath){
        CustomMethods.findElementVisible(driver, uploadFileField).sendKeys(filePath);
        return new RecruitmentPage(driver);
    }

    @Step
    public RecruitmentPage checkedConsentKeepData(){
        CustomMethods.clickUsingJavaScript(driver,consentKeepDataCheckBox);
        return new RecruitmentPage(driver);
    }
    @Step
    public RecruitmentPage clickSaveCandidate(){
        CustomMethods.click(driver,saveBtn);
        return new RecruitmentPage(driver);
    }

    @Step
    public String getSuccessMsg(){
       return CustomMethods.findElementVisible(driver,successToastMessage).getText();
    }


}
