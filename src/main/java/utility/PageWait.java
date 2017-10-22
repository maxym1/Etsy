package utility;

import java.util.concurrent.TimeUnit;

import static base.testBase.driver;

/**
 * Created by maxwell on 19/10/2017.
 */
public class PageWait {

        public static void untilVisible(){
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

    }
}
