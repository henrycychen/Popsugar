package henry.popsugar.com.popsugar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class BaseRestTest {

	private static final ContentType JSON = null;

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws UnirestException {		
// This doesn't work. Returns 403 "https://popsugar.dev4.onsugar.com/api"	
//		System.out.println(RestAssured.get("https://popsugar.dev4.onsugar.com/api2").getContentType());
//		System.out.println(RestAssured.get("https://popsugar.dev4.onsugar.com/api2").getSessionId());
//		System.out.println(RestAssured.get("https://popsugar.dev4.onsugar.com/api2").getStatusCode());
//		System.out.println(RestAssured.get("https://popsugar.dev4.onsugar.com/api2").getStatusLine());
//		System.out.println(RestAssured.get("https://popsugar.dev4.onsugar.com/api2").getTime());
//		System.out.println(RestAssured.get("https://popsugar.dev4.onsugar.com/api2").getBody());
//		System.out.println(RestAssured.get("https://popsugar.dev4.onsugar.com/api2").getDetailedCookies());
//		System.out.println(RestAssured.get("https://popsugar.dev4.onsugar.com/api2").getHeaders());
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

// This works. Returns 200 "https://api.github.com/users/henrycychen"
//		System.out.println(RestAssured.get("https://api.github.com/users/henrycychen").getContentType());
//		System.out.println(RestAssured.get("https://api.github.com/users/henrycychen").getSessionId());
//		System.out.println(RestAssured.get("https://api.github.com/users/henrycychen").getStatusCode());
//		System.out.println(RestAssured.get("https://api.github.com/users/henrycychen").getStatusLine());
//		System.out.println(RestAssured.get("https://api.github.com/users/henrycychen").getTime());
//		System.out.println(RestAssured.get("https://api.github.com/users/henrycychen").getBody());
//		System.out.println(RestAssured.get("https://api.github.com/users/henrycychen").getDetailedCookies());
//		System.out.println(RestAssured.get("https://api.github.com/users/henrycychen").getHeaders());
//		
//		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//		
		System.out.println(
				given().
					header("cache-control", "no-cache").
					header("postman-token", "f9b40168-14fb-e2cb-eee5-989f9215d87c").
				when().
					get("https://popsugar.dev4.onsugar.com/api2").
				then().
					contentType(ContentType.HTML).statusCode(200));		
	}
}
