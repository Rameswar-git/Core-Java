package com.liang.chapter9;

public class AccountTest {

	public static void main(String[] args) {
           Account account=new Account(1122,20000);
           Account.setAnnualInterestRate(4.5);
           account.Withdraw(2500);
           account.Deposit(3000);
           
           System.out.println("Balance :: "+account.getBalance());
           System.out.println("Monthly Intrest Rate :: "+account.getMonthlyInterestRate());
           System.out.printf("Monthly Intrest :: %.2f\n ",account.getMonthelyIntrest());
           System.out.println("Account Creation Date :: "+account.getDateCreated());
	}

}
