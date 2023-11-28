package java_Slips;
import java.util.Scanner;

interface ProductMaker{

}

class Product implements ProductMaker{
    int pid;
    String pName;
    int Cost;
    int quantity;
    int total;

    Product(){
        pid = 0;
        pName ="";
        Cost = 0;
        quantity = 0;
        total=0;
    }

    Product(int id , String name , int cost , int quantities){
        this.pid = id;
        this.pName = name;
        this.Cost = cost;
        this.quantity = quantities;
    }

    public void Data(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("Your Data Here ");
        System.out.println("id -> " + pid);
        System.out.println("Name -> " + pName);
        System.out.println("cost -> " + Cost);
        System.out.println("quantity -> " + quantity);
        total = (Cost * quantity);
        System.out.println("Total Price are -> " + total);
        System.out.println("-------------------------------------------------------------");

    }
}

public class slip9_q2 {
    public static void main(String[] args) {
        int count=0;
        System.out.println("Enter the Size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Product[] product = new Product[n];
        for (int i = 0 ; i < n ; i++){
            System.out.println("Enter Id of the Products");
            int ID = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Name of the Products");
            String NAME = sc.next();
            sc.nextLine();
            System.out.println("Enter Cost of the Products");
            int COST = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter quantities of the Products");
            int QUANTITY = sc.nextInt();
            sc.nextLine();
            count++;
            product[i] = new Product(ID , NAME, COST , QUANTITY);
        }
        sc.close();
        for(Product p : product){
            p.Data();
        }
    }
}