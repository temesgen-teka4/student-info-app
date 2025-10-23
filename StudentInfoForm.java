/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * StudentInfoForm.java
 * A simple Java GUI form to collect student information.
 * Created by Temesgen Teka 
 */
package awtswingpractice;
import javax.swing.*;

import java.awt.event.*;
/**
 *
 * @author Temesgen
 */
public class StudentInfoForm {
        public static void main(String[] args){
            JFrame frame= new JFrame("Student Info Form");
            frame.setSize(600,400);
            frame.setLayout(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            // Name Label and field
            JLabel nameLabel= new JLabel("Name");
            nameLabel.setBounds(50,50,80,30);
            frame.add(nameLabel);
            
            JTextField nameField = new JTextField();
            nameField.setBounds(150,50,150,30);
            frame.add(nameField);
            
            // Age Label & Field 
            
            JLabel ageLabel= new JLabel("Age:");
            ageLabel.setBounds(50,100,80,30);
            frame.add(ageLabel);
            
            JTextField ageField =new JTextField();
            ageField.setBounds(150,100,150,30);
            frame.add(ageField);
            
            // Department label & field
            
            
            JLabel depLabel= new JLabel(" Department:");
            depLabel.setBounds(50,150,80,30);
            frame.add(depLabel);
            
            
            JTextField depField = new JTextField();
            depField.setBounds(150,150,150,30);
            frame.add(depField);
            
            
            // Submit button
            
            JButton submitButton =new JButton("Submit");
            submitButton.setBounds(150,200,100,30);
            frame.add(submitButton);
            
            
            // output label
            
            JLabel outputLabel = new JLabel("");
            outputLabel.setBounds(50,250,300,30);
            frame.add(outputLabel);
            
            
            
            // Event Handling
            
            
         submitButton.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 String name = nameField.getText();
                 String age =ageField.getText();
                 String dept = depField.getText();
                 
                 
                 outputLabel.setText("HELLO ✋"+ name +",AGE: "+ age+ ",DEPARTMENT:"+dept);
             }
             
         });
            
            
            frame.setVisible(true);
        }
}
