
package com.company.restfulwebservices.payment;

import java.util.Date;

import io.swagger.annotations.ApiModel;

@ApiModel(description="All details about the Account. ")
public class PaymentData {

	private Integer id;
	private Integer fromAccount;
	private Integer toAccount;
	private Double amount;
	private String currencyType;
	private String bicCode;
	private Date transactionDate;
	
	protected PaymentData() {
		
	}

	public PaymentData(Integer id, Integer fromAccount, Integer toAccount, Double amount, String currencyType, String bicCode, Date transactionDate) {
		super();
		this.id = id;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.amount = amount;
		this.currencyType = currencyType;
		this.bicCode = bicCode;
		this.transactionDate = transactionDate;
	}


	@Override
	public String toString() {
		return String.format("PaymentData [id = %s, fromAccount=%s, toAccount=%s, amount=%s, currencyType=%s, bicCode=%s, transactionDate=%s]", fromAccount, toAccount, amount, currencyType, bicCode, transactionDate);
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(Integer fromAccount) {
		this.fromAccount = fromAccount;
	}

	public Integer getToAccount() {
		return toAccount;
	}

	public void setToAccount(Integer toAccount) {
		this.toAccount = toAccount;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	public String getBicCode() {
		return bicCode;
	}

	public void setBicCode(String bicCode) {
		this.bicCode = bicCode;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}


}
