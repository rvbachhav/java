package java_Slips;

import java.util.*;
abstract class order{
    int id;
    String Description;
}

class purchaseOrder extends order{
    String vendorName , customerName;
    public void accept(){
        System.out.println("Enter id \t Description \t vendor Name \t Customer Name \n");
        Scanner br = new Scanner(System.in);
        id = br.nextInt();
        Description = br.next();
        vendorName = br.next();
        customerName = br.next();
    }

    void display(){
        System.out.println("ID -> " + id);
        System.out.println("Description -> " + Description);
        System.out.println("Vendor Name -> " + vendorName);
        System.out.println("customer Name -> " + customerName);
    }
}

class salesOrder extends order{
    String vn , cn;
    public void accept() {
        Scanner br = new Scanner(System.in);
        System.out.println("Enter id \t Description \t vendor Name \t Customer Name \n");
        id = br.nextInt();
        Description = br.next();
        vn = br.next();
        cn = br.next();
    }

    void display(){
        System.out.println("ID -> " + id);
        System.out.println("Description -> " + Description);
        System.out.println("Vendor Name -> " + vn);
        System.out.println("customer Name -> " + cn);
    }
}



public class slip6_q2 {

    public static void main(String[] args) {
        Scanner br = new Scanner(System.in);
        System.out.println("1 -> purchaseOrder");
        System.out.println("2 -> salesOrder");
        int choice = br.nextInt();
        switch (choice){
            case 1:
                System.out.println("How many Purchase Orders");
                int n = br.nextInt();
                purchaseOrder[] po = new purchaseOrder[n];
                for(int i = 0; i < n; i++){
                    po[i] = new purchaseOrder();
                    po[i].accept();
                }
                for(int i = 0; i < n; i++){
                    po[i].display();
                }
                System.out.println("Object is Created \n");
                break;

            case 2:
                System.out.println("How Many Sales Order have");
                int m = br.nextInt();
                salesOrder[] so = new salesOrder[m];

                for(int i = 0; i < m; i++){
                    so[i].accept();
                }
                for(int i = 0; i < m; i++){
                    so[i].display();
                }
                System.out.println("Object is Created \n");
                break;
            default:
                System.out.println("Opps ! Something Went wrong \n");
        }
    }

}
