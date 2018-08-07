package com.zycus.pojo.accounts;

import java.util.List;
import com.zycus.pojo.cards.Card;

public class Account {
	private long primaryKey;
	private long accountNumber;
	private String holderName;
	private String accountType;
	private double amount;
	private long openingDate;
	private List <Card> connectedCards;
	
	public Account() {
		super();
	}

	public Account(long primaryKey, long accountNumber, String holderName, String accountType, double amount,
			long openingDate, List<Card> connectedCards) {
		super();
		this.primaryKey = primaryKey;
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.accountType = accountType;
		this.amount = amount;
		this.openingDate = openingDate;
		this.connectedCards = connectedCards;
	}

	public long getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(long primaryKey) {
		this.primaryKey = primaryKey;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public long getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(long openingDate) {
		this.openingDate = openingDate;
	}

	public List<Card> getConnectedCards() {
		return connectedCards;
	}

	public void setConnectedCards(List<Card> connectedCards) {
		this.connectedCards = connectedCards;
	}
}
