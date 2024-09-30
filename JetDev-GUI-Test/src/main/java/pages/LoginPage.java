package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.CustomMethods;

public class LoginPage {
 private WebDriver driver;
 public LoginPage(WebDriver driver){
     this.driver = driver;
 }


 private final By userNameField = By.xpath("//input[@name='username']");
 private final By passwordField = By.xpath("//input[@name='password']");
 private final By loginBtn = By.xpath("//button[@type='submit']");

 @Step
public LoginPage  fillUserNameAndPasswordFields(String userName, String password){
 CustomMethods.findElementVisible(driver, userNameField).sendKeys(userName);
 CustomMethods.findElementVisible(driver, passwordField).sendKeys(password);
 return this;
}

@Step
 public HomePage clickLoginBtn(){
  CustomMethods.click(driver,loginBtn);
  return new HomePage(driver);
 }



}


