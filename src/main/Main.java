package main;
import java.util.Scanner;
import customer.Customer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //create account from user
        System.out.println("\"Frist you need to create bank account\"");

        System.out.print("Enter Name : ");
        String name= sc.next();

        System.out.print("Enter account number : ");
        int accountNumber= sc.nextInt();

        System.out.print("Enter Initial Amount to Deposit : ");
        int initialdeposit = sc.nextInt();

        //crate account according user input
        Customer c1 = new Customer(name, accountNumber, initialdeposit);

        int contoller=1;
        while(contoller==1){
            System.out.println("1 for Deposit Account");
            System.out.println("2 for Withdrow Amount");
            System.out.println("3 for Check Balance");
            System.out.println("4 for Check Account Detail");
            System.out.println("5 for Exit");
            int process = sc.nextInt();
            switch(process){
                case 1:
                    System.out.print("Enter Amount for Deposite : ");
                    int depositeAmount = sc.nextInt();
                    c1.deposit(depositeAmount);
                    break;
                case 2:
                    System.out.print("Enter Amount for Withdrow : ");
                    int withdrowAmount = sc.nextInt();
                    c1.withdrow(withdrowAmount);
                    break;
                case 3:
                    c1.checkBalance();
                    break;
                case 4:
                    c1.getAccountDetail();
                    break;
                case 5:
                    System.out.println("Thank you For Using Banking System");
                    contoller=0;
                    break;
                default:
                    System.out.println("Please Enter value Between 1 to 5");
            }
        }
    }
}