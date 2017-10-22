package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.PageWait;

import static base.testBase.driver;


public class SearchPage {
	
	@FindBy(how=How.ID, using="catnav-primary-link-10855")
	public static WebElement jewelleryAndAccessories;

    @FindBy(how=How.ID, using="catnav-primary-link-10923")
    public static WebElement clothingsAndShoes;

    @FindBy(how=How.ID, using="side-nav-category-link-10924")
    public static WebElement sideNavWomen;

    @FindBy(how=How.ID, using="catnav-l4-10926")
    public static WebElement womens;
	
	@FindBy(how=How.ID, using="side-nav-category-link-10855")
	public static WebElement side_nav;

	@FindBy(how=How.LINK_TEXT, using="Free shipping")
	public static WebElement free_shipping;

    @FindBy(how=How.LINK_TEXT, using="On sale")
    public static WebElement on_sale;

    @FindBy(how=How.CSS, using="span:nth-child(8)")
    public static WebElement item_number;

    @FindBy(how=How.CSS, using="span:nth-child(4)")
    public static WebElement refine_item_numbers;

	
	public void click_jewellery_Accessories() throws InterruptedException {
        jewelleryAndAccessories.click();
        Thread.sleep(1000);
	}

    public void select_womens() throws InterruptedException {
        womens.click();
    }

    public void click_side_nav() throws InterruptedException {
        PageWait.untilVisible();
        side_nav.click();
	}

	public void click_free_shipping() throws InterruptedException {
        free_shipping.click();
	}

    public void click_on_sale() throws InterruptedException {
        PageWait.untilVisible();
        on_sale.click();
    }

    public void mouseOverClothingsAndShoesAndClickWomen() throws InterruptedException {
	    WebElement element = clothingsAndShoes;
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
        Thread.sleep(1000);
        sideNavWomen.click();
    }

    public void check_item_numbers(String items) throws InterruptedException {
        String ActualMessage = item_number.getText();
        System.out.println(ActualMessage);
        ActualMessage.contains(items);
    }

    public void check_refine_item_numbers(String items) throws InterruptedException {
        String ActualMessage = refine_item_numbers.getText();
        System.out.println(ActualMessage);
        ActualMessage.contains(items);
    }

}
