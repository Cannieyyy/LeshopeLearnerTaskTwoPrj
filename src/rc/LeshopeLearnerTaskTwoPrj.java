/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rc;

import javax.swing.JOptionPane;

/**
 *
 * @author Leshope Kopano (ST10459862)
 */
public class LeshopeLearnerTaskTwoPrj {
    static Learner objLearner = new Learner();
    
    public static void main(String[] args) {
        getLearnerInput();
        displayFinalMark();
        
    }
    // Method to ask user details
    public static void getLearnerInput(){
       objLearner.setFullName(JOptionPane.showInputDialog("Please enter learner's full name")); 
       objLearner.setSubject(JOptionPane.showInputDialog("Please enter subject "));
       objLearner.setAssignmentMark(Double.parseDouble(JOptionPane.showInputDialog("Please enter Assignment mark")));
       objLearner.setExamMark(Double.parseDouble(JOptionPane.showInputDialog("Please enter learner exam mark")));
       objLearner.setTestMark(Double.parseDouble(JOptionPane.showInputDialog("Please enter learner's test mark")));
    
    }
   
    //Method for calculating the final mark of the learner
    public static void displayFinalMark(){
        double finalMark = objLearner.calcFinalMark();
        
        JOptionPane.showMessageDialog(null, "Learner's Final Mark is:" + finalMark);
        
    }
            
}