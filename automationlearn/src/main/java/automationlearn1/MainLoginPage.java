package automationlearn1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class MainLoginPage {
	
	public static WebDriver driver = null;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			System.getProperty("webdriver.chromedriver", "chromedriver");
			//driver = new ChromeDriver();
			//driver.get("https://webp-gcp.classplusapp.com/");
			//MainLoginpage login = new MainLoginpage();
			//login.enterLoginPage("learn", "7696380800", "1234");
			
			//login.clickTermsConditions();
			//login.enterLoginEmail("learn", "7696380800", "1234");
	}
			
	
	
	public void impicitWait() {
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

	}
	
//	public void getUrl() {
//		
//		driver.get("https://webp-gcp.classplusapp.com/");
//
//	}

	
		
}


