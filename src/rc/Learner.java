/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rc;

/**
 *
 * @author Leshope Kopano (ST10459862)
 */
public class Learner {
    //Create attributes for learner details - make them private to achieve 
    private String fullName;
    private String subject;
    private double assignmentMark;
    private double examMark;
    private double testMark;
    
    //Creation of a default constructor to set the default values for all attributes

    public Learner() {
        this.fullName = "";
        this.subject = "";
        this.assignmentMark = 0.0;
        this.examMark = 0.0;
        this.testMark = 0.0;
    }

   
    //Creation of getters that return the values for each attribute

    public String getFullName() {
        return fullName;
    }

    public String getSubject() {
        return subject;
    }

    public double getAssignmentMark() {
        return assignmentMark;
    }

    public double getExamMark() {
        return examMark;
    }

    public double getTestMark() {
        return testMark;
    }
    
   //Creation of setters that assign values for each attribute

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setAssignmentMark(double assignmentMark) {
        this.assignmentMark = assignmentMark;
    }

    public void setExamMark(double examMark) {
        this.examMark = examMark;
    }

    public void setTestMark(double testMark) {
        this.testMark = testMark;
    }
     
    /* A method to calculate the final Mark  which is 
    the Average mark for all 3 marks 
    */
    public double calcFinalMark(){
        return (getAssignmentMark() + getExamMark() + getTestMark())/3;
    }
}

