import javax.swing.*;
import java.awt.*;

public class third_method extends JFrame {
    JLabel labelHello;
    public third_method(){
        setTitle("Welcome");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400,150,600,400);
        setResizable(false);

        labelHello = new JLabel("third method");
        labelHello.setForeground(Color.black);
        labelHello.setFont(new Font("Arial",Font.BOLD,20));
        labelHello.setBounds(0,0,100,50);
        add(labelHello);

    }

    public static void main(String[] args) {
        new third_method().setVisible(true);

    }
}
