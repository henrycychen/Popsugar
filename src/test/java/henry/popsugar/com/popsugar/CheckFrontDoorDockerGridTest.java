package henry.popsugar.com.popsugar;

import java.net.MalformedURLException;
import org.junit.Test;

/*
 * This test checks three different locale sites. Two are the same (US 
 * and AU) and one is different (UK locale). This shows that using a 
 * page object model is beneficial to easily update tests when different
 * elements appear.
 */

public class CheckFrontDoorDockerGridTest extends BaseDockerGridTest{
	    
		@Test
		public void bvtCheckUSFrontDoor() throws MalformedURLException, InterruptedException {
			BaseDockerGridFrontDoorPage FD = new BaseDockerGridFrontDoorPage(driver);
				FD.goToHomePage("chrome", "64.0", "https://www.popsugar.com");
				FD.seeElementInHashMap(FD.getFrontDoorElements().values());
				FD.seeElementInHashMap(FD.getTopShelfElements().values());
				FD.seeElementInHashMap(FD.getTopStoryElements().values());
				FD.seeElementInHashMap(FD.getLatestNewsElements().values());
				String[] noSocial = {""};
				FD.seeElementInHashMap(FD.getSocialSharesElements(noSocial).values());
				FD.driver.quit();
		}
		
		@Test
		public void bvtCheckAUFrontDoor() throws MalformedURLException, InterruptedException {
			BaseDockerGridFrontDoorPage FD = new BaseDockerGridFrontDoorPage(driver);
			FD.goToHomePage("chrome", "64.0", "https://www.popsugar.com.au");
			FD.seeElementInHashMap(FD.getFrontDoorElements().values());
			FD.seeElementInHashMap(FD.getTopShelfElements().values());	
			FD.seeElementInHashMap(FD.getTopStoryElements().values());	
			FD.seeElementInHashMap(FD.getLatestNewsElements().values());
			String[] noSocial = {""};
			FD.seeElementInHashMap(FD.getSocialSharesElements(noSocial).values());
			FD.driver.quit();
		}	

		/*
		 * Notice that this test is different from the other two as it 
		 * has a GDPR function and removal of a couple elements from 
		 * the Hashmap because the UK locale does not provide this type 
		 * of social share site.
		 */
		
		@Test
		public void bvtCheckUKFrontDoor() throws MalformedURLException, InterruptedException {
			BaseDockerGridFrontDoorPage FD = new BaseDockerGridFrontDoorPage(driver);
			FD.goToHomePage("chrome", "64.0", "https://www.popsugar.co.uk");
			FD.removeGDPRConsent();
			FD.seeElementInHashMap(FD.getFrontDoorElements().values());
			FD.seeElementInHashMap(FD.getTopShelfElements().values());	
			FD.seeElementInHashMap(FD.getTopStoryElements().values());	
			FD.seeElementInHashMap(FD.getLatestNewsElements().values());
			// Remove Twitter and Google Plus from the Hashmap
			String[] noSocial = {"shareTwitter", "shareGplus"};
			FD.seeElementInHashMap(FD.getSocialSharesElements(noSocial).values());
			FD.driver.quit();
		}
}
