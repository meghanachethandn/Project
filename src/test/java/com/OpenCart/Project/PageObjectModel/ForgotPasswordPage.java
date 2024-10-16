package com.OpenCart.Project.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	WebDriver driver;
	public ForgotPasswordPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//input[@id='input-email']") @CacheLookup private WebElement txtEMailAddress;
@FindBy(xpath="//a[normalize-space()='Back']") @CacheLookup private WebElement btnback;
@FindBy(xpath="//button[normalize-space()='Continue']") @CacheLookup private WebElement btncontinue;

// Action class

public void setEmailAddress(String email) {
	txtEMailAddress.sendKeys(email);
}
public void clickBackButton() {
	btnback.click();
}
public void clickContinueButton() {
	btncontinue.click();
}

}
