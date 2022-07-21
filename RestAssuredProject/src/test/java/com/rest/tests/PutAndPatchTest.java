package com.rest.tests;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutAndPatchTest {

	@Test
	public void putTest() {
		
		//create a body
	Map<String,Object> map= new HashMap<String,Object>();

		// add json libraries------json simple in pom.xml file
		JSONObject request=new JSONObject(map);
		
		request.put("name", "Sweety");
		request.put("job", "tester");
		System.out.println(request.toString());
		
		baseURI="https://reqres.in/api";
		given().
		//header
		  header("Content-Type","application/json").
		  contentType(ContentType.JSON).  
		  accept(ContentType.JSON).
		  body(request.toJSONString()).
		
		when().
		  put("/users/2").
		
		then().
		  statusCode(200).log().all();
	}
	
    
	@Test
	public void patchTest() {
		
		//create a body
	Map<String,Object> map= new HashMap<String,Object>();

		// add json libraries------json simple in pom.xml file
		JSONObject request=new JSONObject(map);
		
		request.put("name", "Sweety");
		request.put("job", "tester");
		System.out.println(request.toString());
		
		baseURI="https://reqres.in";
		given().
		//header
		  header("Content-Type","application/json").
		  contentType(ContentType.JSON).  
		  accept(ContentType.JSON).
		  body(request.toJSONString()).
		
		when().
		  patch("/api/users/2").
		
		then().
		  statusCode(200).log().all();
	}
	
	
}
