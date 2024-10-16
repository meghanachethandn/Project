package com.OpenCart.Project.TestCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.OpenCart.Project.PageObjectModel.AccountRegisterationPage;
import com.OpenCart.Project.PageObjectModel.MainMenu;

public class TC_001_AccountRegisterationPage extends BaseClass {
	
	@Test(priority=0,groups = {"regression","smoke"})
	public void TC_001_verify_account_registeration()  {
		try {
			logger.info("***** Started TC_001_AccountRegisterationPage *****");
			MainMenu mm =new MainMenu(driver);
			mm.clickMyAccount();
			logger.info("***** clicked on Account menu ***** ");
			mm.clickRegisterAccount();
			logger.info("***** clicked on Register menu ***** ");
			AccountRegisterationPage arp = new AccountRegisterationPage(driver);
			logger.info("***** Entered all customer information ***** ");
			arp.setFirstName("Meghana");
			arp.setLastName("D.N");
			arp.setEmail("meghana@gmail.com");
			arp.setTelephone("1234567");
			arp.setPassword("Admin@123");
			arp.setPasswordConfirm("Admin@123");
			arp.clicknewsletterNo();
			arp.clickagreecheckbox();
			arp.clickButtonContinues();
			logger.info("***** clicked Continues button ***** ");
			logger.info("***** Ended TC_001_AccountRegisterationPage *****");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	@Test(priority=1,groups = {"regression"})
	public void TC_002_verify_Warning_message_for_madatory_field() {
		try {
		logger.info("***** Started TC_002_verify_Warning_message_for_madatory_field *****");
		MainMenu mm =new MainMenu(driver);
		mm.clickMyAccount();
		logger.info("***** clicked on Account menu ***** ");
		mm.clickRegisterAccount();
		logger.info("***** clicked on Register menu ***** ");
		AccountRegisterationPage arp = new AccountRegisterationPage(driver);
		logger.info("***** Entered all customer information ***** ");
		arp.setFirstName("");
		arp.setLastName("");
		arp.setEmail("meghana@gmail.com");
		arp.setTelephone("1234567");
		arp.setPassword("Admin@123");
		arp.setPasswordConfirm("Admin@123");
		arp.clicknewsletterNo();
		arp.clickagreecheckbox();
		arp.clickButtonContinues();
		logger.info("***** Ended TC_002_verify_Warning_message_for_madatory_field *****");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	@Test(priority=2,groups = {"regression"})
	public void TC_003_verify_notification_message_for_mandatoryField() {
		try {
			logger.info("***** Started TC_003_verify_notification_message_for_mandatoryField *****");
			MainMenu mm =new MainMenu(driver);
			mm.clickMyAccount();
			logger.info("***** clicked on Account menu ***** ");
			mm.clickRegisterAccount();
			logger.info("***** clicked on Register menu ***** ");
			AccountRegisterationPage arp = new AccountRegisterationPage(driver);
			logger.info("***** Entered all customer information as empty***** ");
			arp.setFirstName("");
			arp.setLastName("");
			arp.setEmail("");
			arp.setTelephone("");
			arp.setPassword("");
			arp.setPasswordConfirm("");
			arp.clickButtonContinues();
			String warningMsgFirstname=arp.txtWarningMsgOfFirstName();
			String warningMsgLastname=arp.txtWarningMsgOfLastName();
			String warningMsgEmail=arp.txtWarningMsgOfEMailAddress();
			String warningMsgTelephone = arp.txtWarningMsgOfTelephone();
			String warningMsgPassword = arp.txtWarningMsgOfPassword();
			
			logger.info("***** Warning message of FirstName is validating *****");
			if(warningMsgFirstname.equals("First Name must be between 1 and 32 characters!")) {
				System.out.println(warningMsgFirstname);
			}else {
				System.out.println("The warning message is not proper : " +warningMsgFirstname);
			}
			logger.info("***** Warning message of LastName is validating *****");
			if(warningMsgLastname.equals("Last Name must be between 1 and 32 characters!")) {
				System.out.println(warningMsgLastname);
			}else {
				System.out.println("The warning message is not proper : " +warningMsgLastname);
			}
			logger.info("***** Warning message of Email is validating *****");
			if(warningMsgEmail.equals("E-Mail Address does not appear to be valid!")) {
				System.out.println(warningMsgEmail);
			}else {
				System.out.println("The warning message is not proper : " +warningMsgEmail);
			}
			logger.info("***** Warning message of Telephone is validating *****");
			if(warningMsgTelephone.equals("Telephone must be between 3 and 32 characters!")) {
				System.out.println(warningMsgTelephone);
			}else {
				System.out.println("The warning message is not proper : " +warningMsgTelephone);
			}
			logger.info("***** Warning message of Password is validating *****");
			if(warningMsgPassword.equals("Password must be between 4 and 20 characters!")) {
				System.out.println(warningMsgPassword);
			}else {
				System.out.println("The warning message is not proper : " +warningMsgPassword);
			}
			
			logger.info("***** Ended TC_003_verify_notification_message_for_mandatoryField *****");
			}
		catch(Exception e) {
			System.out.println(e);
		}
			
	}
	@Test(priority=3, groups= {"regression"})
	public void TC_004_verify_different_password_inTo_passwordAndConfirmPassword() {
		try {
			logger.info("***** TC_004_verify_different_password_inTo_passwordAndConfirmPassword *****");
			MainMenu mm =new MainMenu(driver);
			mm.clickMyAccount();
			logger.info("***** clicked on Account menu ***** ");
			mm.clickRegisterAccount();
			logger.info("***** clicked on Register menu ***** ");
			AccountRegisterationPage arp = new AccountRegisterationPage(driver);
			logger.info("***** Entered all customer information as empty***** ");
			arp.setFirstName("megha");
			arp.setLastName("a");
			arp.setEmail("megha@gmail.com");
			arp.setTelephone("987654321");
			arp.setPassword("Admin@123");
			arp.setPasswordConfirm("Admin@12");
			String warningMsgConfirmPassword = arp.txtWarningMsgOfConfirmPassword();
			if(warningMsgConfirmPassword.equals("Password confirmation does not match password!")) {
				System.out.println(warningMsgConfirmPassword);
			}
			else {
				System.out.println("The warning message of confirm password is not proper "+warningMsgConfirmPassword);
			}
			arp.clicknewsletterNo();
			arp.clickagreecheckbox();
			arp.clickButtonContinues();
			logger.info("***** Ended TC_004_verify_different_password_inTo_passwordAndConfirmPassword *****");
			}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
