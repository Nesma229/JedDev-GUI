package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class RecruitmentPage {

    private AppiumDriver appiumDriver;
    public RecruitmentPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
    }


    private final By addNewCandidateBtn = By.xpath("//div[@class=\"orangehrm-header-container\"]//button[contains(@class,'secondary')]");
    private final By firstNameField = By.xpath("//input[@name='firstName']");
    private final By middleNameField = By.xpath("//input[@name='middleName']");
    private final By lastNameField = By.xpath("//input[@name='lastName']");
    private final By vacancyExpandBtn = By.xpath("//div[@class='oxd-select-text--after']");
    private final By secondSelection = By.xpath("//div[@role='listbox']//div[1]");
    private final By emailField = By.xpath("//label[text()='Email']//following::input[@class='oxd-input oxd-input--active'][1]");
    private final By contactNoField = By.xpath("//label[text()='Contact Number']//following::input[@class='oxd-input oxd-input--active'][1]");
    private final By uploadFileField = By.xpath("//input[@type='file']");
    private final By dateOfApplicationField = By.xpath("//label[text()='Date of Application']//following::input[@class='oxd-input oxd-input--focus'][1]");
    private final By consentKeepDataCheckBox = By.xpath("//i[contains(@class,'oxd-icon bi-check')]");
    private final By saveBtn = By.xpath("//button[contains(@class,'secondary orangehrm-left-space')]");
    private final By successToastMessage = By.xpath("//div[contains(@class,'toast-container oxd-toast')]//p");


}
