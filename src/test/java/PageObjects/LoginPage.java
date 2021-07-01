package PageObjects;
/**
 * POM class for login page
 * @author Deep
 *
 */
public class LoginPage extends BasePage {
	
	/**
	 * Enter text on user name text box
	 * @param _username User name to enter
	 */
	public void EnterTextOnUserNameTextBox(String _username) {
		System.out.println("Entering text on user name text box");
	}
	
	/**
	 * Enter text on password text box
	 * @param _password password to enter
	 */
	public void EnterTextOnPasswordTextBox(String _password) {
		System.out.println("Entering text on password text box");
	}
	/**
	 * Clicks on login button
	 */
	public void ClickOnLoginButton() {
		System.out.println("Clicked on login button");
	}
	/**
	 * Checks if page is visible
	 */
	@Override
	public boolean IsPageVisible() {
		return true;
	}

}
