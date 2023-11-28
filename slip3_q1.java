package java_Slips;
import java.util.*;

public class slip3_q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        String[] cities = new String[n];
        System.out.println("Enter City names");
        for (int i = 0; i < n; i++){
            cities[i] = sc.nextLine();
        }
        System.out.println("Sorted City");
        Arrays.sort(cities);

        for(String c: cities){
            System.out.println(c);
        }
    }
}
