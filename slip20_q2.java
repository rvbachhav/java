package java_Slips;

import java_Slips.Operation.Arithmatic;
import java_Slips.Operation.Maximum;

public class slip20_q2 {
    public static void main(String[] args) {
        Arithmatic arth = new Arithmatic();
        Maximum maximums = new Maximum();

        float a = arth.addition(5,5);
        float b = arth.subtraction(5,5);
        System.out.println(a);
        System.out.println(b);

        int x = maximums.max(5,5);
        System.out.println(x);
    }
}
