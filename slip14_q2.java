package java_Slips;


import java_Slips.SY.SYMarks;
import java_Slips.TY.TYMarks;

import java.util.Scanner;

class Student{
    int roll;
    String name;
    public SYMarks syMarks;
    public TYMarks tyMarks;

    Student(int roll , String name , SYMarks syMarks , TYMarks tyMarks){
        this.roll = roll;
        this.name = name;
        this.syMarks = syMarks;
        this.tyMarks = tyMarks;
    }

    public void TotalMarks(){
        int Total = syMarks.ComputerTotal + tyMarks.theory;
        double TotalAverage = Total / 2f;

        System.out.println("Roll Number -> " + roll);
        System.out.println("Name -> " + name);
        System.out.println("Computer Marks " + Total);
        System.out.println("Average Marks -> " + avg(TotalAverage));
    }

    public char avg(double marks){
        if(marks >= 70){
            return 'A';
        } else if (marks >= 60) {
            return 'B';
        } else if (marks >= 50){
            return 'C';
        } else if (marks >= 40){
            return 'D';
        }else {
            return 'F';
        }
    }
}

public class slip14_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n for the size");
        int n = sc.nextInt();
        Student[] stud = new Student[n];
        for (int i = 0; i < n;i++){
            System.out.println("Enter Roll number ");
            int roll = sc.nextInt();
            System.out.println("Enter Name ");
            String name = sc.next();

            System.out.println("Enter total Computer Marks ");
            int computer = sc.nextInt();
            System.out.println("Enter Math marks ");
            int math = sc.nextInt();
            System.out.println("Electronics Marks ");
            int ele = sc.nextInt();
            SYMarks s = new SYMarks(computer , math , ele);

            System.out.println("Enter theory marks");
            int theory = sc.nextInt();
            System.out.println("Enter Practical marks");
            int practical = sc.nextInt();
            TYMarks t = new TYMarks(theory , practical);

            stud[i] = new Student(roll , name , s , t);
        }
        sc.close();
        for(Student student: stud){
            student.TotalMarks();
        }
    }
}
