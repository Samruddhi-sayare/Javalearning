import javax.swing.*;
import java.awt.*;

public class Swing_add {
    public static void main(String[] args) {
        Add obj = new Add();
    }
}
class Add extends JFrame
{
    public Add(){
        JTextField t1 = new JTextField(20);
        JTextField t2 = new JTextField(20);
        JButton b = new JButton("OK");
        JLabel l = new JLabel("Result");



        add(t1);
        add(t2);
        add(b);
        add(l);

//        b.addActionListener(this);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
