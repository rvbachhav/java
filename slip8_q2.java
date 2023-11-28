package java_Slips;

import java.awt.*;
import java.awt.event.*;


public class slip8_q2 extends Frame {
    Label l1 , l2;
    TextField t1 , t2;
    int x,y;
    Panel p;

    slip8_q2(){
        setLayout(new FlowLayout());

        p = new Panel();
        p.setLayout(new GridLayout(2,2,5,5));

        t1 = new TextField(10);
        t1.setEditable(false);

        t2 = new TextField(10);
        t2.setEditable(false);

        l1 = new Label("Co-ordinate of Mouse Clicked");
        l2 = new Label("Co-ordinate of Mouse Motion");

        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        add(p);

        addMouseListener(new Moving());
        addMouseMotionListener(new Click());

        setSize(500,500);
        setVisible(true);

    }

    class Moving extends MouseAdapter{
        public void mouseClicked(MouseEvent me){
            x = me.getX();
            y = me.getY();
            t1.setText(" X -> " + x + " Y -> " + y);
        }
    }

    class Click extends MouseMotionAdapter{
        public void mouseMoved(MouseEvent mm){
            x = mm.getX();
            y = mm.getY();
            t2.setText(" X -> " + x + " Y -> " + y);
        }
    }

    public static void main(String[] args) {
        slip8_q2 s = new slip8_q2();
    }
}
