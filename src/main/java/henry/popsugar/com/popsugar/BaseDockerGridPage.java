package henry.popsugar.com.popsugar;

import java.util.Collection;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

/*
 * BasePage class contains common methods for all page classes
 */

public class BaseDockerGridPage {
	public RemoteWebDriver driver;

	//Constructor
	public BaseDockerGridPage(RemoteWebDriver driver) {
		this.driver = driver;
		System.out.println("BaseRemotePage class initialized");
	}
	
	//Click Method
	public void click(String cssLocator) {
		driver.findElement(By.cssSelector(cssLocator)).click();
	}
	
	//Fill fields in text boxes
	public void fillFields(String cssLocator, String text) {
		driver.findElement(By.cssSelector(cssLocator)).sendKeys(text + "\n");
	}
	
	//Get text from element
	public String getText(String cssLocator) {
		return driver.findElement(By.cssSelector(cssLocator)).getText();
	}
	
	//Get text from attribute
	public String getAttribute(String cssLocator, String attribute) {
		return driver.findElement(By.cssSelector(cssLocator)).getAttribute(attribute);
	}
	
	//See if an element exists, if it doesn't, fail the test
	public void seeElement(String element) {
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);
		boolean exists = driver.findElements( By.cssSelector(element) ).size() != 0;
		System.out.println("I see element: " + element);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		if(exists == false) {
			System.out.println("I don't see this element: " + element + " it returns: " + exists);
			driver.findElement(By.cssSelector(";;;;;"));
		}
	}
	
	public void seeElementInHashMap(Collection<String> collection) {
		for (String values : collection) {
			seeElement(values);
		}
	}
}
