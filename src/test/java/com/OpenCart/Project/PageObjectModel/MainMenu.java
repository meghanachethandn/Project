package com.OpenCart.Project.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainMenu {
	WebDriver driver;
	
	public MainMenu(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="a[title='My Account'] span[class='hidden-xs hidden-sm hidden-md']") 
	@CacheLookup private WebElement myAccount;
	@FindBy(xpath="//ul[@class='list-inline']/li[2]") 
	@CacheLookup private WebElement afterLoginMyAccount;
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//li//a[text()='Register']") 
	@CacheLookup private WebElement register;
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//li//a[text()='Login']")
	@CacheLookup private WebElement login;
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//li/a[text()='Logout']")@CacheLookup private WebElement btnLogut;
	public void clickMyAccount() {
		myAccount.click();
	}
	public void clickRegisterAccount() {
		register.click();
	}
	public void clickLoginAccount() {
		login.click();
	}
	public void clickLogout() {
		btnLogut.click();
	}
	public void clickAfterLoginMyAccount() {
		afterLoginMyAccount.click();
	}
}
