package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.CustomMethods;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private final By recruitmentBtn = By.xpath("//ul[@class='oxd-main-menu']//li[5]");

@Step
    public RecruitmentPage clickRecruitmentBtn(){
        CustomMethods.click(driver, recruitmentBtn);
        return new RecruitmentPage(driver);
    }


}
