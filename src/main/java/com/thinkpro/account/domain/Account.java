package com.thinkpro.account.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "account")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1881725271238094470L;

	@Id
	private String accountNumber;
	private String accountType;
	private double amount;
	private String status;
	private Date createDate;
	private int customerNumber;

	/*
	 * @ManyToOne	 * 
	 * @JoinColumn(name="customer_number")	 
	 * @JsonBackReference
	 *  private Customer customer;
	 */

	public Account() {
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
