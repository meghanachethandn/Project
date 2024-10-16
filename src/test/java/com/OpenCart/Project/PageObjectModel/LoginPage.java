package com.OpenCart.Project.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//input[@id='input-email']") @CacheLookup private WebElement txteMailAddress;
@FindBy(xpath="//input[@id='input-password']") @CacheLookup private WebElement txtpassword;
@FindBy(xpath="//div[@class='mb-3']//a[normalize-space()='Forgotten Password']") @CacheLookup private WebElement lnkforgottenPassword;
@FindBy(xpath="//input[@value='Login']") @CacheLookup private WebElement btnlogin;
@FindBy(xpath="//input[@value='Login']") @CacheLookup private WebElement warningAlert;
@FindBy(xpath="//*[@id='account-login']/div[1]") @CacheLookup private WebElement worngEmailOrPasswordWarningAlert;

//*[@id="account-login"]/div[1]

//Action methods
public void setEmailAddress(String email) {
	txteMailAddress.sendKeys(email);
}
public void setPassword(String password) {
	txtpassword.sendKeys(password);
}
public void clickForgottenPassword() {
	lnkforgottenPassword.click();
}
public void clickLogin() {
	btnlogin.click();
}
public void visibleForgottenPasswordLink() {
	try {
		if(lnkforgottenPassword.isDisplayed()) {
			if(lnkforgottenPassword.isEnabled()) {
				//String forgottenpassword =lnkforgottenPassword.getText();
				lnkforgottenPassword.click();
			}
		}
		
	}
	catch(Exception e){
		System.out.println("Forgotten password link is not visible/enabled");
	}

}
public String warningAlertMessage() {
	try{
		if(warningAlert.isDisplayed()) {
			
			String warningmessage = warningAlert.getText();
			return warningmessage;
		}
	}
	catch(Exception e){
		return("false");	
	}
	return null;
}
public String LoginwarningAlertMessage() {
	try{
		if(worngEmailOrPasswordWarningAlert.isDisplayed()) {
			
			String loginWarningmessage = worngEmailOrPasswordWarningAlert.getText();
			return loginWarningmessage;
		}
	}
	catch(Exception e){
		return("false");	
	}
	return null;
}


}
