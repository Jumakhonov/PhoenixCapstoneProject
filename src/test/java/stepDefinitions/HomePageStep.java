package stepDefinitions;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectRepository.HomePageObject;
import utilities.Utilities;

public class HomePageStep extends Base {

	HomePageObject homePage = new HomePageObject();
	
	@When("User click on Currency")
	public void user_click_on_currency() {
		logger.info("User clicked on Currency");
		homePage.clickOnCurrency();
		Utilities.screenShot();
	}

	@And("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		logger.info("User chosed Euro from dropdown");
		homePage.choseEuroFromDropdown();
		Utilities.screenShot();
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		logger.info("Currency value should be changed to Euro");
		homePage.currencyValueShouldChangeEuro();
		Utilities.screenShot();
	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		logger.info("User click on shopping cart");
		homePage.clickOnShoppingCart();
		Utilities.screenShot();
	}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
		logger.info("Your shopping cart is empty! message should be displayed");
		homePage.yourShoppingCartIsEmpteyMessage();
		Utilities.screenShot();
	}

	
}
