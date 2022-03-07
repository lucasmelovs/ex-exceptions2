package model.entities;

import model.exception.DomainException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
	}
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}


	public void withdraw(Double amount) {
		if(balance == 0) {
			throw new DomainException("There is not balance");
		}else if(amount > withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}else {
			balance -= amount;
		}
		
	}

	@Override
	public String toString() {
		return "Account [number=" 
				+ number 
				+ ", holder="
				+ holder 
				+ ", balance=" 
				+ balance 
				+ ", withdrawLimit="
				+ withdrawLimit + "]";
	}
		
	
	
}
