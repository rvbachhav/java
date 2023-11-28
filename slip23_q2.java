package java_Slips;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;



class frames extends JFrame implements ActionListener{
    JFrame frame;
    JTextField t , t1 , t2 , t3;
    JLabel l1 , l2 , l3;
    JButton submit;

    public frames(){
//        frame = new JFrame("Currency Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,800);
        setLayout(null);

        JTextField ECl = new JTextField(30);
        ECl.setBounds(30 , 0,200,30);
        ECl.setText("Enter Amount");
        ECl.setEditable(false);

        t = new JTextField(30);
        t.setBounds(300 , 0,200,30);

        l1 = new JLabel("Singapore Dollars");
        l1.setBounds(30 , 50 , 200,30);
        l1.setBorder(BorderFactory.createLineBorder(Color.black , 2));

        l2 = new JLabel("USD");
        l2.setBounds(30 , 90 , 200,30);
        l2.setBorder(BorderFactory.createLineBorder(Color.black , 2));

        l3 = new JLabel("Euro");
        l3.setBounds(30 , 130 , 200,30);
        l3.setBorder(BorderFactory.createLineBorder(Color.black , 2));

        submit = new JButton("Submit");
        submit.setBounds(180,200,200,40);
        submit.setBorder(BorderFactory.createLineBorder(Color.black , 2));
        submit.setFocusable(false);
        submit.setForeground(Color.white);
        submit.setBackground(Color.black);

        t1 = new JTextField(30);
        t1.setBounds(300,50,200,30);
        t1.setBorder(BorderFactory.createLineBorder(Color.black , 2));
        t1.setEditable(false);

        t2 = new JTextField(30);
        t2.setBounds(300,90,200,30);
        t2.setBorder(BorderFactory.createLineBorder(Color.black , 2));
        t2.setEditable(false);

        t3 = new JTextField(30);
        t3.setBounds(300,130,200,30);
        t3.setBorder(BorderFactory.createLineBorder(Color.black , 2));
        t3.setEditable(false);

        add(ECl);
        add(t);
        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(t3);
        add(submit);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == submit){


            float mainIP = Float.parseFloat(t.getText());
            float sgd = (1.14f * mainIP);
            float usd = (0.92f * mainIP);
            float ero = (0.65f * mainIP);

        }
    }
}

public class slip23_q2 {
    public static void main(String[] args) {
        new frames();
    }
}
