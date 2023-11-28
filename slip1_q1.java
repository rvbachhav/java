package java_Slips;

public class slip1_q1 {
    public static void main(String [] args)
    {
        int num = Integer.parseInt(args[0]);
        int temp = 0;
        for(int i = 2; i <= num/2; i++){
           if(num %i == 0){
                System.out.println(num +" Is not prime");
                temp=1;
                break;
           }
        }
        if(temp == 0){
            System.out.println(num + " Is prime");
        }
    }
}