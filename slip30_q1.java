package java_Slips;

import java.util.*;


class Person {
    String PersonName;
    long AadharNumber;
    String PanNumber;

    Person(String Name , long AadharNo , String panNo){
        this.PersonName = Name;
        this.AadharNumber = AadharNo;
        this.PanNumber = panNo;
    }

    public void display(){
        System.out.println("Person Name " + PersonName);
        System.out.println("Aadhar Number " + AadharNumber);
        System.out.println("Pan card Number " + PanNumber);
    }

    public String toString(){
        return "Person Name "+PersonName +
                "Aadhar Number " + AadharNumber +
                "PanCard Number " + PanNumber;
    }
}

public class slip30_q1 {
    public static void main(String[] args) {
        Person[] person  = new Person[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Complete the following Details \n");
        for (int i = 0; i < 5; i++){
            System.out.println("Enter the Person Name ");
            String name = sc.next();
            System.out.println("Enter the Person Aadhar card Number");
            long Aadhar = sc.nextLong();
            System.out.println("Enter the Person Pan Card Number");
            String pan = sc.next();

            person[i] = new Person(name , Aadhar , pan);
        }

        sc.close();


        for(Person p : person){
//            p.display();
            System.out.println(p.toString());
        }
    }
}
