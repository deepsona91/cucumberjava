package StepDefinitions;
import io.cucumber.java.*;
/**
 * contains hook methods. To implement a hook class create a separate class and add setup
 * and tear down methods. Add @Before and @After tags. You may include tags to make it conditional or add
 * order so methods will run in order.
 * @author Deep
 *
 */
public class Hooks 
{
	/**
	 * method with @Before tag will always run before a scenario. Hooks can be conditional,
	 *  i,e- we can create conditional hook my mentioning the tag name 
	 *Hook methods has order. i,e- @Before(0) will always run before @Before(1). @Before(3) will run after @Before(1)
	 *, @Before(2) has executed.
	 */
	
	@Before
	public void before()
	{
		System.out.println("Initializing chrome driver before test");
	}
	
	/**
	 * Method with @after tag will always run after scenario is ended irrespective of scenario failed or passed.
	 */
	@After
	public void After()
	{
		System.out.println("Quiting chrome driver after test");
	}
}
