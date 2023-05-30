package pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic_Script.Base_Page;

public class POM1 extends Base_Page{
	//Declaration
	
	@FindBy(xpath="//a[.='Create an Account']/../../../../../../header/div[1]/div[1]/ul[1]/li[3]")
	private WebElement createAcc;    //"//a[.='Create an Account']/../../preceding-sibling::a/following-sibling::ul/li[3]"
	
	@FindBy(id="firstname")
	private WebElement enterFirstName;
	
	@FindBy(id="lastname")
	private WebElement enterLastName;
	
	@FindBy(id="is_subscribed")
	private WebElement chechBox;
	
	@FindBy(id="email_address")
	private WebElement enterEmailId;
	
	@FindBy(id="password")
	private WebElement enterPassword;
	
	@FindBy(id="password-confirmation")
	private WebElement enterPasswordConfirm;
	
	@FindBy(xpath="(//span[.='Create an Account'])[1]")
	private WebElement sbmitCreateAcc;
	
	//signIn
	
	
		@FindBy(xpath="//a[.='Create an Account']/../../../../../../header/div[1]/div[1]/ul[1]/li[2]/a[1]")
		private WebElement signInAcc;
		@FindBy (id="email")
		private WebElement enterEmailForSignIn;
		
		@FindBy(id="pass")
		private WebElement enterPasswordForSignIn;
		
		@FindBy(id="send2")
		private WebElement submitSignInAcc;
		//SignInEnd//
		
	//Initialization
	
	public POM1(WebDriver driver){
		super(driver);
	}
	
	//Utilization
	public void createAccCLick() {
		createAcc.click();
	}
	
	public void enterFirstName(String name) {
		enterFirstName.sendKeys(name);
	}
	public void enterLastName(String lastname) {
		enterLastName.sendKeys(lastname);
	}
	public void chechBox() {
		chechBox.click();
	}
	public void enterEmailId(String email) {
		enterEmailId.sendKeys(email);
	}
	public void enterPassword(String pass) {
		enterPassword.sendKeys(pass);
	}
	public void confirmPassword(String cPass) {
		enterPasswordConfirm.sendKeys(cPass);
	}
	
	public void  submitCreateAcc(){
		sbmitCreateAcc.click();
	 }
	
	//SingMethodStarts
	public void signInAcc(){
		signInAcc.click();
	}
	
	public void enterEmailForSignIn(String signInEMail) {
		enterEmailForSignIn.sendKeys(signInEMail);
	}
	public void enterPasswordForSignIn(String signPWD) {
		enterPasswordForSignIn.sendKeys(signPWD);
	}
	
	public void submitSignInAcc() {
		submitSignInAcc.click();
		
	}
	
	//SingMethodEnds
	
	
	
}
