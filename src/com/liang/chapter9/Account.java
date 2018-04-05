package com.liang.chapter9;

import java.time.LocalDate;

public class Account {
	private int id;
	private double balance;
	private static double annualInterestRate;
	private LocalDate dateCreated=LocalDate.now();

	public Account() {
	}

	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return (annualInterestRate/12);
	}
	public double getMonthelyIntrest(){
		return ((balance * (annualInterestRate/100))/12);
	}
	public double Withdraw(double witamount){
		balance=balance-witamount;
		return balance;
	}
	public double Deposit(double depamount){
		balance=balance+depamount;
		return balance;
	}

}
