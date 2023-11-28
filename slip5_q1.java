package java_Slips;

import java.util.Scanner;

class Country{
    String countryName;
    public Country(String country){
        this.countryName = country;
    }

    public void display(){
        System.out.println("Country Name -> " + countryName);
    }
}

class continent{
    String continentName;
    public continent(String continent){
        this.continentName = continent;
    }

    public void display(){
        System.out.println("Continent Name -> " + continentName);
    }
}

class state{
    String stateName;

    public state(String states){
        this.stateName = states;
    }

    public void display(){
        System.out.println("State Name -> " + stateName);
    }
}

public class slip5_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter country Name");
        String cname = sc.next();

        System.out.println("Enter continent Name");
        String ccname = sc.next();

        System.out.println("Enter state Name");
        String sname = sc.next();

        Country c = new Country(cname);
        continent cc = new continent(ccname);
        state s = new state(sname);

        c.display();
        cc.display();
        s.display();
    }
}
