package com.zycus.pojo.cards;

public class Card {
	private long primaryKey;
	private long cardNumber;
	private double maximumLimit;
	private long expiryDate;
	private long accountNumber;
	
	public Card() {
		super();
	}

	public Card(long primaryKey, long cardNumber, double maximumLimit, long expiryDate, long accountNumber) {
		super();
		this.primaryKey = primaryKey;
		this.cardNumber = cardNumber;
		this.maximumLimit = maximumLimit;
		this.expiryDate = expiryDate;
		this.accountNumber = accountNumber;
	}

	public long getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(long primaryKey) {
		this.primaryKey = primaryKey;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public double getMaximumLimit() {
		return maximumLimit;
	}

	public void setMaximumLimit(double maximumLimit) {
		this.maximumLimit = maximumLimit;
	}

	public long getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(long expiryDate) {
		this.expiryDate = expiryDate;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
}
