package trelloApi;

import org.testng.Assert;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matchers;

public class getTrello {
	
	@Test
	public void getTest() {
	
		baseURI="https://trello.com/";
		
		given()
		.header("name","simran board403")
		.header("key","54d10187a3a9dd96e7ced68b12baac3a")
		.header("token","b5f76aa30d4f62b7e272d5e200718a21cc259d09d5549ec3716f379993609495").
		 get("b/wF2TV5UF/simran-board403").
		
		 then()
		 .statusCode(200);
		 //.log().all();
		 //.body("id", Matchers.equalTo("62d787bb6aa9597a591dd523"))
		 //.header("X-Envoy-Upstream-Service-Time", "187");
	}
	

}
