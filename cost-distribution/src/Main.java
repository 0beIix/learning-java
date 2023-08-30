package src;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) {

        String appTitle = "Cost Distribution Calculator";
        
        JFrame mainFrame = new JFrame();
        mainFrame.setSize(500, 500);
        mainFrame.getContentPane().setBackground(Color.BLACK);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setTitle("Title of Frame");
    

        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(Color.darkGray);
        titlePanel.setPreferredSize(new Dimension(100, 100));
        titlePanel.setLayout(new BorderLayout());


        JLabel title = new JLabel();
        title.setText(appTitle);    
        title.setFont(new Font("Comic Sans",Font.BOLD,30));
        title.setForeground(Color.white);
        title.setVerticalAlignment(JLabel.CENTER);
        title.setHorizontalAlignment(JLabel.CENTER);


        mainFrame.add(titlePanel,BorderLayout.NORTH);
        titlePanel.add(title);
        mainFrame.setVisible(true);

    }
}
