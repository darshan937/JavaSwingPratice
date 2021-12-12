import javax.swing.*;

public class Hello_World {
    JFrame  frame;
    Hello_World(){
    frame = new JFrame();
    JLabel label = new JLabel("hello world");
    label.setBounds(120,100,100,40);
    frame.add(label);
    frame.setLayout(null);
    frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Hello_World();
    }
}