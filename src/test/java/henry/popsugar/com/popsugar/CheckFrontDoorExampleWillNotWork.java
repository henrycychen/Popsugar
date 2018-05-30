package henry.popsugar.com.popsugar;

import org.junit.Test;

/*
 * This test suite will not work on purpose. You must refactor the name of test
 * to CheckFrontDoorTest for this to be run on maven. The purpose of this was 
 * to run locally.
 */

public class CheckFrontDoorExampleWillNotWork extends BaseTest{

	@Test
	public void bvtCheckUSFrontDoor() {
		BaseFrontDoorPage FD = new BaseFrontDoorPage(driver, wait);
		//Go to the front door web page
		FD.goToHomePage("https://www.popsugar.com");
		//Check the common web elements on the front door
		FD.seeElementInHashMap(FD.getFrontDoorElements().values());
		//Check top shelf elements
		FD.seeElementInHashMap(FD.getTopShelfElements().values());	
		//Check top story elements
		FD.seeElementInHashMap(FD.getTopStoryElements().values());	
		//Check latest news elements
		FD.seeElementInHashMap(FD.getLatestNewsElements().values());
		//Check social shares elements
		String[] noSocial = {""};
		FD.seeElementInHashMap(FD.getSocialSharesElements(noSocial).values());
	}
	
	/*
	 * This test will fail on purpose to show that not all front doors are 
	 * the same. It has a GDPR consent and also different social shares
	 */
	@Test
	public void bvtCheckUKFrontDoor() {
		BaseFrontDoorPage FD = new BaseFrontDoorPage(driver, wait);
		FD.goToHomePage("https://www.popsugar.co.uk");
		FD.removeGDPRConsent();
		FD.seeElementInHashMap(FD.getFrontDoorElements().values());
		FD.seeElementInHashMap(FD.getTopShelfElements().values());	
		FD.seeElementInHashMap(FD.getTopStoryElements().values());	
		FD.seeElementInHashMap(FD.getLatestNewsElements().values());
		// Remove Twitter and Google Plus from the Hashmap
		String[] noSocial = {"shareTwitter", "shareGplus"};
		FD.seeElementInHashMap(FD.getSocialSharesElements(noSocial).values());
	}
	
	@Test
	public void bvtCheckAUFrontDoor() {
		BaseFrontDoorPage FD = new BaseFrontDoorPage(driver, wait);
		FD.goToHomePage("https://www.popsugar.com.au");
		FD.seeElementInHashMap(FD.getFrontDoorElements().values());
		FD.seeElementInHashMap(FD.getTopShelfElements().values());	
		FD.seeElementInHashMap(FD.getTopStoryElements().values());	
		FD.seeElementInHashMap(FD.getLatestNewsElements().values());
		String[] noSocial = {""};
		FD.seeElementInHashMap(FD.getSocialSharesElements(noSocial).values());
	}	
}
