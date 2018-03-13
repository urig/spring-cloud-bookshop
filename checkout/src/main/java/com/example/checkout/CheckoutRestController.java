package com.example.checkout;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/checkout")
public class CheckoutRestController {

	private BillingClient billingClient;

	CheckoutRestController(BillingClient billingClient) {
		this.billingClient = billingClient;
	}

	@PutMapping("/book/{bookId}")
	public boolean buyBook(@PathVariable long bookId, @RequestBody CreditCard creditCard) {
		return billingClient.chargeCreditCard(creditCard);
	}
}
