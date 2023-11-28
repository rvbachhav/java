package java_Slips;
import java.util.*;

class CricketPlayer{
    String name;
    int noofinn;
    int noofnotout;
    int totalrun;
    double bat_avg;

    public CricketPlayer(String name , int noofinn , int noofnotout , int totalrun){
        this.name = name;
        this.noofinn = noofinn;
        this.noofnotout = noofnotout;
        this.totalrun = totalrun;
        this.bat_avg = calculate_avg();
    }

    public double calculate_avg(){
        if(totalrun == 0){
            return 0.0;
        }
        return (double) totalrun / (noofinn - noofnotout);
    }

    public static void sorting(CricketPlayer[] cricketPlayers){
        Arrays.sort(cricketPlayers , (p1,p2) -> Double.compare(p2.bat_avg , p1.bat_avg));
    }

    public String toString(){
        return String.format("Name->%s \t inning->%d \t not out->%d \t Total runs->%d \t Batting average->%.2f",
                name,noofinn,noofnotout,totalrun,bat_avg);
    }
}

public class slip18_q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n = sc.nextInt();
        CricketPlayer[] cp = new CricketPlayer[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter Name of cricketer ");
            String name = sc.next();
            System.out.println("Enter inning ");
            int inning = sc.nextInt();
            System.out.println("not out");
            int notout = sc.nextInt();
            System.out.println("Total runs");
            int totalrun = sc.nextInt();
            cp[i] = new CricketPlayer(name,inning, notout,totalrun);
        }
        CricketPlayer.sorting(cp);

        for(CricketPlayer c: cp){
            System.out.println(c);
        }
    }
}
