package java_Slips;
import java.util.Scanner;

abstract class staff {
    protected int id;
    protected String name;

    staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract void display();
}

class subclass extends staff {

    String department;

    public subclass(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    @Override
    public void display() {
        System.out.println("Id is : " + id);
        System.out.println("Name is : " + name);
        System.out.println("Department is : " + department);
    }
}

public class slip1_q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n element");
        int n = sc.nextInt();
        subclass[] s = new subclass[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter ID of the Employees ");
            int id = sc.nextInt();
            System.out.println("Enter Name");
            String name = sc.next();
            System.out.println("Enter Name of the department ");
            String Department = sc.next();

            s[i] = new subclass(id,name,Department);
        }

        for (int i = 0; i < n; i++) {
            System.out.println();
            s[i].display();
            System.out.println();
        }
    }
}
