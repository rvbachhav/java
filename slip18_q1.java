package java_Slips;
import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class slip18_q1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout");
        frame.setSize(500,500);


        JPanel pane = new JPanel();

        JButton nbt = new JButton("North");
        JButton ebt = new JButton("East");
        JButton wbt = new JButton("west");
        JButton sbt = new JButton("south");

        pane.setLayout(new BorderLayout());

        pane.add(nbt , BorderLayout.NORTH);
        pane.add(ebt , BorderLayout.EAST);
        pane.add(wbt , BorderLayout.WEST);
        pane.add(sbt , BorderLayout.SOUTH);

        frame.add(pane);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
