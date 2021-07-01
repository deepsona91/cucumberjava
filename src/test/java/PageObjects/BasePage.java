package PageObjects;
/**
 * Abstract class for Basic and common operations
 * @author Deep
 *
 */
public abstract class BasePage {
	/**
	 * Abstract Method to check if page is visible
	 * @return
	 */
	public abstract boolean IsPageVisible();
	
	/**
	 * Method to click on logout button
	 */
	public void ClickOnLogoutButton()
	{
		System.out.println("Clicked On Logout button");
	}
	
}
