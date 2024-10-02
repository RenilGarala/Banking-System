package bank;

public class Account{
    private int accountNumber;
    private int balance;

    //Cunstructor to initial detail
    public Account(int accountNumber, int balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    //initialize balance
    public void setBalance(int balance){
        this.balance=balance;
    }

    //return account number
    public int getAccountNumber(){
        return accountNumber;
    }

    //return balance
    public int getBalance(){
        return balance;
    }
}