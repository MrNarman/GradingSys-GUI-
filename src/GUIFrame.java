import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    gradingButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            
        try{
            String studentFname = fNameTxtField.getText().toUpperCase(); //Get first name & convert to upper case
            String studentLname = lNameTxtField.getText().toUpperCase(); //Get last name & convert to upper case

            String mrksToGrade = marksTxtField.getText();
            double studentMarks = Double.parseDouble(mrksToGrade);


            if(studentFname.isEmpty() || studentLname.isEmpty()){
                JOptionPane.showMessageDialog(gradingFrame, "ENTER STUDENT NAMES AS REQUESTED!", "REQUIRED FIELD", JOptionPane.ERROR_MESSAGE);
            }else{
    
                if(studentMarks > 100){
                    JOptionPane.showMessageDialog(gradingFrame, "ENTER MARKS IN RANGE 0 to 100","RANGE ERROR", JOptionPane.WARNING_MESSAGE);
    
                } else if(studentMarks <= 39){
                    fullNameLabel.setText("Name: "+studentFname+ " "+ studentLname);
                    marksLabel.setText("Marks: "+ mrksToGrade);
                    gradeLabel.setText("Grade: E");
                    
                } else if(studentMarks <= 49){
                    fullNameLabel.setText("Name: "+studentFname+ " "+ studentLname);
                    marksLabel.setText("Marks: "+ mrksToGrade);
                    gradeLabel.setText("Grade: D");
                    
            
                } else if(studentMarks <= 59){
                    fullNameLabel.setText("Name: "+studentFname+ " "+ studentLname);
                    marksLabel.setText("Marks: "+ mrksToGrade);
                    gradeLabel.setText("Grade: C");
                    
            
                } else if(studentMarks <= 69){
                    fullNameLabel.setText("Name: "+studentFname+ " "+ studentLname);
                    marksLabel.setText("Marks: "+ mrksToGrade);
                    gradeLabel.setText("Grade: B");
                    
            
                } else{
                    fullNameLabel.setText("Name: "+studentFname+ " "+ studentLname);
                    marksLabel.setText("Marks: "+ mrksToGrade);
                    gradeLabel.setText("Grade: A");
                    
            
                }}

        }catch(NumberFormatException error){
            JOptionPane.showMessageDialog(gradingFrame, "ENTER MARKS.\nSTUDENT MARKS ARE REQUIRED FOR GRADING!", "REQUIRED FIELD", JOptionPane.ERROR_MESSAGE);
            
            

        }

        }
    });

    JButton resetFields = new JButton("CLEAR");
    resetFields.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            fNameTxtField.setText("");
            lNameTxtField.setText("");
            marksTxtField.setText("");

        }
    });

    gradingFrame.add(fNameLabel);
    gradingFrame.add(fNameTxtField);

    gradingFrame.add(lNameLabel);
    gradingFrame.add(lNameTxtField);

    gradingFrame.add(marksInputLabel);
    gradingFrame.add(marksTxtField);

    gradingFrame.add(fullNameLabel);

    gradingFrame.add(marksLabel);

    gradingFrame.add(gradeLabel);

    gradingFrame.add(new JLabel()); //For spacing
    gradingFrame.add(gradingButton);
    gradingFrame.add(new JLabel()); //For spacing
    gradingFrame.add(resetFields);   

   }
    
}
