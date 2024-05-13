import java.awt.*;
import javax.swing.*;

public class GUIFrame extends JFrame {
   static void guiFrame(){
    JFrame gradingFrame = new JFrame("GRADING SYSTEM");

    gradingFrame.setVisible(true);
    gradingFrame.setSize(400,600);
    gradingFrame.setLocationRelativeTo(null); //Centering
    gradingFrame.setLayout(new GridLayout(15, 2));
    gradingFrame.setDefaultCloseOperation(3); //JFrame.EXIT_ON_CLOSE

    JLabel fNameLabel = new JLabel("First Name: ");
    JTextField fNameTxtField = new JTextField();

    JLabel lNameLabel = new JLabel("Last Name: ");
    JTextField lNameTxtField = new JTextField();

    JLabel marksInputLabel = new JLabel("Marks: ");
    JTextField marksTxtField = new JTextField();

    JLabel fullNameLabel = new JLabel("****  ****");
    JLabel marksLabel = new JLabel("**");
    JLabel gradeLabel = new JLabel("%");

    JButton gradingButton = new JButton("GRADE");

    gradingFrame.add(fNameLabel);
    gradingFrame.add(fNameTxtField);

    gradingFrame.add(lNameLabel);
    gradingFrame.add(lNameTxtField);

    gradingFrame.add(marksInputLabel);
    gradingFrame.add(marksTxtField);

    gradingFrame.add(fullNameLabel);

    gradingFrame.add(marksLabel);

    gradingFrame.add(gradeLabel);

    gradingFrame.add(gradingButton);

   }
    
}
