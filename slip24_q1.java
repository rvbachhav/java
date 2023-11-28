package java_Slips;

abstract class Bank{
    abstract int getBalance();
}

class BankA extends Bank{
    int balance = 100;
    int getBalance(){
        return balance;
    }
}

class BankB extends Bank{
    int balance = 150;
    int getBalance(){
        return balance;
    }
}

class BankC extends Bank{
    int balance = 200;
    int getBalance(){
        return balance;
    }
}

public class slip24_q1 {
    public static void main(String[] args) {
        BankA a = new BankA();
        System.out.println(a.getBalance());
        BankB b = new BankB();
        System.out.println(b.getBalance());
        BankC c = new BankC();
        System.out.println(c.getBalance());
    }
}
