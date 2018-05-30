package henry.popsugar.com.popsugar;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseDockerGridTest {
	public RemoteWebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.out.println("Remote WebDriver starting");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Remote WebDriver ending");
	}

}
