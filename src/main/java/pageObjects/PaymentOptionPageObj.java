package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class PaymentOptionPageObj extends Base {

	public PaymentOptionPageObj() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Affiliate']")
	private WebElement affiliateLink;

	@FindBy(xpath = "//a[normalize-space()='Continue']")
	private WebElement newAffiliateLink;

	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement affiliateFirstNameField;

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement affiliateLastNameField;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement affiliateEmailField;

	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement affiliateTelephoneField;

	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement affiliateCompanyField;

	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement affiliateWebsiteField;

	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement affiliateTaxIdField;

	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement affiliateChequeRadioButton;

	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement affilaiteChequePayeeName;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement affiliatePasswordField;

	@FindBy(xpath = "//input[@id='input-confirm']")
	private WebElement affiliateConfirmPasswordField;

	@FindBy(xpath = "//input[@name='agree']")
	private WebElement affiliateAboutUsLink;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement contiueButton;

	@FindBy(xpath = "//h1[normalize-space()=" + "'Your Affiliate Account Has Been Created!']")
	private WebElement AffiliateAccountSuccessMessage;
	// the third continue
	@FindBy(xpath = "//a[normalize-space()='Continue']")
	private WebElement userClickContiueButtonAgain;
	//
	@FindBy(xpath = "//a[normalize-space()='Edit your affiliate information']")
	private WebElement userClickOnEditYourAffiliateInfo;

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement userClickOnBankTransferRadioButton;

	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement bankNameField;

	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement abaNumberField;

	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement swiftCodeField;

	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement accountNameField;

	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement accountNumber;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successfulMessage;
	// 3rd continue
	// edit account
	@FindBy(xpath = "//a[normalize-space()='Edit Account']")
	private WebElement userClickOneditAccountInfo;

	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement editAccountNameField;

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement editAccountLastNameField;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement editAccountEmailField;

	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement editAccounttelephoneField;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement editAccountCOntinueButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement editAccountSuccessMessage;

	// edit account methods
	public void userClickOnEditAccountLink() {
		WebDriverUtility.clickOnElement(userClickOneditAccountInfo);
	}

	public void userCLickOnEditAccountInfoLink() {
		WebDriverUtility.clickOnElement(editAccountCOntinueButton);
	}

	public void editAccountFristNameField(String firstName) {
		WebDriverUtility.enterValue(editAccountNameField, firstName);
	}

	public void editAccountLastNameField(String lastName) {
		WebDriverUtility.enterValue(editAccountLastNameField, lastName);
	}

	public void editAccountEmailField(String emailEditAcc) {
		WebDriverUtility.enterValue(editAccountEmailField, emailEditAcc);
	}

	public void editAccountTelephoneField(String phoneEditAcc) {
		WebDriverUtility.enterValue(editAccounttelephoneField, phoneEditAcc);
	}

	public void editAccountContinueButton() {
		WebDriverUtility.clickOnElement(editAccountCOntinueButton);
	}

	public void editAccountSuccessMessage() {
		WebDriverUtility.isElementDisplayed(editAccountSuccessMessage);
	}

	// End of edit account
	public void userClickOnContinueButtonAgain() {

		WebDriverUtility.clickOnElement(userClickContiueButtonAgain);
	}

	public void userClickOnAffiliateInfo() {

		WebDriverUtility.clickOnElement(userClickOnEditYourAffiliateInfo);
	}

	public void userClickOnBankTransferButton() {
		WebDriverUtility.clickOnElement(userClickOnBankTransferRadioButton);
	}

	public void bankName(String bankName) {
		WebDriverUtility.enterValue(bankNameField, bankName);
	}

	public void abaNumber(String abaNumber) {
		WebDriverUtility.enterValue(abaNumberField, abaNumber);
	}

	public void swiftCode(String swiftCode) {
		WebDriverUtility.enterValue(swiftCodeField, swiftCode);
	}

	public void accountName(String accountName) {
		WebDriverUtility.enterValue(accountNameField, accountName);
	}

	public void accountNUmberField(String accoutNumber) {
		WebDriverUtility.enterValue(accountNumber, accoutNumber);
	}

	public void userClickOnAffiliateLink() {
		WebDriverUtility.clickOnElement(affiliateLink);
	}

	public void userClickOnNewAffiliateLink() {

		WebDriverUtility.clickOnElement(newAffiliateLink);
	}

	public void firstNameField(String fName) {
		WebDriverUtility.enterValue(affiliateFirstNameField, fName);

	}

	public void lastNameField(String lName) {
		WebDriverUtility.enterValue(affiliateLastNameField, lName);
	}

	public void emailField(String email) {
		WebDriverUtility.enterValue(affiliateEmailField, email);

	}

	public void telephoneField(String phoneNumber) {
		WebDriverUtility.enterValue(affiliateTelephoneField, phoneNumber);
	}

	public void companyName(String coName) {
		WebDriverUtility.enterValue(affiliateCompanyField, coName);
	}

	public void continueBtoon() {
		WebDriverUtility.clickOnElement(contiueButton);
	}

	public void companyWebSite(String Website) {
		WebDriverUtility.enterValue(affiliateWebsiteField, Website);
	}

	public void companyTaxId(String taxId) {
		WebDriverUtility.enterValue(affiliateTaxIdField, taxId);
	}

	public void chequeRadioButton() {
		WebDriverUtility.clickOnElement(affiliateChequeRadioButton);
	}

	public void chequePayeeName(String chequePayeeName) {
		WebDriverUtility.enterValue(affilaiteChequePayeeName, chequePayeeName);
	}

	public void passwordField(String password) {
		WebDriverUtility.enterValue(affiliatePasswordField, password);
	}

	public void confirmPassword(String confirmPassword) {
		WebDriverUtility.enterValue(affiliateConfirmPasswordField, confirmPassword);
	}

	public void aboutUsLink() {
		WebDriverUtility.clickOnElement(affiliateAboutUsLink);

	}

	public void successMessage() {
		WebDriverUtility.getText(AffiliateAccountSuccessMessage);
	}

}
