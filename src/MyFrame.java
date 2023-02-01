import javax.swing.*;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame {
    JButton myButton = new JButton("MY BUTTON");
    JButton myButton1 = new JButton("MY BUTTON");
    public MyFrame(){
        myButton.setBounds(100,100,100,100);
        myButton1.setBounds(100,200,100,100);
        myButton.addActionListener(
             (e) -> {System.out.println("YOu clicked a button!");});
        myButton1.addActionListener(
             (e) -> {System.out.println("YOu clicked a button!");});
        this.add(myButton);
        this.add(myButton1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(null);
        this.setVisible(true);
    }
}
