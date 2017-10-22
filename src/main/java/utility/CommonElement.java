package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static base.testBase.driver;

/**
 * Created by maxwell on 19/10/2017.
 */
public class CommonElement {

    public static void select_option(String item) throws InterruptedException {
        WebElement element = driver.findElement(By.linkText(item));
        element.click();
    }
}
