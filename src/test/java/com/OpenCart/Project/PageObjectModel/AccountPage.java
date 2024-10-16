package com.OpenCart.Project.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	WebDriver driver;
	public  AccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@id='content']/h2[1]")@CacheLookup private WebElement titleAccount;
	
	
	//Action Class
	public String txtTitleAccount() {
		String title = titleAccount.getText();
		return title;
	}

	


}
