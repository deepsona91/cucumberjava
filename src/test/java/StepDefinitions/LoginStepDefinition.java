package StepDefinitions;

import io.cucumber.java.en.*;

import PageObjects.LoginPage;

/**
 * Step definition for login page component
 * Each step definition is linked with feature steps. Check Test runner class in project
 * explorer to understand how features are linked(glued) to step definitions.
 * @author Deep
 */
public class LoginStepDefinition {

	String name = null;
	String position = null;
	LoginPage login;
	
	/**
	 * Constructor
	 */
	public LoginStepDefinition() {
		login = new LoginPage();
	}
	
	/**
	 * Initialize the browser
	 * Given is like a precondition
	 */
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Opening chrome browser");
	}
	
	/**
	 * Enter value on name text box
	 * @param value value to enter on user name text box
	 * @When is event. i,e- user clicks on admin button. user types name on name text box. All this two
	 * examples can be treated as a events occured.
	 */
	@When("Enter {string} on name textbox")
	public void enter_value_on_name_textbox(String value) {
		login.EnterTextOnUserNameTextBox(value);
		name = value;
	}
	
	/**
	 * enter value on position text box
	 * @param value value to enter
	 */
	@When("Enter {string} on position textbox")
	public void enter_value_on_position_textbox(String value) {
		login.EnterTextOnPasswordTextBox(value);
		position = value;
	}
	/**
	 * Click on login button
	 */
	@When("click on login button")
	public void click_on_login_button() {
	    login.ClickOnLoginButton();
	}
	@Given("user performs {int}\\/{int}")
	public void user_performs(Integer int1, Integer int2) {
	    int res=1/0;
	}
		
}
