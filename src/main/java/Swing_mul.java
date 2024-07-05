import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_mul {
    public static void main(String[] args) {
        Sub sc = new Sub();
    }

}
class Sub extends JFrame implements ActionListener
{
    JTextField a;
    JTextField b;
    JButton but;
    JLabel r;
    public Sub(){
      a = new JTextField(10);
      b = new JTextField(10);
      but = new JButton("OK");
      r = new JLabel("result");
     add(a);
     add(b);
     add(but);
     add(r);

     but.addActionListener(this);

     setLayout(new FlowLayout());
     setVisible(true);
     setSize(400,400);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 }

 public void actionPerformed(ActionEvent ae){
     int num1 = Integer.parseInt(a.getText());
     int num2 = Integer.parseInt(b.getText());
     int value = num1 - num2;
     r.setText(value + " ");
 }
}