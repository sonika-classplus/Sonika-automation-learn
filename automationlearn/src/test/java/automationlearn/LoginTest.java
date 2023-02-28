package automationlearn;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import automationlearn1.LoginScreen;
import automationlearn1.MainLoginPage;

public class LoginTest extends MainLoginPage{
	
	
	@Test
	public void getTextLogin() {
		driver = new ChromeDriver();
		driver.get("https://webp-gcp.classplusapp.com/");
		LoginScreen login = new LoginScreen();
		login.textLogin();
	}
	@Test
	public void clickTickMark() {
		driver = new ChromeDriver();
		driver.get("https://webp-gcp.classplusapp.com/");
		LoginScreen login = new LoginScreen();
		login.setOrgCode("learn"+Keys.TAB);
		Assert.assertTrue(login.checkGreenTick());
		
	}
	
	@Test
	public void LoginWithNumber() {
		
		driver = new ChromeDriver();
		driver.get("https://webp-gcp.classplusapp.com/");
		LoginScreen login = new LoginScreen();
		Assert.assertTrue(login.enterLoginPage("learn", "7696380800", "1234"),"ASSERTION FAILED: test method failed.");
		
	}
	
	@Test
	public void clickTermsConditions() {
		driver = new ChromeDriver();
		driver.get("https://webp-gcp.classplusapp.com/");
		LoginScreen login = new LoginScreen();
		Assert.assertTrue(login.clickTermsConditions());
		
	}
	
	@Test
	public void getTextField() {
		driver = new ChromeDriver();
		driver.get("https://webp-gcp.classplusapp.com/");
		LoginScreen login = new LoginScreen();
		Assert.assertTrue(login.clickMobField());
		
		//login.clickMobField();
		
	}
	
	@Test
	public void getProceedbtn() {
		driver = new ChromeDriver();
		driver.get("https://webp-gcp.classplusapp.com/");
		LoginScreen login = new LoginScreen();
		login.enterLoginPage("learn", "909098788", "1234");
		Assert.assertTrue(login.setbtnLogin());
		
	}
	
	@Test
	public void getValidNum() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://webp-gcp.classplusapp.com/");
		LoginScreen login = new LoginScreen();
		Thread.sleep(2000);
		login.enterLoginPage("learn", "909098788"+Keys.ENTER, "1234");
		Assert.assertTrue(login.setValidNumber());
		
	}
	
	@Test
	public void getLessValidNum() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://webp-gcp.classplusapp.com/");
		LoginScreen login = new LoginScreen();
		Thread.sleep(2000);
		login.enterLoginPage("learn", "909098788999"+Keys.ENTER, "1234");
		Assert.assertTrue(login.setValidNumber());
		
	}
	
	
	
	@Test
	public void getValidError() {
		
		driver = new ChromeDriver();
		driver.get("https://webp-gcp.classplusapp.com/");
		LoginScreen login = new LoginScreen();
		Assert.assertFalse(login.clickValidError("learn", "7696380801","1234"));
		
	}
	
	@Test
	
	public void getOtp() {
		
		driver = new ChromeDriver();
		driver.get("https://webp-gcp.classplusapp.com/");
		LoginScreen login = new LoginScreen();
		Assert.assertFalse(login.clickOtp("learn", "7696380801","1234"));
		
	}
	
//	@AfterMethod
//	public void quitDriver() {
//		driver.quit();
//	}
//	
	

}