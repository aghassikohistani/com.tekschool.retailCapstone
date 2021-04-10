package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.RetailPageObj;
import utilities.WebDriverUtility;

public class RetailPageTestStepDefinitions extends Base {

	// In this class we will write Actual Java/Selenium codes associated to each
	// Sceanrio
	// Steps.

	RetailPageObj retailPage = new RetailPageObj();

	@When("^User search for '(.+)'$")
	public void user_search_for_iphone(String value) throws Throwable {
		retailPage.enterValueToSearchBar(value);
		logger.info("User entered value in search bar");
		WebDriverUtility.screenShot();

	}

	@When("^User click on search button$")
	public void user_click_on_search_button() throws Throwable {
		retailPage.clickOnSearchButton();
		logger.info("User clicked on search button");

	}

	@Then("^User should see Iphone image$")
	public void user_should_see_Iphone_image() throws Throwable {
		Assert.assertTrue(retailPage.iPhoneImageIsDisplayed());
		WebDriverUtility.screenShot();
		logger.info("iPhone image is displayed");

	}

	@When("^User click on Register option$")
	public void user_click_on_Register_option() throws Throwable {
		retailPage.clickOnRegister();
		logger.info("User clicked on Register option");

	}

	@When("^User fill the Registration form with Below information$")
	public void user_fill_the_Registration_form_with_Below_information(DataTable personalInfo) throws Throwable {
		List<Map<String, String>> dataValues = personalInfo.asMaps(String.class, String.class);
		retailPage.enterFirstName(dataValues.get(0).get("firstName"));
		retailPage.enterLastName(dataValues.get(0).get("lastName"));
		retailPage.enterEmail(dataValues.get(0).get("email"));
		retailPage.enterTelephone(dataValues.get(0).get("telephone"));
		retailPage.enterPassword(dataValues.get(0).get("password"));
		retailPage.enterConfirmPassword(dataValues.get(0).get("confirmPassword"));
		retailPage.subscribe(dataValues.get(0).get("subscribe"));

		logger.info("User filled the information form");
		WebDriverUtility.screenShot();

	}

	@When("^User accept the privacy and policy$")
	public void user_accept_the_privacy_and_policy() throws Throwable {

		retailPage.checkPrivacyPolicy();
		logger.info("User check privacy and policy");
		WebDriverUtility.screenShot();

	}

	@When("^User click on Continue button$")
	public void user_click_on_Continue_button() throws Throwable {
		retailPage.clickOnContinueButton();
		logger.info("User clicked on Continue button");
	}

	@Then("^User should be registered in Retail Website$")
	public void user_should_be_registered_in_Retail_Website() throws Throwable {

		Assert.assertTrue(retailPage.registrationOutcome());
		WebDriverUtility.screenShot();
		logger.info("Account was created Successfully");

	}

	@When("^User click on Desktop tab$")
	public void user_click_on_Desktop_tab() throws Throwable {
		retailPage.clickOnDeskTopsTab();
		WebDriverUtility.screenShot();
		logger.info("User Click On Desktops Tab");
	}

	@When("^User click on show all Desktop link$")
	public void user_click_on_show_all_Desktop() throws Throwable {
		retailPage.showAllDesktops();
		WebDriverUtility.screenShot();
		logger.info("User Click On Show All Desktops");
	}

	@Then("^User should see all Desktop$")
	public void user_should_see_all_Desktop() throws Throwable {
		retailPage.allItemsArePresent();
		WebDriverUtility.screenShot();
		logger.info("user should see all items are present");
	}

	@Then("^see all items are present on Desktop$")
	public void see_all_items_are_present_on_Desktop() throws Throwable {
		retailPage.contentOfPage();
		WebDriverUtility.screenShot();
		logger.info("All Items are present");
	}

	@When("^User Click ADD TO  CART Option on ‘HP LP(\\d+)’ item$")
	public void user_Click_ADD_TO_CART_Option_on_HP_LP_item(int arg1) throws Throwable {
		retailPage.addToCartOption();
		WebDriverUtility.screenShot();
		logger.info("user clicked add to cart option on HP LP 3065");
	}

	@When("^User Select quantity (\\d+)$")
	public void user_Select_quantity(int arg1) throws Throwable {
		retailPage.userSelectQuantity();
		WebDriverUtility.screenShot();
		logger.info("user selected quantity 1");
	}

	@When("^User Click ADD TO  CART Option on ‘HP LP(\\d+)’ item 	And User Select quantity one$")
	public void user_Click_ADD_TO_CART_Option_on_HP_LP_item_And_User_Select_quantity_one(int arg1) throws Throwable {
		retailPage.addToCartOption();

	}

	@When("^User Click add to cart button$")
	public void user_Click_add_to_cart_button() throws Throwable {
		retailPage.clickOnAddToCartButton();
		WebDriverUtility.screenShot();
		logger.info("user clicked on add to cart button");
	}

	@Then("^User should see a message ‘success: you have added HP LP (\\d+) to your Shopping cart’$")
	public void user_should_see_a_message_success_you_have_added_HP_LP_to_your_Shopping_cart(int arg1)
			throws Throwable {
		retailPage.successMessage();
		WebDriverUtility.screenShot();
		logger.info("success message displayed");
	}

	@When("^User click on EOS (\\d+)D item$")
	public void user_click_on_EOS_D_item(int arg1) throws Throwable {
		retailPage.userClickOnEOS5DItem();
		WebDriverUtility.screenShot();
		logger.info("User Clicked On EOS 5D Item");

	}

	@When("^User click on write a review link$")
	public void user_click_on_write_a_review_link() throws Throwable {
		retailPage.userClickOnWriteAreviewLink();
		WebDriverUtility.screenShot();
		logger.info("User Clicked on write a review link");
	}

	@When("^user fill the review information with below information$")
	public void user_fill_the_review_information_with_below_information(DataTable userReview) throws Throwable {
		List<Map<String, String>> DataValues = userReview.asMaps(String.class, String.class);
		retailPage.reviewerName(DataValues.get(0).get("yourName"));
		retailPage.userReview(DataValues.get(0).get("reviews"));

		WebDriverUtility.screenShot();
		logger.info("User filled the information");

	}

	@When("^User click on good or bad radio button$")
	public void user_click_on_good_or_bad_radio_button() throws Throwable {

		retailPage.userRatingLink();
		WebDriverUtility.screenShot();
		logger.info("user clicked on user rating radio button");

	}

	@When("^User click on Continue Button$")
	public void user_click_on_Continue_Button() throws Throwable {
		retailPage.userRating();
	}

	@Then("^User should see a message with ‘Thank you for your review \\. it has been submitted to the webmaster for approval$")
	public void user_should_see_a_message_with_Thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval()
			throws Throwable {
		retailPage.thankyouMessage();

	}

////EOS Canon 5D add to cart step definations

@When("^User click ADD TO CART option on ‘Canon EOS (\\d+)D’ item$")
public void user_click_ADD_TO_CART_option_on_Canon_EOS_D_item(int arg1) throws Throwable {

	
	
	
}

@When("^User select color ‘Red’$")
public void user_select_color_Red() throws Throwable {
   
}

@When("^User click add to Cart button$")
public void user_click_add_to_Cart_button() throws Throwable {
  
}

@Then("^User should see a message ‘Success: You have added Canon EOS (\\d+)D to your shopping cart!’$")
public void user_should_see_a_message_Success_You_have_added_Canon_EOS_D_to_your_shopping_cart(int arg1) throws Throwable {
    
}




}
