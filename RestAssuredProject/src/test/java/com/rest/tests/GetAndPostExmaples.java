package com.rest.tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;


public class GetAndPostExmaples {

	@Test
	public void getTest() {
		baseURI="https://reqres.in/api";
		given().
		  get("/users?page=2").
		then().
		  statusCode(200).
		 body("data[4].first_name",equalTo("George") ).
		 body("data.first_name",hasItems("Michael","Rachel")).
		 log().all();
	}
	
	@Test
	public void postTest() {
		
		//create a body
	Map<String,Object> map= new HashMap<String,Object>();
//		
//		map.put("name", "Sweety");	
//		map.put("job", "tester");
//		
//		System.out.println(map);
		
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
		  post("/users").
		
		then().
		  statusCode(201).log().all();
	}
	
}
