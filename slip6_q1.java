package java_Slips;

import java.util.Scanner;

//(Empid, Empname, Empdesignation, Empsal)
class EmpDetails{
    int Empid;
    String Empname , Empdestignation;
    double Empsal;

    EmpDetails(int Empid , String Empname , String Empdestignation , double Empsal){
        this.Empid = Empid;
        this.Empname = Empname;
        this.Empdestignation = Empdestignation;
        this.Empsal = Empsal;
    }

    @Override
    public String toString(){
        return " EmpId " + Empid +
                " EmpName " + Empname +
                " EmpDesignation " + Empdestignation +
                " Empsalary " + Empsal;
    }
}

public class slip6_q1 {
    public static void main(String[] args) {
        System.out.println("Enter n size ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        EmpDetails[] e = new EmpDetails[n];
        for (int i = 0; i < n; i++){

            System.out.println("Enter Id ");
            int Id = sc.nextInt();

            System.out.println("Enter Name ");
            String name = sc.next();

            System.out.println("Enter Designation ");
            String designation = sc.next();

            System.out.println("Enter Salary ");
            double salary = sc.nextDouble();

            e[i] = new EmpDetails(Id , name , designation , salary);
        }
        for(EmpDetails employees: e){
            System.out.println(employees.toString());
        }
    }
}
