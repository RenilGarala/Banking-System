package customer;
import bank.Account;

public class Customer extends Account{
    private String customerName;

    //contructor to initial bank detail
    public Customer (String customerName, int accountNumber , int initailDeposit){
        super(accountNumber, initailDeposit);
        this.customerName=customerName;
    }

    //Method to deposit Amount
    public void deposit(int depositAmount){
        if(depositAmount>0){
            setBalance(getBalance()+depositAmount);
            System.out.println("Deposite Successfully. New Balance is "+ getBalance()+"\n");
        }
        else{
            System.out.println("Deposite Amount is Lessthen 0 so you can not deposite"+"\n");
        }
    }

    //Method to withdrow amount
    public void withdrow(int withdrowAmount){
        if(getBalance() < withdrowAmount){
            System.out.println("Your Withdrow Amount is Greater then Bank balance - balance is "+getBalance()+"\n");
        }
        else{
            setBalance(getBalance() - withdrowAmount);
            System.out.println("Withdrow Successfully. New Balance is "+ getBalance()+"\n");
        }
    }

    //method to check bank balance
    public void checkBalance(){
        System.out.println("Your Balance is "+ getBalance()+"\n");
    }

    //method to get account detail
    public void getAccountDetail(){
        System.out.println("Account Number is "+ getAccountNumber());
        System.out.println("Account Name is "+ customerName);
        System.out.println("Account Balance is "+ getBalance()+"\n");
    }
}