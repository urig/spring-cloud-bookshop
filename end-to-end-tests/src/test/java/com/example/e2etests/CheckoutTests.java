package com.example.e2etests;

import static org.junit.Assert.*;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import io.restassured.http.ContentType;

public class CheckoutTests {

	@Test
	public void testCheckout() {
		given()
			.body("{" + 
					"	\"nameOnCard\":\"Uri\"," + 
					"	\"number\": 12345678," + 
					"	\"expiryMonth\": 12," + 
					"	\"expiryYear\": 2008," + 
					"	\"ccv\": 100" + 
					"}")
			.contentType("application/json").
		when()
			.put("http://localhost:8090/checkout/book/1").
		then()
			.statusCode(200)
			.and().body(is("true"));
	}

}
