package com.example.billing;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingRestController {

	@PutMapping("/creditCardCharge")
	public boolean chargeCreditCard(@RequestBody CreditCard creditCard) {
		return true;
	}
}
