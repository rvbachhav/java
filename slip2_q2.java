package java_Slips;

import java.util.Arrays;
import java.util.Scanner;

class Cricket{
    String name;
    int no_of_innings;
    int no_of_notout;
    int totalRun;
    float bat_avg;

    public Cricket(String name , int noi , int nono , int totalRun ){
        this.name = name;
        this.no_of_innings = noi;
        this.no_of_notout = nono;
        this.totalRun = totalRun;

    }

    public double Cricket_bat_avg(){
        if (no_of_innings == 0){
            return 0.0;
        }
        else {
            return (double) totalRun / (no_of_innings - no_of_notout);
        }
    }

    public static void Cricketsort(Cricket[] cricket){
        Arrays.sort(cricket , (a,b) -> Double.compare(b.bat_avg , a.bat_avg));
    }

    @Override
    public String toString(){
        return "Name: " + name + "\n" +
                "Innings: " + no_of_innings + "\n" +
                "Times Not Out: " + no_of_notout + "\n" +
                "Total Runs: " + totalRun + "\n" +
                "Batting Average: " + bat_avg + "\n";
    }
}


public class slip2_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int n = sc.nextInt();
        Cricket[] c = new Cricket[n];
        for (int i=0;i<n;i++){
            System.out.println("Cricketer Player Name ");
            String Name = sc.next();
            System.out.println("innings");
            int inning = sc.nextInt();
            System.out.println("Not outs");
            int notout = sc.nextInt();
            System.out.println("total Runs");
            int run = sc.nextInt();
            c[i] = new Cricket(Name , inning , notout , run);


        }

        Cricket.Cricketsort(c);

        System.out.println("Sorted Data");
        for (Cricket crick: c){
            System.out.println(crick);
        }
    }
}
