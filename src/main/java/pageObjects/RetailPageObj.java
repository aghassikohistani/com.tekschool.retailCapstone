package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class RetailPageObj extends Base {

	// Once we create Page Obj we need to extends the Base class to use Parent Class
	// properties such is Webdriver driver
	// we create a constructor and inside the constructor we define the
	// PageFactory.initElements
	// method to initialize the WebElements in this page.

	public RetailPageObj() {

		PageFactory.initElements(driver, this);
	}

	// we need to store UI Webelements in a private webElement using @FindBy
	// annotations of
	// PageFactory class.

	@FindBy(xpath = "//input[@name='search']")
	private WebElement searchBar;

	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	private WebElement searchButton;

	@FindBy(xpath = "//img[@title='iPhone']")
	private WebElement iphoneImage;

	// WebElements for Register page
	@FindBy(xpath = "(//a[text()='Register'])[1]")
	private WebElement registerOption;

	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement firstNameField;

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastNameField;

	@FindBy(css = "#input-email")
	private WebElement emailField;

	@FindBy(id = "input-telephone")
	private WebElement telephoneField;

	@FindBy(id = "input-password")
	private WebElement passwordField;

	@FindBy(id = "input-confirm")
	private WebElement confirmPasswordField;

	@FindBy(xpath = "(//input[@value='1'])[1]")
	private WebElement yesSubscribeButton;

	@FindBy(xpath = "(//input[@value='0'])[1]")
	private WebElement noSubscribeButton;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement privacyPolicyCheckBox;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;

	@FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
	private WebElement accountCreatedMessage;

	// we need to create public methods to perform required actions on each elements
	// we stored.

	// Web Elements for User Verify all items are Present In Desktops tab

	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement clickOnDeskTopsTab;

	@FindBy(xpath = "//div[@id='content']/h2")
	private WebElement UserClickOnShowAllDesktops;

	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showAllDesktops;

	@FindBy(xpath = "//div[@id='content']")
	private WebElement allItemsArePresentInDekTopPage;

	// Web Elements for HP LP 3065

	@FindBy(xpath = "//div[3]//div[1]//div[2]//div[2]//button[1]//span[1]")
	private WebElement addToCartOption;

	@FindBy(xpath = "//button[normalize-space()='Add to Cart']")
	private WebElement addToCartButton;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement userSelectQantityOne;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;

	// Canon EOS 5D add to cart

	@FindBy(xpath = "//div[@id='product-category']" + "//div[2]//div[1]//div[2]//div[2]//button[1]//span[1]")
    private WebElement addCanonEos5daddtoCartOption;
	
	@FindBy(xpath = "//select[@id='input-option226']")
	private WebElement selectRedEos5D;
	
	@FindBy(xpath = "//button[normalize-space()='Add to Cart']")
	private WebElement canonEos5dAddToCartButton;
	
	@FindBy(xpath = "//button[normalize-space()='Add to Cart']")
	private WebElement canonAddToCartSuccessMessage;
	
	public void canonEos5AddToCartOption() {
		WebDriverUtility.clickOnElement(addCanonEos5daddtoCartOption);
	}
	
	public void selectEosRed() {
		WebDriverUtility.selectByValue(UserClickOnShowAllDesktops, getBrowserName());
	}
	
	
	
	
	public void addToCartOption() {
		WebDriverUtility.clickOnElement(addToCartOption);
	}

	public void userSelectQuantity() {
		WebDriverUtility.clickOnElement(userSelectQantityOne);
	}

	public void clickOnAddToCartButton() {
		WebDriverUtility.clickOnElement(addToCartButton);
	}

	public void clickOnDeskTopsTab() {
		WebDriverUtility.clickOnElement(clickOnDeskTopsTab);
	}

	public boolean successMessage() {
		if (successMessage.isDisplayed()) {
			return true;
		} else
			return false;
	}

	public void UserClickOnShowAllDesktops() {
		WebDriverUtility.clickOnElement(UserClickOnShowAllDesktops);
	}

	public void showAllDesktops() {
		WebDriverUtility.clickOnElement(showAllDesktops);
	}

	public void allItemsArePresent() {
		WebDriverUtility.isElementDisplayed(allItemsArePresentInDekTopPage);
	}

	public void contentOfPage() {
		WebDriverUtility.isElementDisplayed(allItemsArePresentInDekTopPage);
	}

	public void enterValueToSearchBar(String value) {
		WebDriverUtility.enterValue(searchBar, value);
	}

	public void clickOnSearchButton() {
		WebDriverUtility.clickOnElement(searchButton);
	}

	public boolean iPhoneImageIsDisplayed() {

		if (iphoneImage.isDisplayed())
			return true;
		else
			return false;

	}

	// we need to create Methods to perform on each WebElement.

	public void clickOnRegister() {
		WebDriverUtility.clickOnElement(registerOption);
	}

	public void enterFirstName(String fName) {
		WebDriverUtility.enterValue(firstNameField, fName);
	}

	public void enterLastName(String lName) {
		WebDriverUtility.enterValue(lastNameField, lName);
	}

	public void enterEmail(String email) {
		WebDriverUtility.enterValue(emailField, email);
	}

	public void enterTelephone(String phoneNumber) {
		WebDriverUtility.enterValue(telephoneField, phoneNumber);

	}

	public void enterPassword(String password) {
		WebDriverUtility.enterValue(passwordField, password);

	}

	public void enterConfirmPassword(String confirmPassword) {
		WebDriverUtility.enterValue(confirmPasswordField, confirmPassword);
	}

	public void subscribe(String valueOfSubscribe) {

		if (valueOfSubscribe.equalsIgnoreCase("yes")) {
			if (!yesSubscribeButton.isSelected())
				WebDriverUtility.clickOnElement(yesSubscribeButton);
		} else
			WebDriverUtility.clickOnElement(noSubscribeButton);
	}

	public void checkPrivacyPolicy() {

		if (privacyPolicyCheckBox.isDisplayed()) {
			privacyPolicyCheckBox.click();
		}

	}

	public void clickOnContinueButton() {
		WebDriverUtility.clickOnElement(continueButton);
	}

	public boolean registrationOutcome() {

		boolean successMessage = accountCreatedMessage.isDisplayed();
		return successMessage;
	}

	@FindBy(xpath = "//a[normalize-space()='Canon EOS 5D']")
	private WebElement userClickOnEOS5DItem;

	@FindBy(xpath = "//a[normalize-space()='Reviews (0)']")
	private WebElement userClickOnReview;

	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement reviewerNameField;

	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement reviewField;

	@FindBy(xpath = "//input[@value='5']")
	private WebElement userRating;

	@FindBy(xpath = "//button[normalize-space()='Continue']")
	private WebElement userClickOnRatingContinueButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement ratingReviewMessage;

	public void userClickOnEOS5DItem() {
		WebDriverUtility.clickOnElement(userClickOnEOS5DItem);
	}

	public void userClickOnWriteAreviewLink() {
		WebDriverUtility.clickOnElement(userClickOnReview);
	}

	public void reviewerName(String customerName) {
		WebDriverUtility.enterValue(reviewerNameField, customerName);
	}

	public void userReview(String review) {
		WebDriverUtility.enterValue(reviewField, review);
	}

	public void userRatingLink() {
		WebDriverUtility.clickOnElement(userRating);
	}

	public void userRating() {
		WebDriverUtility.clickOnElement(userClickOnRatingContinueButton);
	}

	public void thankyouMessage() {
		WebDriverUtility.getText(ratingReviewMessage);
	}

}
