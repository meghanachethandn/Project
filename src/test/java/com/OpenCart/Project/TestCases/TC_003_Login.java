package com.OpenCart.Project.TestCases;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.OpenCart.Project.PageObjectModel.AccountPage;
import com.OpenCart.Project.PageObjectModel.LoginPage;
import com.OpenCart.Project.PageObjectModel.MainMenu;

public class TC_003_Login extends BaseClass {
	MainMenu mm;
	LoginPage lp;
	AccountPage ap;

	@Test(priority = 0, groups = { "smoke", "regression" })
	public void Verify_LoginWithValid_Credential() {
		try {
			mm = new MainMenu(driver);
			lp = new LoginPage(driver);
			ap = new AccountPage(driver);
			logger.info(" ------- TC1 : Started Verify_LoginWithValid_Credential ------");
			mm.clickMyAccount();
			mm.clickLoginAccount();
			lp.setEmailAddress(p.getProperty("email"));
			lp.setPassword(p.getProperty("password"));
			lp.clickLogin();
			logger.info(" ------- Ended Verify_LoginWithValid_Credential ------");
			String accounttitle = ap.txtTitleAccount();
			if (accounttitle.equals("My Account")) {
				Assert.assertTrue(true);
				System.out.println(accounttitle);
			} else {
				Assert.assertFalse(false);
				System.out.println("Account Title is not matching");
			}
			Thread.sleep(5000);
			mm.clickAfterLoginMyAccount();
			mm.clickLogout();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Test(priority = 1, groups = { "regression" })
	public void Verify_LoginWithInValid_Username_Credential() {
		try {
			mm = new MainMenu(driver);
			lp = new LoginPage(driver);
			ap = new AccountPage(driver);
			logger.info(" ------- TC2: Started Verify_LoginWithInValid_Credential ------");
			mm.clickMyAccount();
			mm.clickLoginAccount();
			lp.setEmailAddress("Admin@gmail.com");
			lp.setPassword("Admin@123");
			lp.clickLogin();
			String emailFailMessage = lp.LoginwarningAlertMessage();
			if (emailFailMessage.equals("Warning: No match for E-Mail Address and/or Password.")) {
				Assert.assertTrue(true);
				System.out.println("Matching waring as :" + emailFailMessage);
			} else {
				Assert.assertFalse(false);
				System.out.println("Waring message is not displaying proper : " + emailFailMessage);
			}
			// mm.clickAfterLoginMyAccount();
			// mm.clickLogout();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Test(priority = 2, groups = { "regression" })
	public void Verify_LoginWith_Invalid_Password_Credential() {
		try {
			mm = new MainMenu(driver);
			lp = new LoginPage(driver);
			ap = new AccountPage(driver);
			logger.info(" ------- TC3 : Started Verify_LoginWithInValid_Credential ------");
			mm.clickMyAccount();
			mm.clickLoginAccount();
			lp.setEmailAddress("Meghana.dn@invendis.com");
			lp.setPassword("Adm@123");
			lp.clickLogin();
			String emailFailMessage = lp.LoginwarningAlertMessage();
			if (emailFailMessage.equals("Warning: No match for E-Mail Address and/or Password.")) {
				Assert.assertTrue(true);
				System.out.println("Matching waring as :" + emailFailMessage);
			} else {
				Assert.assertFalse(false);
				System.out.println("Waring message is not displaying proper : " + emailFailMessage);
			}
			// mm.clickAfterLoginMyAccount();
			// mm.clickLogout();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	@Test(priority=4,groups = {"regression"})
	public void Verify_Loginwith_Invalid_Creadential() {
		try {
			mm = new MainMenu(driver);
			lp = new LoginPage(driver);
			ap = new AccountPage(driver);
			logger.info(" ------- TC4 : Started Verify_LoginWithInValid_Credential ------");
			mm.clickMyAccount();
			mm.clickLoginAccount();
			lp.setEmailAddress("Admin@gmail.com");
			lp.setPassword("adm123");
			lp.clickLogin();
			String emailFailMessage = lp.LoginwarningAlertMessage();
			if (emailFailMessage.equals("Warning: No match for E-Mail Address and/or Password.")) {
				Assert.assertTrue(true);
				System.out.println("Matching waring as :" + emailFailMessage);
			} else {
				Assert.assertFalse(false);
				System.out.println("Waring message is not displaying proper : " + emailFailMessage);
			}
			// mm.clickAfterLoginMyAccount();
			// mm.clickLogout();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	@Test(priority=5,groups = {"regression"})
	public void Verify_Loginwith_Empty_Creadential() {
		try {
			mm = new MainMenu(driver);
			lp = new LoginPage(driver);
			ap = new AccountPage(driver);
			logger.info(" ------- TC5 : Started Verify_LoginWithInValid_Credential ------");
			mm.clickMyAccount();
			mm.clickLoginAccount();
			lp.setEmailAddress("");
			lp.setPassword("");
			lp.clickLogin();
			String emailFailMessage = lp.LoginwarningAlertMessage();
			if (emailFailMessage.equals("Warning: No match for E-Mail Address and/or Password.")) {
				Assert.assertTrue(true);
				System.out.println("Matching warning as :" + emailFailMessage);
			} else {
				Assert.assertFalse(false);
				System.out.println("Warning message is not displaying proper : " + emailFailMessage);
			}
			// mm.clickAfterLoginMyAccount();
			// mm.clickLogout();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	@Test(priority=6,groups = {"regression"})
	public void Verify_LoginPage_Forgotten_Password_link() {
		try {
			mm = new MainMenu(driver);
			lp = new LoginPage(driver);
			ap = new AccountPage(driver);
			logger.info(" ------- TC6 : Started Verify_LoginWithInValid_Credential ------");
			mm.clickMyAccount();
			mm.clickLoginAccount();
			lp.visibleForgottenPasswordLink();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}


}
