package java_Slips;

public class slip2_q1 {
    public static void main(String[] args) {
        String firstName = args[0];
        String lastName = args[1];
        double weight = Double.parseDouble(args[2]);
        double height = Double.parseDouble(args[3]);
        double BMI = weight / (height * height);
        System.out.println("First Name ->" + firstName + "\t Last Name ->" + lastName + "\t BMI ->" + BMI);
    }
}
