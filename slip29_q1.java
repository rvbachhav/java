package java_Slips;

import java.util.Scanner;

class Customers{
    int CustomerNumber;
    String CustomerName;
    long ContactNumber;
    String Address;

    public Customers(int Number , String Name , long PhoneNumber , String address ){
        this.CustomerNumber = Number;
        this.CustomerName = Name;
        this.ContactNumber = PhoneNumber;
        this.Address = address;
    }

    public void Search(long CustomerPhoneNumber){
        if(CustomerPhoneNumber == ContactNumber){
            System.out.println("Customer ID " + this.CustomerNumber);
            System.out.println("Customer Name " + this.CustomerName);
            System.out.println("Customer Phone number " + this.ContactNumber);
            System.out.println("Customer Address " + this.Address);
        }

    }

}

public class slip29_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n for size ");
        int n = sc.nextInt();
        Customers[] c = new Customers[n];
        for (int i = 0 ; i < n; i++){
            System.out.println("Enter Customer ID");
            int cid = sc.nextInt();
            System.out.println("Enter Name of Customer");
            String cName = sc.next();
            System.out.println("Enter Phone Number of Customer");
            long phone = sc.nextLong();
            System.out.println("Enter Address");
            String add = sc.next();

            c[i] = new Customers(cid, cName , phone , add);
        }

        System.out.println("Enter Contact name for Search name");
        long CustomerPhoneNumber = sc.nextLong();

        for (Customers cd : c){
            cd.Search(CustomerPhoneNumber);
        }
    }
}
