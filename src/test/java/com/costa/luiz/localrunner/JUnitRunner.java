package packages.common.localrunner;

import org.junit.*;

import core.components.ComponentHandler;
import core.components.ObjectRepository;
import pcx.modules.LoginModule;

public class JUnitRunner {
	@Before
	public void Visit() {
		System.out.println("testing now...");
		ComponentHandler.Init(); 
		ComponentHandler.NavigateToURL("http://pcx.seliselocal.com/");
		System.out.println("Site Visited");
	}
	
	@Test
	public void login() {
	    new LoginModule().getLogin("kawsar.ahmed@selise.ch", "en", "1qazZAQ!");
	    System.out.println("Login Worked");
	}
	
	@After
	public void Quit() {
	    System.out.println("************ All Script has been ended ************");
	    ObjectRepository.driver.quit();
	}
}
