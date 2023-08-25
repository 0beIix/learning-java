import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class jframe_gui {
    public static void main(String[] args){

        JLabel label = new JLabel();
        label.setText("This is text");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(Color.green);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setTitle("Payment distributer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.add(label);
    }
    
}
