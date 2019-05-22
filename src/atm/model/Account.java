/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.model;

/**
 *
 * @author viniciusbeletella
 */
public class Account {
    
    private int id;
    private int accountNumber;
    private int pin;
    private String clientName;
    private Double balance;

    public Account(){
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + ", accountNumber=" + accountNumber + ", pin=" + pin + ", clientName=" + clientName + ", balance=" + balance + '}';
    }
    
    
    
}
