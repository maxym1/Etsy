package Step_Definitions;

import base.testBase;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.SearchPage;
import utility.Scroll;
import utility.CommonElement;


import java.io.IOException;


public class Search extends testBase {

	@Before
	public void setup() throws IOException{
		initialize();
	}

    @When("^he clicks Jewellery & Accessories label on the landing page$")
    public void he_clicks_Jewellery_Accessories_label_on_the_landing_page() throws Throwable {
        SearchPage search = PageFactory.initElements(driver, SearchPage.class);
        search.click_jewellery_Accessories();
    }

    @When("^he again clicks ALL JEWELLERIES & ACCESSORIES from the drop down$")
    public void he_again_clicks_ALL_JEWELLERIES_ACCESSORIES_from_the_drop_down() throws Throwable {
        SearchPage search = PageFactory.initElements(driver, SearchPage.class);
        search.click_side_nav();
    }

    @Then("^he clicks on Free Shipping$")
    public void he_clicks_on_Free_Shipping() throws Throwable {
        SearchPage search = PageFactory.initElements(driver, SearchPage.class);
        search.click_free_shipping();
    }

    @Then("^he clicks on Special offers$")
    public void he_clicks_on_Special_offers() throws Throwable {
        SearchPage search = PageFactory.initElements(driver, SearchPage.class);
        search.click_on_sale();
    }

    @Then("^he selects \"([^\"]*)\" as shop location$")
    public void he_selects_as_shop_location(String text) throws Throwable {
        driver.findElement(By.linkText(text)).click();
    }

    @And("^he selects item \"([^\"]*)\" as item type$")
    public void heSelectsItemAsItemType(String item) throws Throwable {
        Scroll.page_down();
        CommonElement.select_option(item);
    }

    @And("^he selects price \"([^\"]*)\" as price range$")
    public void heSelectsPriceAsPriceRange(String item) throws Throwable {
	    Scroll.page_down();
        CommonElement.select_option(item);
    }

    @And("^he selects colour \"([^\"]*)\" as colour type$")
    public void heSelectsColourAsColourType(String item) throws Throwable {
        Scroll.page_to_the_buttom();
	    CommonElement.select_option(item);
    }

    @And("^he selects ordering \"([^\"]*)\" as ordering options$")
    public void heSelectsOrderingAsOrderingOptions(String item) throws Throwable {
        Scroll.page_to_the_buttom();
        CommonElement.select_option(item);
    }

    @And("^he mouses over Clothing & Shoes label on the landing page and click Womens from the drop down$")
    public void heMousesOverClothingShoesLabelOnTheLandingPageAndClickWomensFromTheDropDown() throws Throwable {
        SearchPage search = PageFactory.initElements(driver, SearchPage.class);
        search.mouseOverClothingsAndShoesAndClickWomen();
    }

    @And("^he selects Dresses from the women clothing down menu$")
    public void heSelectsDressesFromTheWomenClothingDownMenu() throws Throwable {
        SearchPage search = PageFactory.initElements(driver, SearchPage.class);
        search.select_womens();
    }

    @Then("^he sees total number \"([^\"]*)\" of products displayed on the landing page$")
    public void heSeesTotalNumberOfProductsDisplayedOnTheLandingPage(String items ) throws Throwable {
        SearchPage search = PageFactory.initElements(driver, SearchPage.class);
        search.check_item_numbers(items);
    }

    @Then("^he sees a refine number \"([^\"]*)\" of items displayed on the landing page$")
    public void heSeesARefineNumberOfItemsDisplayedOnTheLandingPage(String items) throws Throwable {
        SearchPage search = PageFactory.initElements(driver, SearchPage.class);
        search.check_refine_item_numbers(items);
    }
}
