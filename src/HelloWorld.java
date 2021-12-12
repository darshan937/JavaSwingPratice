import javax.swing.*;

public class HelloWorld {
    public static void main(String[] args) {
        //decleration of elements
        JFrame frame;
        JLabel lable;

        frame = new JFrame(); //creating instance of JFrame
        lable = new JLabel("hello world");  //creating instance of JLabel

        lable.setBounds(130,100,100,40); //x-axis, y-axis, width, height
        frame.add(lable); //adding button on JFrame
        frame.setSize(400,500); //width, height
        frame.setLayout(null); //using no layout manager
        frame.setVisible(true); //making the frame visible




    }
}
