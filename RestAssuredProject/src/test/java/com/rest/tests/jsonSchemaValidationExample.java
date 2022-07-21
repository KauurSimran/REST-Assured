package com.rest.tests;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
//add this foe line 21
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import org.testng.annotations.Test;

public class jsonSchemaValidationExample {


	@Test
	public void schemaValidationTest() {
		baseURI="https://reqres.in/api";
		given().
		  get("/users?page=2").
		then().
		statusCode(200).and().body(matchesJsonSchemaInClasspath("schema.json"));
		 
	}
}
