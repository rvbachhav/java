package java_Slips;

interface Cube{
    int calculateCube(int n);
}

public class slip10_q1 {
    public static void main(String[] args) {
        Cube c = n -> n*n*n;

        int number = 10;
        int ans = c.calculateCube(number);
        System.out.println("Value is " + number + " and Cube are " + ans);
    }
}
