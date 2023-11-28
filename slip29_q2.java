package java_Slips;

import java.util.Scanner;

class Vehicle{
    String Company;
    double price;

    public Vehicle(String cname , double price){
        this.Company = cname;
        this.price = price;
    }
    public String getCompany(){
        return Company;
    }
    public double getPrice(){
        return price;
    }
}

class LightMotorVehicle extends Vehicle{
    double mileage;
    public LightMotorVehicle(String name , double price , double mileage){
        super(name,price);
        this.mileage = mileage;
    }

    public double getMileage(){
        return mileage;
    }
}

class HeavyMotorVehicle extends Vehicle{
    double capacity_in_tons;
    public HeavyMotorVehicle(String name,double price,double capacity_in_tons){
        super(name,price);
        this.capacity_in_tons = capacity_in_tons;
    }

    public double getCapacity_in_tons(){
        return capacity_in_tons;
    }
}

public class slip29_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int n = sc.nextInt();
        Vehicle[] vehicle = new Vehicle[n];
        for(int i=0;i<n;i++){
            System.out.println("Select type A -> lightWeight and B -> highWeight");
            char type = sc.next().charAt(0);

            System.out.println("Enter Car Company Name");
            String name = sc.next();
            System.out.println("Enter Car price");
            double price = sc.nextDouble();

            if(type == 'A'){
                System.out.println("Enter Mileage");
                double milage = sc.nextDouble();
                vehicle[i] = new LightMotorVehicle(name , price , milage);
            } else if(type == 'B'){
                System.out.println("Enter Capacity");
                double Capacity = sc.nextDouble();
                vehicle[i] = new HeavyMotorVehicle(name , price , Capacity);
            } else{
                System.out.println("You have only A and B choice...");
                i--;
            }
        }


        for(Vehicle v: vehicle){
            if(v instanceof LightMotorVehicle){
                LightMotorVehicle lmv = (LightMotorVehicle) v;
                System.out.println("name of Company name -> " + lmv.getCompany());
                System.out.println("price -> " + lmv.getPrice());
                System.out.println("milage -> " + lmv.getMileage());
            }
            else if(v instanceof HeavyMotorVehicle){
                HeavyMotorVehicle hmv = (HeavyMotorVehicle) v;
                System.out.println("name of Company name -> " + hmv.getCompany());
                System.out.println("price -> " + hmv.getPrice());
                System.out.println("milage -> " + hmv.getCapacity_in_tons());
            }
            System.out.println("--------------------------------------------------------");
        }
        sc.close();
    }
}
