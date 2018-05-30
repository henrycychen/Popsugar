package henry.popsugar.com.popsugar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class BaseRestTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		BaseRestPage MH = new BaseRestPage();
		Response MHGet = RestAssured.given().when().get(MH.MHBaseURL+"");
		System.out.println(MHGet.getStatusCode());
		System.out.println(MHGet.getContentType());
		System.out.println(MHGet.getSessionId());
		System.out.println(MHGet.getStatusLine());
		System.out.println(MHGet.getTime());
		System.out.println(MHGet.getDetailedCookies());
		System.out.println(MHGet.getHeaders());
		System.out.println(MHGet.getHeaders());
		
		if(MHGet.getStatusCode() == 200) {
			System.out.println("Popsugar Musthave page returned 200");
		}
		
//		ResponseBody body = MHGet.getBody();
//		System.out.println("Response Body is: " + body.asString());
	}

}
