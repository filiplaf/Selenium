package MozzartGermania;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import java.io.FileWriter;
import java.io.IOException;
import org.testng.annotations.Test;
import com.github.tomakehurst.wiremock.common.Json;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.minidev.json.JSONObject;

public class ProveraOmega {

	public static Float casinoTotal;
	
	@Test
    public static void casinoBalance() throws IOException, InterruptedException {
		Login login = new Login();
		//Postavljamo default URI
		RestAssured.baseURI ="http://t-api.germaniasport.hr";
		//Izdvojen string koji poziva body, saljemo password i username za igraca za koga hocemo da dobijemo userID i sessionID
		String username = login.username;
		String password = login.password;
	    String userAndPassword = "{\r\n" + 
	    		"  \"password\": \"%s\",\r\n" + 
	    		"  \"userOrigin\": \"WEB\",\r\n" + 
	    		"  \"dontCreateOmegaSession\": \"false\",\r\n" + 
	    		"  \"username\": \""+username+"\"\r\n" + 
	    		"}";
		String kredencijali = String.format(userAndPassword,password);
		
	    Response res = given().
				contentType(ContentType.JSON).
				body(kredencijali).
				when().
				post("/MozzartWS-HR/external.json/session-create").
				then().assertThat().statusCode(200).and().contentType(ContentType.JSON). //cekiramo da li je status 200 i da li se vraca JSON
				body("status",equalTo("OK")).
				//Uzimamo response
				extract().response();
		
	    //Response izdvajam kao string i ispisujem ga u konzolu kao JSON
		String responseString = res.asString();
		System.out.println(Json.prettyPrint(responseString));
		
		//Iz response-a izdvajam userID i sessionID
		JsonPath js = new JsonPath(responseString);
		Integer userId = js.get("userId");
		String sessionId = js.get("sessionId");
		//System.out.println(userId);
		//System.out.println(sessionId);
		
		//JSONObject klasa kreira json objekte i pomocu put smestamo podatke u json objekte
		JSONObject obj = new JSONObject();
		obj.put("sessionId", sessionId);
		obj.put("userId", userId);
		
		//Drugi string u koji upisujemo userID i sessionID dobijen iz predhodne post metode(userID je upisan direktno u string a session ID uz pomoc %s
		String userAndSession = "{\r\n" + 
		"  \"extendSession\": \"false\",\r\n" + 
		"  \"languageId\": \"1\",\r\n" + 
		"  \"dontFetchOmegaBalance\": \"false\",\r\n" + 
		"  \"userId\": \""+userId+"\",\r\n" + 
		"  \"sessionId\": \"%s\",\r\n" + 
		"  \"shouldReloadOmegaBonuses\": \"true\"\r\n" + 
		"}";
		
		//Umesto %s postavlja se sessionId
		String session = sessionId;
		String result = String.format(userAndSession, session);
	
	    Response resp = given().
				contentType(ContentType.JSON).
				body(result).
				when().
				post("/MozzartWS-HR/external.json/webuser-balance").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
		body("status",equalTo("OK")).
		extract().response();

	  //Response izdvajam kao string i ispisujem ga u konzolu kao JSON
		String responseString1 = resp.asString();
		System.out.println(Json.prettyPrint(responseString1));
		

	  //Iz JSON izdvajam casinoTotal i ispisujem ga u konzolu i JSON file
		JsonPath jsp = new JsonPath(responseString1);
		casinoTotal = jsp.get("casinoTotal");
		obj.put("casinoTotal", casinoTotal);
		try(FileWriter file = new FileWriter("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\kazinoBalansGermania.json")) 
		{
			file.write(obj.toJSONString());
			file.flush();
			file.close();
		}
		}
	
}