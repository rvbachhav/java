package java_Slips;

public class slip23_q1 {

    private int Number;

    slip23_q1(){
        this.Number = 0;
    }
    slip23_q1 (int n){
        this.Number = n;
    }

    public boolean isNegative(){
        return Number < 0;
    }

    public boolean isPositive(){
        return Number > 0;
    }

    public boolean isZero(){
        return Number == 0;
    }

    public boolean isOdd(){
        return Number %2 != 0;
    }

    public boolean isEven(){
        return Number %2 == 0;
    }

    public static void main(String[] args) {
        if(args.length > 0){
            int no = Integer.parseInt(args[0]);
            slip23_q1 mn = new slip23_q1(no);
            System.out.println("Given Number is negative -> " + mn.isNegative());
            System.out.println("Given Number is positive -> " + mn.isPositive());
            System.out.println("Given Number is zero -> " + mn.isZero());
            System.out.println("Given Number is odd -> " + mn.isOdd());
            System.out.println("Given Number is even -> " + mn.isEven());
        }
    }
}
