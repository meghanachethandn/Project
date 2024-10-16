package com.OpenCart.Project.TestCases;

import org.testng.annotations.Test;

import com.OpenCart.Project.PageObjectModel.LoginPage;
import com.OpenCart.Project.PageObjectModel.MainMenu;
import com.OpenCart.Project.Utilities.DataProviders;

public class TC_002_LoginDDT extends BaseClass {
	
	@Test(dataProvider ="LoginData", dataProviderClass=DataProviders.class)
	public void verify_loginDDT(String email,String password) {
		MainMenu mm= new MainMenu(driver);
		mm.clickMyAccount();
		mm.clickLoginAccount();
		LoginPage lp = new LoginPage(driver);
		lp.setEmailAddress(email);
		lp.setPassword(password);
		lp.clickLogin();
		
	}

}
