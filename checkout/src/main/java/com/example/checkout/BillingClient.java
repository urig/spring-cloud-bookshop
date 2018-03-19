package com.example.checkout;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="billing", url="http://localhost:8100/billing")
public interface BillingClient {

	@PutMapping(value = "creditCardCharge")
	public boolean chargeCreditCard(@RequestBody CreditCard creditCard);

}
