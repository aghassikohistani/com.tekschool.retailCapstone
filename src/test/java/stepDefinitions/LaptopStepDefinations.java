package stepDefinitions;

import core.Base;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LaptopPageObjects;
import utilities.WebDriverUtility;

public class LaptopStepDefinations extends Base {

	LaptopPageObjects laptopPage = new LaptopPageObjects();

	@When("^User click on Laptops & NoteBook tab$")
	public void user_click_on_Laptops_NoteBook_tab() throws Throwable {

		laptopPage.clickOnLaptopAndNotebookOption();
		WebDriverUtility.screenShot();
		logger.info("use click on laptop and notebook tab");
	}

	@When("^User click on show all Laptop &NoteBook option$")
	public void user_click_on_show_all_Laptop_NoteBook_option() throws Throwable {
		laptopPage.clickOnSHowAllLaptopsAndNotebookOption();
		WebDriverUtility.screenShot();
		logger.info("user clicked on show all laptop and notebook option");

	}

	@When("^User click on Macbook item$")
	public void user_click_on_Macbook_item() throws Throwable {
		laptopPage.userClickOnMackbook();
		WebDriverUtility.screenShot();
		logger.info("user click on mackbook");

	}

	@When("^User click on add to Cart button$")
	public void user_click_on_add_to_Cart_button() throws Throwable {
		laptopPage.userClickOnAddToCartOption();
		WebDriverUtility.screenShot();
		logger.info("user click on add to cart button");
	}

	@Then("^User should see a message ‘Success: You have added MacBook to your shopping Cart!’$")
	public void successMessageIsDisplayed() throws Throwable {

		laptopPage.sucsessMessageDisplay();
		WebDriverUtility.screenShot();
		logger.info("sccess message displayed");

	}

	@When("^User click on product comparison icon on ‘MackBook’$")
	public void user_click_on_product_comparison_icon_on_MackBook() throws Throwable {
		laptopPage.macbookProductComparisonIcon();
		WebDriverUtility.screenShot();
		logger.info("UserClickOnMacBookIcon");

	}

	@When("^User click on product copmarison icon on ‘MackBook Air$")
	public void user_click_on_product_copmarison_icon_on_MackBook_Air() throws Throwable {
		laptopPage.macBookAirProductComparison();
		WebDriverUtility.screenShot();
		logger.info(laptopPage);

	}

	@Then("^User should see a message ‘Success: You have added Mackook Air to your product comparison!’$")
	public void user_should_see_a_message_Success_You_have_added_Mackook_Air_to_your_product_comparison()
			throws Throwable {
		laptopPage.messageOfSuccess();
		WebDriverUtility.screenShot();
		logger.info("Success message was displayed");

	}

	@Then("^User click on product comparison link$")
	public void user_click_on_product_comparison_link() throws Throwable {
		laptopPage.productComparisonLink();
		WebDriverUtility.screenShot();
		logger.info("user clicked on product comparison link");

	}

	@Then("^User should see product Comparison Chart\\.$")
	public void user_should_see_product_Comparison_Chart() throws Throwable {
		laptopPage.userShouldSeeProductComparisonChart();
		WebDriverUtility.screenShot();
		logger.info("product comparison chart was displayed");

	}

	@When("^User click on heart icon to add ‘Sony Vaio’ laptop t wish list$")
	public void user_click_on_heart_icon_to_add_Sony_Vaio_laptop_t_wish_list() throws Throwable {
		laptopPage.addingItemToWishList();
		WebDriverUtility.screenShot();
		logger.info("user added Sony vaio to their wish list");
	}

	@Then("^User should get a message ‘You must login or create account to save Sony Vaio to your wish list!’$")
	public void user_should_get_a_message_You_must_login_or_create_account_to_save_Sony_Vaio_to_your_wish_list()
			throws Throwable {
		laptopPage.wishListMessage();
		WebDriverUtility.screenShot();
		logger.info("user got the account creation message");
	}

	@When("^User click on ‘MacBook pro’ item$")
	public void user_click_on_MacBook_pro_item() throws Throwable {

		laptopPage.userClickOnMacBookPro();
		WebDriverUtility.screenShot();
		logger.info("User clicked on MacBookPro");
	}

	@Then("^User should see ‘\\$(\\d+)\\.(\\d+)’ price tag is present on UI\\.$")
	public void user_should_see_$_price_tag_is_present_on_UI(int arg1, int arg2) throws Throwable {
		laptopPage.macBookProPrice();
		WebDriverUtility.screenShot();
		logger.info("price is visible on the UI");
	}

}