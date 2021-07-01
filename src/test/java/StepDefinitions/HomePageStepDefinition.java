package StepDefinitions;

import org.junit.Assert;

import PageObjects.HomePage;
import io.cucumber.java.en.*;
/**
 * Home page step definition
 * @author Deep
 *
 */
public class HomePageStepDefinition {
	HomePage homepage;
	
	/**
	 * constructor
	 */
	public HomePageStepDefinition()
	{
		homepage= new HomePage();
	}
	
	/**
	 * validate home page is visible
	 * @then is used to validate. i,.e- then validate home page is visible. then validate actual==expected
	 * so use @then to validate
	 */
	@Then("home page is visible")
	public void Is_Homepage_visible()
	{
		Assert.assertTrue("home page is not visible",homepage.IsPageVisible());
	}
	
}
