import java.awt.Color;

import java.awt.GridLayout;
import javax.swing.*;

class INFORFORMPROJECT {

public static void main(String[] args) {
    String[] selections = {"QUESTIONS", "COMMENTS", "IDEAS", "CONCERNS", "THOUGHTS","SOLUTIONS"};
    
    JComboBox comboX = new JComboBox(selections);
        
    JTextField QUESTION=new JTextField("CAN YOU WRITE THIS PROGRAM IN JAVA");
    
 
    JPanel panel = new JPanel(new GridLayout(14, 11,13,15));
    panel.setBorder(BorderFactory.createEmptyBorder(11,12,8,8));

    panel.add(comboX);
        
    panel.add(new JLabel("QUESTION:"));
    panel.setBorder(BorderFactory.createLineBorder(Color.RED));
    panel.add(QUESTION);
   
   int result = JOptionPane.showConfirmDialog(null, panel, "RUN",
        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
    if (result == JOptionPane.OK_OPTION) {
        System.out.println(comboX.getSelectedItem()
           
    } else {
        System.out.println("Operation Cancelled!?");
    }
}
}
    
