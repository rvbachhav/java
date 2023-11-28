package java_Slips;

import java.util.Scanner;

class Customer{
    public String Name;
    public String PhoneNo;

    Customer(String Name , String PhoneNo){
        this.Name = Name;
        this.PhoneNo = PhoneNo;
    }
    public void DisplayCustomer(){
        System.out.println("Customer Name : " + Name);
        System.out.println("Customer Phone Number : " + PhoneNo);
    }
}

class Depositor extends Customer {
    public long accNo;
    public float balance;

    Depositor(String Name , String PhoneNo ,long accNo, float balance) {
        super(Name, PhoneNo);
        this.accNo = accNo;
        this.balance = balance;
    }
    public void DepositorDisplay(){
        super.DisplayCustomer();
        System.out.println("Account Number : " + accNo);
        System.out.println("Balance Number : " + balance);
    }
}

class borrower extends Depositor{
    int loanNo;
    int loanAmount;
    borrower(String Name , String PhoneNo ,  long accNo , float balance , int loanNo , int loanAmount){
        super(Name, PhoneNo , accNo , balance);
        this.loanNo = loanNo;
        this.loanAmount = loanAmount;
    }

    public void borrowDisplay(){
        super.DepositorDisplay();
        System.out.println("Loan Number : " + loanNo);
        System.out.println("Loan Amount : " + loanAmount);
        System.out.println();
        System.out.println("After Paying balance Remains amount ");
        System.out.println( balance + " - " + loanAmount +  " = " + (balance - loanAmount));
    }

}

public class slip17_q1 {
    public static void main(String[] args) {
        System.out.println("Enter the size for making data ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        borrower[] br = new borrower[n];
        for (int i = 0; i < n; i++){
            System.out.println("Enter Name of Customer");
            String name = sc.next();
            sc.nextLine();
            System.out.println("Enter phone number");
            String pno = sc.next();
            sc.nextLine();
            System.out.println("Enter Account Number");
            long ano = sc.nextLong();
            sc.nextLine();
            System.out.println("Enter balance ");
            float bal = sc.nextFloat();
            sc.nextLine();
            System.out.println("Enter Loan Number");
            int ln = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Loan amount");
            int lm = sc.nextInt();
            sc.nextLine();

            br[i] = new borrower(name , pno , ano , bal , ln , lm);
        }

        for(borrower BR : br){
            BR.borrowDisplay();
            System.out.println();
        }
    }
}
