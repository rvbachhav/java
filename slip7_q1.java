package java_Slips;
import java.util.Scanner;

public class slip7_q1 {
    Scanner sc = new Scanner(System.in);
    String name = "";
    int account_no;
    String a ="";
    int deposit;
    int with;

    int balance;

    public void get_details() {
        System.out.println("enter the cutomer name:");
        name = sc.nextLine();
        System.out.println("enter the slip7_q1 number:");
        account_no = sc.nextInt();
        System.out.println("enter the type of slip7_q1:");
        a=sc.next();
        System.out.println("enter the deposit money:");
        deposit = sc.nextInt();
        System.out.println("enter the Withdraw money:");
        with = sc.nextInt();

        balance = deposit - with;

    }

    public void show_details() {
        System.out.println("____________________________");
        System.out.println("customer name ->" + name);
        System.out.println("slip7_q1 number -> " + account_no);
        System.out.println("slip7_q1 type -> "+ a);
        System.out.println("deposit money -> "+deposit);
        System.out.println("withdraw money -> "+with);
        System.out.println("Available Balance -> " + balance);

    }


    public static void main(String[] args) {

        slip7_q1 obj = new slip7_q1();
        obj.get_details();
        obj.show_details();

    }
}