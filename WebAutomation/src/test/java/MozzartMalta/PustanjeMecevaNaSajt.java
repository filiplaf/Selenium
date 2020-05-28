package MozzartMalta;

import static io.restassured.RestAssured.given;

import java.io.FileReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import resources.base;

public class PustanjeMecevaNaSajt extends base {
public static Logger log = LogManager.getLogger();

public static String mecevi;	

	@Test
	public static void iscitavanjeMecevaIzJson() {
	JSONParser jsonParser = new JSONParser();
	try {
	JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("C:\\Git workspace\\Selenium\\WebAutomation\\src\\main\\java\\resources\\meceviMalta.json"));
    mecevi = (String) jsonObject.get("idMeceva");
	log.info("Mecevi iz baze su " + mecevi);
}
	catch (Exception e) {
		log.info("Nema jos kreiranih meceva za kolo");
	}
	}	

	@Test
	public static void pustanjeMecevaNaSajt() {
		//Postavljamo default URI
		RestAssured.baseURI ="http://192.168.179.235:1337";
		String json = "{\r\n" + 
				"\"matchIds\": ["+mecevi+"],\r\n" + 
				"\"q\": \"new_betting_changes\"\r\n" + 
				"} ";
		
		 Response res = given().
					contentType(ContentType.JSON).
					body(json).
					when().
					post("/addToQueue").
					then().assertThat().statusCode(200). //cekiramo da li je status 200
					//Uzimamo response
					extract().response();
		 
		    //Response izdvajam kao string i ispisujem ga u konzolu kao JSON
			String responseString = res.asString();
			log.info(responseString);
		
	}
}