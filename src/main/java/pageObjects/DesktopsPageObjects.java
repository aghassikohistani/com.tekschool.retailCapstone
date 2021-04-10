package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class DesktopsPageObjects extends Base {

	public DesktopsPageObjects() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")
	private WebElement clickOnDeskTopsTab;

	@FindBy(xpath = "//div[@id='content']/h2")
	private WebElement UserClickOnShowAllDesktops;

	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showAllDesktops;

	@FindBy(xpath = "//div[@id='content']")
	private WebElement allItemsArePresentInDekTopPage;

	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[1]")
	private WebElement addToCartOption;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement userSelectQantityOne;

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButton;

	@FindBy(xpath = "//body/div[@id='product-product']/div[1]")
	private WebElement successMessage;

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

}
