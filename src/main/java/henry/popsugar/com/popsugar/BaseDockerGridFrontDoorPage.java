package henry.popsugar.com.popsugar;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseDockerGridFrontDoorPage extends BaseDockerGridPage{
	
	public BaseDockerGridFrontDoorPage(RemoteWebDriver driver) {
		super(driver);
		System.out.println("HomeRemotePage class initialized");
	}
	
	//Page Variables
	String baseURL = "";
	String[] removeElements = {};
	
	//Common Web Elements on page
	public HashMap<String,String> getFrontDoorElements(){
		HashMap<String,String>elements = new HashMap<String,String>();
		elements.put("mainLogo", "#top-nav span[class*='logo']");
		elements.put("topNav", "#js-nav-channel");
		elements.put("navHamburger", ".nav-menu .overlay-menu-toggle.hamburger.icon-menu");
		elements.put("navSearch", "#nav-content  a[class='icon icon-search omniture-track']");
		elements.put("ikbHeaderTitle", ".ikb-header .title");
		elements.put("frontDoor", "#frontdoor");
		elements.put("loadMore", "#pager");
		elements.put("navFavorite", "#nav-content  div[class='nav-favorite favorite-tooltip fixedheader']");
		return elements;
	}
	
	//Top shelf elements on page
	public HashMap<String,String> getTopShelfElements(){
		HashMap<String,String>elements = new HashMap<String,String>();
		elements.put("heroImage", ".feature-section div:nth-child(1) a:nth-child(1) div:nth-child(1) .hero-image");
		elements.put("heroChannel", ".feature-section div:nth-child(1) a:nth-child(2) div:nth-child(2) .hero-channel");
		elements.put("heroTitle", ".feature-section div:nth-child(1) a:nth-child(3) div:nth-child(2) .hero-title");
		elements.put("heroMeta", ".feature-section div:nth-child(1) a:nth-child(4) div:nth-child(2) .meta");		
		return elements;
	}
	
	public HashMap<String,String> getTopStoryElements(){
		HashMap<String,String>elements = new HashMap<String,String>();
		elements.put("topStoryImage", ".top-story-image");
		elements.put("topStoryChannel", ".top-story-channel");
		elements.put("topStoryTitle", ".top-story-title");
		elements.put("topStoryExcerpt", ".top-story-excerpt");
		elements.put("topStoryAuthor", ".top-story-author-name");
		return elements;
	}
	
	public HashMap<String,String> getLatestNewsElements(){
		HashMap<String,String>elements = new HashMap<String,String>();
		elements.put("latestImages", ".ikb-post-grid .ikb-post-image");
		elements.put("latestTitle", ".ikb-post-grid .ikb-post-title");
		elements.put("latestMeta", ".ikb-post-grid .ikb-post-meta");
		return elements;
	}

	public HashMap<String,String> getLatestVideosElements(){
		HashMap<String,String>elements = new HashMap<String,String>();
		elements.put("videoImages", "div[class='ikb-post-image video'] img");
		elements.put("videoInfo", ".ikb-post-info>.ikb-post-header a");
		return elements;
	}
	
	public HashMap<String,String> getSocialSharesElements(String[] removeElements){
		this.removeElements = removeElements;
		HashMap<String,String>elements = new HashMap<String,String>();
		elements.put("shareFaceBook", ".social-follow-buttons .facebook");
		elements.put("shareInstagram", ".social-follow-buttons .instagram");
		elements.put("shareSnapchat", ".social-follow-buttons .snapchat");
		elements.put("sharePinterest", ".social-follow-buttons .pinterest");
		elements.put("shareTwitter", ".social-follow-buttons .twitter");
		elements.put("shareGplus", ".social-follow-buttons .gplus");
		for(String remove:removeElements) {
			elements.remove(remove);
		}
		return elements;
	}
	
	public void removeGDPRConsent() {
		click("#_evidon-banner-acceptbutton");
		click("#btn-ok");
	}
	
	//Page Methods
	public void goToHomePage(String browser, String version, String baseURL) throws MalformedURLException, InterruptedException {
	    	DesiredCapabilities capabilities = new DesiredCapabilities();
	    	capabilities.setBrowserName(browser);
	    	capabilities.setVersion(version);
	    	capabilities.setCapability("enableVNC", true);
		this.driver = new RemoteWebDriver(
	    	    URI.create("http://165.227.9.145:4444/wd/hub/").toURL(), 
	    	    capabilities
	    	);
		driver.get(baseURL);
	}
}
