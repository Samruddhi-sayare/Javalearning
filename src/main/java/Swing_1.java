import javax.swing.*;
import java.awt.*;

public class Swing_1
{
    public static void main(String[] args)
    {
        Abc obj = new Abc();

    }
}
class Abc extends JFrame
{
public Abc()
{
    setLayout(new FlowLayout());
    JLabel a = new JLabel("hello world");
    JLabel b = new JLabel("I am Samruddhi sayare");
    add(b);
    add(a);
    setVisible(true);
    setSize(400 , 400);
}
}
