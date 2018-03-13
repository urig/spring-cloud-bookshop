package com.example.checkout;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("billing")
public interface BillingClient {

	@PutMapping(value = "/billing/creditCardCharge")
	public boolean chargeCreditCard(@RequestBody CreditCard creditCard);

}
