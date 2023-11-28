package java_Slips;

import java.util.Scanner;

class Account{
    String custname;
    long accno;

    public Account(){
        this.custname = "null";
        this.accno = 0;
    }

    public Account(String custname , long accno){
        this.custname = custname;
        this.accno = accno;
    }

    public void display(){
        System.out.println("Customer Name -> " + custname);
        System.out.println("Account Number -> " + accno);
    }
}

class SavingAccount extends Account{
    int savingbal , minbal;
    public SavingAccount(String custname , long accno , int savingbal , int minbal){
        super(custname , accno);
        this.savingbal = savingbal;
        this.minbal = minbal;
    }
}

class AccountDetail extends SavingAccount{
    int dipositeAmount , withdrwalAmount;
    public AccountDetail(String custname , long accno , int savingbal , int minbal , int dipositeAmount , int withdrwalAmount){
        super(custname , accno , savingbal , minbal);
        this.dipositeAmount = dipositeAmount;
        this.withdrwalAmount = withdrwalAmount;
    }

    public void displayAll(){
        System.out.println("name -> "+custname);
        System.out.println("account No -> " + accno);
        System.out.println("Saving balance -> " + savingbal);
        System.out.println("min balance -> " + minbal);
        System.out.println("Deposit amount -> " + dipositeAmount);
        System.out.println("Withdrawal -> " + withdrwalAmount);
        System.out.println("new Deposit balance -> " + (minbal + dipositeAmount));
        System.out.println("Available balance -> " + (minbal - withdrwalAmount));
    }
}

public class slip15_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n for size");
        int n =sc.nextInt();

        AccountDetail[] AD = new AccountDetail[n];

        for(int i =0;i<n;i++){
            System.out.println("Enter the Customer name");
            String name=sc.next();
            System.out.println("Enter Account number");
            long accno = sc.nextLong();
            System.out.println("Enter saving balance ");
            int savbal = sc.nextInt();
            System.out.println("Enter min balance");
            int minbalance = sc.nextInt();
            System.out.println("deposite amount");
            int deposite = sc.nextInt();
            System.out.println("Enter withdrawal balance");
            int withbal = sc.nextInt();

            AD[i] = new AccountDetail(name, accno , savbal , minbalance , deposite , withbal);
        }

        for(AccountDetail account : AD){
            account.display();
            account.displayAll();
        }
    }
}
