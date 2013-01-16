package com.pfizer.model;

import java.io.*;

public class Bill implements Serializable{
	
	private String billId;
	
	private double totalBalance;
	
	private Doctor doctor;
	
	private PayAccount payAccount;

	public String getBillId() {
		return billId;
	}

	public void setBillId(String billId) {
		this.billId = billId;
	}

	public double getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(double total) {
		this.totalBalance = total;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public PayAccount getPayAccount() {
		return payAccount;
	}

	public void setPayAccount(PayAccount payAccount) {
		this.payAccount = payAccount;
	}

	

}
