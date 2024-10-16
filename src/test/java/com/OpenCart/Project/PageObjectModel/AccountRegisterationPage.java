package com.OpenCart.Project.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegisterationPage {
	
	WebDriver driver;
	public AccountRegisterationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

@FindBy(xpath="//input[@id='input-firstname']") @CacheLookup private WebElement txtfirstName;
@FindBy(xpath="//input[@id='input-lastname']") @CacheLookup private WebElement txtlastName;
@FindBy(xpath="//input[@id='input-email']") @CacheLookup private WebElement txtEMail;
@FindBy(xpath="//input[@id='input-telephone']") @CacheLookup private WebElement txttelephone;
@FindBy(xpath="//input[@id='input-password']") @CacheLookup private WebElement txtpassword;
@FindBy(xpath="//input[@id='input-confirm']") @CacheLookup private WebElement txtpasswordConfirm;
@FindBy(xpath="//label[normalize-space()='Yes']") @CacheLookup private WebElement rdobtnnewsletterYes;
@FindBy(xpath="//label[normalize-space()='No']") @CacheLookup private WebElement rdobtnnewsletterNo;
@FindBy(xpath="//input[@name='agree']") @CacheLookup private WebElement chkbagree;
@FindBy(xpath="//input[@value='Continue']") @CacheLookup private WebElement btncontinue;
@FindBy(xpath="//div[contains(text(),'First Name must be between 1 and 32 characters!')]") @CacheLookup private WebElement WarningMsgOfFirstName;
@FindBy(xpath="//div[contains(text(),'Last Name must be between 1 and 32 characters!')]") @CacheLookup private WebElement WarningMsgOfLastName;
@FindBy(xpath="//div[contains(text(),'E-Mail Address does not appear to be valid!')]") @CacheLookup private WebElement WarningMsgOfEMailAddress;
@FindBy(xpath="//div[contains(text(),'Telephone must be between 3 and 32 characters!')]") @CacheLookup private WebElement WarningMsgOfTelephone;
@FindBy(xpath="//div[contains(text(),'Password must be between 4 and 20 characters!')]") @CacheLookup private WebElement WarningMsgOfPassword;
@FindBy(xpath="//div[contains(text(),'Password confirmation does not match password!')]") @CacheLookup private WebElement WarningMsgOfConfirmPassword;
// Action Class

public void setFirstName(String fname) {
	txtfirstName.sendKeys(fname);
}
public void setLastName(String lname) {
	txtlastName.sendKeys(lname);
}
public void setEmail(String email) {
	txtEMail.sendKeys(email);
}
public void setTelephone(String number) {
	txttelephone.sendKeys(number);
}
public void setPassword(String password ) {
	txtpassword.sendKeys(password);
}
public void setPasswordConfirm(String confpassword ) {
	txtpassword.sendKeys(confpassword);
}
public void clicknewsletterYes() {
	rdobtnnewsletterYes.click();
}
public void clicknewsletterNo() {
	rdobtnnewsletterNo.click();
}
public void clickagreecheckbox() {
	chkbagree.click();
}
public void clickButtonContinues() {
	btncontinue.click();
}
public String txtWarningMsgOfFirstName() {
	WarningMsgOfFirstName.isDisplayed();
	String firstnameWarningmsg = WarningMsgOfFirstName.getText();
	return firstnameWarningmsg;
}
public String txtWarningMsgOfLastName() {
	WarningMsgOfLastName.isDisplayed();
	String lastnameWarningmsg =  WarningMsgOfLastName.getText();
	return lastnameWarningmsg;
}
public String txtWarningMsgOfEMailAddress() {
	WarningMsgOfEMailAddress.isDisplayed();
	String emailWarningmsg =  WarningMsgOfEMailAddress.getText();
	return emailWarningmsg;
	
}
public String txtWarningMsgOfTelephone() {
	WarningMsgOfTelephone.isDisplayed();
	String telephoneWarningmsg = WarningMsgOfTelephone.getText();
	return telephoneWarningmsg;
}
public String txtWarningMsgOfPassword() {
	WarningMsgOfPassword.isDisplayed();
	String passwordWarningmsg = WarningMsgOfPassword.getText();
	return passwordWarningmsg;
}
public String txtWarningMsgOfConfirmPassword() {
	WarningMsgOfConfirmPassword.isDisplayed();
	String confirmPasswordWarningmsg = WarningMsgOfConfirmPassword.getText();
	return confirmPasswordWarningmsg;
}
}
