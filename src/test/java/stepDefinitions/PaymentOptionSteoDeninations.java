package stepDefinitions;

import java.util.List;
import java.util.Map;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PaymentOptionPageObj;
import utilities.WebDriverUtility;

public class PaymentOptionSteoDeninations extends Base {

	PaymentOptionPageObj affiliate = new PaymentOptionPageObj();

	@Given("^User Click on affiliate link$")
	public void user_Click_on_affiliate_link() throws Throwable {
		affiliate.userClickOnAffiliateLink();
		WebDriverUtility.screenShot();
		logger.info("User Clicked On Affiliate Link");
	}

	@Given("^User Click on new affiliate link$")
	public void user_Click_on_new_affiliate_link() throws Throwable {
		affiliate.userClickOnNewAffiliateLink();
		WebDriverUtility.screenShot();
		logger.info("User Clicked on new Affiliate Link");
	}

	@Given("^User fil affiliate with below information$")
	public void user_fil_affiliate_with_below_information(DataTable clientInfo) throws Throwable {
		List<Map<String, String>> DataValues = clientInfo.asMaps(String.class, String.class);
		affiliate.firstNameField(DataValues.get(0).get("firstName"));
		affiliate.lastNameField(DataValues.get(0).get("lastName"));
		affiliate.emailField(DataValues.get(0).get("email"));
		affiliate.telephoneField(DataValues.get(0).get("telephone"));
		affiliate.companyName(DataValues.get(0).get("company"));
		affiliate.companyWebSite(DataValues.get(0).get("website"));
		affiliate.companyTaxId(DataValues.get(0).get("taxId"));
		affiliate.chequePayeeName(DataValues.get(0).get("chequePayeeName"));
		affiliate.passwordField(DataValues.get(0).get("password"));
		affiliate.confirmPassword(DataValues.get(0).get("confirmPassword"));
		WebDriverUtility.screenShot();
		logger.info("Client filled the form");
	}

	@Given("^User Click on contiue button$")
	public void user_Click_on_contiue_button() throws Throwable {
		affiliate.continueBtoon();
	}

	@Given("^User Click on about us link$")
	public void user_Click_on_about_us_link() throws Throwable {
		affiliate.aboutUsLink();
		WebDriverUtility.screenShot();
		logger.info("User clicked on about us link");
	}

	@Then("^User should see a sccess message$")
	public void user_should_see_a_sccess_message() throws Throwable {
		affiliate.successMessage();

	}
	// third continue button step

	@Then("^User click on the continue link$")
	public void user_click_on_the_continue_link() throws Throwable {
		affiliate.userClickOnContinueButtonAgain();
		WebDriverUtility.screenShot();
		logger.info("User clicked on continue button after seeing message");
	}

	@When("^User Click on Edit your affiliate information link$")
	public void user_Click_on_Edit_your_affiliate_information_link() throws Throwable {
		affiliate.userClickOnAffiliateInfo();
		WebDriverUtility.screenShot();
		logger.info("User click on affiliate info");
	}

	@When("^User Click on Bank Transfer radio button$")
	public void user_Click_on_Bank_Transfer_radio_button() throws Throwable {
		affiliate.userClickOnBankTransferButton();
		WebDriverUtility.screenShot();
		logger.info("User clicked on Bank transfer button");
	}

	@When("^User fill bank information with below information$")
	public void user_fill_bank_information_with_below_information(DataTable info) throws Throwable {
		List<Map<String, String>> information = info.asMaps(String.class, String.class);
		affiliate.bankName(information.get(0).get("bankName"));
		affiliate.abaNumber(information.get(0).get("abaNumber"));
		affiliate.swiftCode(information.get(0).get("swiftCode"));
		affiliate.accountName(information.get(0).get("accountName"));
		affiliate.accountNUmberField(information.get(0).get("accountNumber"));
		WebDriverUtility.wait(7000);
		WebDriverUtility.screenShot();
		logger.info("User filled the information");

	}

	@When("^User Click on continue button$")
	public void user_Click_on_continue_button() throws Throwable {

		affiliate.continueBtoon();
		WebDriverUtility.screenShot();
		logger.info("User clicked on continue button");

	}

	@Then("^User click should see a success message$")
	public void user_click_should_see_a_success_message() throws Throwable {

		affiliate.successMessage();
		WebDriverUtility.screenShot();
		logger.info("account creation message was displayed");
        WebDriverUtility.wait(4000);
	}

//edit account step definations
	@When("^User click on Eidt your account information link$")
	public void user_click_on_Eidt_your_account_information_link() throws Throwable {
		affiliate.userClickOnEditAccountLink();
		WebDriverUtility.screenShot();
		logger.info("User clicked on edit account info.. link");
	}

	@When("^User modify below information$")
	public void user_modify_below_information(DataTable editinfo) throws Throwable {
		List<Map<String, String>> editAccount = editinfo.asMaps(String.class, String.class);
		affiliate.editAccountFristNameField(editAccount.get(0).get("name"));
		affiliate.editAccountLastNameField(editAccount.get(0).get("lastName"));
		affiliate.editAccountEmailField(editAccount.get(0).get("email"));
		affiliate.editAccountTelephoneField(editAccount.get(0).get("telephone"));
	}

	@When("^User click on continue button$")
	public void user_click_on_continue_button() throws Throwable {
		affiliate.editAccountContinueButton();
		WebDriverUtility.screenShot();
		logger.info("User clicked on continue button");

	}

	@Then("^User should see a scuccess message 'success: your account has been uodated'$")
	public void user_should_see_a_scuccess_message_success_your_account_has_been_uodated() throws Throwable {
		affiliate.editAccountSuccessMessage();
		logger.info("success message was displayed");

	}

}
