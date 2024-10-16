package com.OpenCart.Project.TestCases;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public Logger logger;
	public Properties p ;
	
	
	@BeforeMethod
	@Parameters({"browser"})
	public void setup(@Optional("chrome") String br) throws IOException {
		logger = LogManager.getLogger(this.getClass());
		switch(br) {
		case "chrome": WebDriverManager.chromedriver().setup();
					  driver = new ChromeDriver(); break;
		case "edge" : WebDriverManager.edgedriver().setup();
					  driver = new EdgeDriver(); break ;
		default : System.out.println("Invalid Browser");return;
		}
		FileReader file=new FileReader(".\\src\\test\\resources\\config.properties");
		p = new Properties();
		p.load(file);
		logger.info("******"+ br +" browser lanuched succesfully *****");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("https://tutorialsninja.com/demo/");
		driver.get(p.getProperty("appURL"));
		logger.info(" ****** Application tutorialsninja.com  launched succesfully *****");
		
	}
	@AfterMethod
	public void teardown() {
		driver.close();
		logger.info("****** Chrome browser closed succesfully *****");
	}
	public String randomString() {
		Random random = new Random();
		String string = random.toString();
		return string;
	}
	public int randomNumber() {
		Random random = new Random();
		int number = random.nextInt(100);
		return number;
	}
	public void randomAlphaNumeric() {
		
	}
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

}
