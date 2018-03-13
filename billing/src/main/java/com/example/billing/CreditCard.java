package com.example.billing;

public class CreditCard {
	private String nameOnCard;
	private int number;
	private int expiryMonth;
	private int expiryYear;
	private int ccv;
	
	public CreditCard() {}
	
	public CreditCard(String nameOnCard, int number, int expiryMonth, int expiryYear, int ccv) {
		super();
		this.nameOnCard = nameOnCard;
		this.number = number;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.ccv = ccv;
	}
	
	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	public int getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}
	public int getCcv() {
		return ccv;
	}
	public void setCcv(int ccv) {
		this.ccv = ccv;
	}
}
