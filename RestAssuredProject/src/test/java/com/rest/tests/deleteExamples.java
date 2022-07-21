package com.rest.tests;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class deleteExamples {
	
	@Test
	public void patchTest() {
		
		baseURI="https://reqres.in";
	  when().
		  delete("/api/users/2").
		
		then().
		  statusCode(204).log().all();
	}
	
	

}
