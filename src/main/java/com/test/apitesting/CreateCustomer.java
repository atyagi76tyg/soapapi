package com.test.apitesting;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.response.Response;
import pojo.CreateCustomer2;

public class CreateCustomer 
{
	
	@Test
	public void createCustomer() throws JsonParseException, JsonMappingException, IOException {
		
		Response response = given().auth().
		basic("sk_test_XCVYW01V65vzfERRcXexvNtX", "").
		formParam("email", "abc123@gmail.com").
		formParam("description", "created by API")
		.when().
		post("https://api.stripe.com/v1/customers").
		then().extract().response();
		System.out.println(response.statusCode());
		System.out.println(response.asString());
		
		byte[] jasonData  = response.asByteArray();
				
		ObjectMapper mapper = new ObjectMapper();
		
		CreateCustomer2 obj = mapper.
				readValue(jasonData,CreateCustomer2.class);
		System.out.println(obj.getEmail());
		System.out.println(obj.getSources().getUrl());
		Assert.assertEquals("abc123@gmail.com", obj.getEmail());

		
	}

}
