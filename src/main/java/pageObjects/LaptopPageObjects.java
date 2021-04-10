package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class LaptopPageObjects extends Base {

	public LaptopPageObjects() {

		PageFactory.initElements(driver, this);
	}

	// @AddToCartMackBook
	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
	private WebElement userClcikOnLaptopsAndNotebookTab;

	@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement userClickOnShowAllLaptopsAndNotebookOption;

	@FindBy(xpath = "//a[normalize-space()='MacBook']")
	private WebElement userClickOnMackbook;

	@FindBy(xpath = " //button[normalize-space()='Add to Cart']")
	private WebElement userClickOnAddToCartButton;
	
	

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement userUserSuccessMessage;

	public void clickOnLaptopAndNotebookOption() {
		WebDriverUtility.clickOnElement(userClcikOnLaptopsAndNotebookTab);
	}

	public void clickOnSHowAllLaptopsAndNotebookOption() {
		WebDriverUtility.clickElementWithJS(userClickOnShowAllLaptopsAndNotebookOption);
	}

	public void userClickOnMackbook() {
		WebDriverUtility.moveToElementAction(userClickOnMackbook);
		WebDriverUtility.clickOnElement(userClickOnMackbook);
	}

	public void userClickOnAddToCartOption() {
		WebDriverUtility.clickOnElement(userClickOnAddToCartButton);
	}

	public void sucsessMessageDisplay() {
		WebDriverUtility.isElementDisplayed(userUserSuccessMessage);
	}

	// Product Comparison
	@FindBy(xpath = "//div[@id='product-category']//div[2]//div[1]//div[2]//div[2]//button[3]")
	private WebElement mcBookproductComparisonIcon;

	@FindBy(xpath = "//div[@class='row']//div[2]//div[1]//div[2]//div[2]//button[3]")
	private WebElement mcBookAirProductComparisonIcon;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement producerComparesucCessMessage;

	@FindBy(xpath = "//a[normalize-space()='product comparison']")
	private WebElement productComparisonLink;

	@FindBy(xpath = "//strong[normalize-space()='Product Details']")
	private WebElement productComparisonChart;

	public void macbookProductComparisonIcon() {
		WebDriverUtility.clickOnElement(mcBookproductComparisonIcon);
		WebDriverUtility.wait(5000);
	}

	public void macBookAirProductComparison() {
		WebDriverUtility.clickOnElement(mcBookAirProductComparisonIcon);
		WebDriverUtility.wait(5000);

	}

	public void messageOfSuccess() {
		WebDriverUtility.getText(producerComparesucCessMessage);
		WebDriverUtility.wait(5000);
	}

	public void productComparisonLink() {
		WebDriverUtility.clickOnElement(productComparisonLink);
		WebDriverUtility.wait(5000);
	}

	public void userShouldSeeProductComparisonChart() {
		WebDriverUtility.isElementDisplayed(productComparisonChart);
	}

	@FindBy(xpath = "\r\n" + "//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]")
	private WebElement addingItemToWishList;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement wishListMessage;

	public void addingItemToWishList() {
		WebDriverUtility.clickOnElement(addingItemToWishList);
		WebDriverUtility.wait(2000);
	}

	public void wishListMessage() {
		WebDriverUtility.getText(wishListMessage);
	}

	@FindBy(xpath = "//a[normalize-space()='MacBook Pro']")
	private WebElement macBookPro;

	@FindBy(xpath = "//h2[normalize-space()='$2,000.00']")
	private WebElement macBookProPrice;

	public void userClickOnMacBookPro() {
		WebDriverUtility.clickOnElement(macBookPro);
	}

	public void macBookProPrice() {
		WebDriverUtility.getText(macBookProPrice);
	}

}
