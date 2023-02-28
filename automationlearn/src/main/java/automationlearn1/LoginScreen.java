package automationlearn1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScreen extends MainLoginPage{
	
	@FindBy(xpath = "//input[@data-cy='login_orgCode']")
	private WebElement orgCode;

	@FindBy(xpath = "//input[@data-cy='login_number']")
	private WebElement enterMobileNumber;
	
	@FindBy(xpath = "//button[@data-cy='login_continue']")
	private WebElement btnLogin;

	@FindBy(xpath = "//input[@id='otp_input']")
	private WebElement txtEnterOtp;
	
	@FindBy(xpath = "//p[@class='accountLogin-type-text']")
	private WebElement SetMobNum;

	@FindBy(xpath = "//button[@data-cy='login_verify']")
	private WebElement verifyBtnOtp;
	
	@FindBy(xpath = "//span[@class='profile-thumbnail']/parent::div")
	private WebElement getProfile;
	
	@FindBy(xpath = "//*[contains(text(),'Logout')]") 
	private WebElement getLogout;
	
	@FindBy(xpath = " //button[@class='rrt-button rrt-ok-btn']") 
	private WebElement okLogout;
	
	@FindBy(xpath = "//p[@class='accountLogin-type-text']")
	private WebElement getEmail;  
	
	@FindBy(xpath = "//div[@class='accountLogin-Different']")
	private WebElement getLoginDifferentemail;
	
	@FindBy(xpath = "//a[@class='accountLogin-tnc-link']")
	private WebElement getTerms; 
	
	@FindBy(xpath = "//input[@class='accountLogin-input accountLogin-input-mobile']")
	private WebElement getMobField;
	
	
	@FindBy(xpath = "//div[text()='Send OTP again']/parent::div")
	private WebElement getResendOtp;
	
	
	@FindBy(xpath = "//p[@class='accountLogin-heading']")
	private WebElement getTextLogin;
	
	
	@FindBy(xpath = "//label[text()='Org Code']")
	private WebElement setOrgCode;
	
	@FindBy(xpath = "//label[text()='Your Mobile Number']")
	private WebElement getMobNum;
	
	@FindBy(xpath = "//button[@class='ui primary button']")
	private WebElement getProceedBtn;
	
	
	@FindBy(xpath = "//label[@class='otp-error-message']")
	private WebElement getOtpError;
	
	@FindBy(xpath = "//img[@class='accountLogin-org-status-icon']")
	private WebElement getTick;
	
	
	
	@FindBy(xpath = "//label[@class='accountLogin-error-message']")
	private WebElement setValidNum;


	public void setOrgCode(String setOrgCode) {
		this.impicitWait();
		this.orgCode.sendKeys(setOrgCode+Keys.TAB);
		
	}
	public void setMob() {
		this.impicitWait();
		this.SetMobNum.click();
	}
	public void getMobileNumber(String getMobileNumber) {
		
		this.enterMobileNumber.sendKeys(getMobileNumber);
	}
	
	public void getEmailLogin(String getEmailLogin) {
		
		this.getEmail.sendKeys(getEmailLogin);
	}
	
	public boolean clickMobField() {
		this.impicitWait();
		this.getMobField.click();
		return true;
	}
	public void checkTextLogin() {
		this.impicitWait();
		System.out.println(this.getTextLogin.getText());
	}
	public void clickTick() {
		this.impicitWait();
		this.getTick.click();
	}
	public boolean checkGreenTick() {
		return this.getTick.isDisplayed();
	}
	
	
	public void getBtnLogin() {
		this.impicitWait();
		this.btnLogin.click();
	}
	
	public void clickOrgCode() {
		this.impicitWait();
		System.out.println(this.setOrgCode.getText());
	}
	
	public void clickMobNum() {
		this.impicitWait();
		System.out.println(this.getMobNum.getText());
	}
	
	public void setProceedBtn() {
		this.impicitWait();
		System.out.println(this.getProceedBtn.getText());
	}
	public boolean setbtnLogin() {
		this.impicitWait();
		return this.btnLogin.isDisplayed();
	}
	public boolean setValidNumber() {
		this.impicitWait();
		return this.setValidNum.isDisplayed();
	}
	
	
	
	
	public void getEnterOTP(String getEnterOTP ) {
		this.txtEnterOtp.sendKeys(getEnterOTP);
	}
	
	public void getVerifyBtn() {
		
		this.verifyBtnOtp.click();
	}
	
	public void clickOtpError() {
		this.impicitWait();
		System.out.println(this.getOtpError.getText());
	}
	
	
	public void getProfileclick() throws InterruptedException {
		Thread.sleep(2000);
		this.impicitWait();
		this.getProfile.click();
	}
	
	public void getLogoutClick() throws InterruptedException {
		Thread.sleep(2000);
		this.impicitWait();
		this.getLogout.click();
	}
	
	public void okLogoutClick() throws InterruptedException {
		Thread.sleep(2000);
		this.impicitWait();
		this.okLogout.click();
		
	}
	
	public void getLoginDifferent() {
		this.impicitWait();
		this.getLoginDifferentemail.click();
	}
	
	public void getTermsConditions() {
		this.impicitWait();
		this.getTerms.click();
	}
	public void clickResentOtp() throws InterruptedException {
		Thread.sleep(10000);
		this.getResendOtp.click();
	}
	
	
		
	public LoginScreen() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void textLogin() {
		
		try{
			this.checkTextLogin();
			this.clickOrgCode();
			this.setOrgCode("learn");
			this.getMobileNumber("8091030300");
			this.clickMobNum();
			this.setProceedBtn();
			
			
	}
		catch (Exception e) {
			
			System.out.println("Failed");
			
		}
	}
//	public boolean tickMark() {
//		
//		try{
//			this.setOrgCode("learn" +Keys.TAB);
//			this.clickTick();
//	}
//		catch (Exception e) {
//			System.out.println("Failed");
//			
//		}
//		return true;
//	}
	public boolean enterLoginPage(String setOrgCode, String getMobileNumber, String getEnterOTP) {
		
		
		try {
			this.setOrgCode(setOrgCode);
			this.setMob();
			this.getMobileNumber(getMobileNumber);
			this.getBtnLogin();
			this.getEnterOTP(getEnterOTP);
			this.getVerifyBtn();
			this.getProfileclick();
			this.getLogoutClick();
			this.okLogoutClick();
		
	} catch (Exception e) {
		
		System.out.println("Failed");
		
		
	}
		return true;
	}
	
	public boolean clickTermsConditions(){
		
		try {
			//this.getLoginDifferent();
			this.getTermsConditions();
		}
		catch(Exception e) {
			System.out.println("Failed terms");
		}
		return false;
		
		
	}
	public void getMobileField(){
		
		try {
			this.clickMobField();
		}
		catch(Exception e) {
			System.out.println("Failed  Mob terms");
		}
		
		
	}
	public boolean clickValidError(String setOrgCode, String getMobileNumber, String getEnterOTP){
		
		try {
			
			this.setOrgCode(setOrgCode);
			this.getMobileNumber(getMobileNumber);
			this.getBtnLogin();
			this.getEnterOTP(getEnterOTP);
			this.getVerifyBtn();
			this.clickResentOtp();
			
		}
		catch(Exception e) {
			System.out.println("Failed  valid Error");
		}
		return false;
		
		
	}
	
	public boolean clickOtp(String setOrgCode, String getMobileNumber, String getEnterOTP){
		
		try {
			
			this.setOrgCode(setOrgCode);
			this.getMobileNumber(getMobileNumber);
			this.getBtnLogin();
			this.getEnterOTP(getEnterOTP);
			this.clickResentOtp();
			this.clickOtpError();
			
		}
		catch(Exception e) {
			System.out.println("Failed  valid Error");
		}
		return false;
		
		
	}
	
	
	public void enterLoginEmail(String setOrgCode, String getEmailLogin, String getEnterOTP) {
		
		try {
			this.setOrgCode(setOrgCode);
			this.getEmailLogin(getEmailLogin);
			
		
	} catch (Exception e) {
		
		System.out.println("Failed");
		
		
	}
		
		
	}
}


