package henry.popsugar.com.popsugar;

import org.junit.Test;

public class CheckFrontDoorTest extends BaseTest{

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
		FD.seeElementInHashMap(FD.getSocialSharesElements().values());
	}
	
	//This test will fail on purpose
	@Test
	public void bvtCheckUKFrontDoor() {
		BaseFrontDoorPage FD = new BaseFrontDoorPage(driver, wait);
		FD.goToHomePage("https://www.popsugar.co.uk");
		//Click GDPR cookie message #1
		FD.click("#_evidon-banner-acceptbutton");
		//Click GDPR cookie message #1
		FD.click("#btn-ok");
		FD.seeElementInHashMap(FD.getFrontDoorElements().values());
		FD.seeElementInHashMap(FD.getTopShelfElements().values());	
		FD.seeElementInHashMap(FD.getTopStoryElements().values());	
		FD.seeElementInHashMap(FD.getLatestNewsElements().values());
		//This will fail because they do not have twitter
		FD.seeElementInHashMap(FD.getSocialSharesElements().values());
	}
	
	@Test
	public void bvtCheckAUFrontDoor() {
		BaseFrontDoorPage FD = new BaseFrontDoorPage(driver, wait);
		FD.goToHomePage("https://www.popsugar.com.au");
		FD.seeElementInHashMap(FD.getFrontDoorElements().values());
		FD.seeElementInHashMap(FD.getTopShelfElements().values());	
		FD.seeElementInHashMap(FD.getTopStoryElements().values());	
		FD.seeElementInHashMap(FD.getLatestNewsElements().values());
		FD.seeElementInHashMap(FD.getSocialSharesElements().values());
	}	
}
