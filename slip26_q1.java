package java_Slips;

import java.util.Scanner;

class Item{
    int item_number;
    String item_name;
    int item_price;

    Item(){
        this.item_number= 10;
        this.item_name = "Laptop";
        this.item_price = 50000;
    }

    Item(int no , String name , int price){
        this.item_number = no;
        this.item_name = name;
        this.item_price = price;
    }

    public void display(){
        System.out.println("---------------------------------------");
        System.out.println("Item Number -> " + item_number);
        System.out.println("Item Name -> " + item_name);
        System.out.println("Item Price -> " + item_price);
        System.out.println("---------------------------------------");
    }

}

public class slip26_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size for Item Data include");
        int count=0;
        int n = sc.nextInt();
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++){
            System.out.println("Enter Item Number ");
            int nos = sc.nextInt();
            System.out.println("Enter Item Name ");
            String names = sc.next();
            System.out.println("Enter Item Prices");
            int price = sc.nextInt();

            items[i] = new Item(nos , names , price);
            count++;
            System.out.println("---------------------------------------");
            System.out.println("Total Product counts --> " + count);
            System.out.println("---------------------------------------");
        }

        for (Item it : items){
            it.display();
        }
    }
}
