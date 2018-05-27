package henry.popsugar.com.popsugar;

/*
 * 
 */

import org.junit.Test;

public class CheckFrontDoorTest extends BaseTest{

	@Test
	public void bvtCheckUSFrontDoor() {
		BaseFrontDoorPage FD = new BaseFrontDoorPage(driver, wait);
		//Go to the front door web page
		FD.goToHomePage("https://www.popsugar.com");
		//Check the common web elements on the front door
		FD.seeElementInArray(FD.getFrontDoorElements().values());
		//Check top shelf elements
		FD.seeElementInArray(FD.getTopShelfElements().values());	
		//Check top story elements
		FD.seeElementInArray(FD.getTopStoryElements().values());	
		//Check latest news elements
		FD.seeElementInArray(FD.getLatestNewsElements().values());
		//Check social shares elements
		FD.seeElementInArray(FD.getSocialSharesElements().values());
	}
	
	@Test
	public void bvtCheckUKFrontDoor() {
		BaseFrontDoorPage FD = new BaseFrontDoorPage(driver, wait);
		FD.goToHomePage("https://www.popsugar.co.uk");
		//Click GDPR cookie message #1
		FD.click("#_evidon-banner-acceptbutton");
		//Click GDPR cookie message #2
		FD.click("#btn-ok");
		FD.seeElementInArray(FD.getFrontDoorElements().values());
		FD.seeElementInArray(FD.getTopShelfElements().values());	
		FD.seeElementInArray(FD.getTopStoryElements().values());	
		FD.seeElementInArray(FD.getLatestNewsElements().values());
		//This will fail because they do not have twitter
		FD.seeElementInArray(FD.getSocialSharesElements().values());
	}
	
	@Test
	public void bvtCheckAUFrontDoor() {
		BaseFrontDoorPage FD = new BaseFrontDoorPage(driver, wait);
		FD.goToHomePage("https://www.popsugar.com.au");
		FD.seeElementInArray(FD.getFrontDoorElements().values());
		FD.seeElementInArray(FD.getTopShelfElements().values());	
		FD.seeElementInArray(FD.getTopStoryElements().values());	
		FD.seeElementInArray(FD.getLatestNewsElements().values());
		FD.seeElementInArray(FD.getSocialSharesElements().values());
	}	
}
