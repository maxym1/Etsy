package Step_Definitions;

import base.testBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import java.io.IOException;

public class Common extends testBase{
	
	
	@Before
	public void setup() throws IOException{
		initialize();
	}

    @Given("^\"([^\"]*)\" is viewing the landing page$")
    public void is_viewing_the_landing_page(String name) throws Throwable {
        driver.get(CONFIG.getProperty("URL"));
        driver.manage().window().maximize();
         Thread.sleep(1000);
    }

    @After
    public void teardown(Scenario scenario){
        if(scenario.isFailed()){
            System.out.println(scenario.getName());
        }

        System.out.println("All Test Passed");
    }

}
