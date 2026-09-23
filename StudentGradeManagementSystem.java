/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PreFinalExercise;

/**
 *
 * @author User
 */
public class StudentGradeManagementSystem {
    private int studentID;
    private String name;
    private String course;
    private double prelimGrade;
    private double midtermGrade;
    private double finalGrade;

    public StudentGradeManagementSystem(int studentID, String name, String course, double prelimGrade, double midtermGrade, double finalGrade) {
        this.studentID = studentID;
        this.name = name;
        this.course = course;
        this.prelimGrade = prelimGrade;
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getPrelimGrade() {
        return prelimGrade;
    }

    public void setPrelimGrade(double prelimGrade) {
        this.prelimGrade = prelimGrade;
    }

    public double getMidtermGrade() {
        return midtermGrade;
    }

    public void setMidtermGrade(double midtermGrade) {
        this.midtermGrade = midtermGrade;
    }

    public double getFinalGrade() {
        return finalGrade;
    }    
    
    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }
    
    public double calculateAverage(){
        return (prelimGrade + midtermGrade + finalGrade) / 3;
    }
    public String getClassification(){
        double average = calculateAverage();
        
        if(average >= 90){
            return"Exellent";
        }else if (average >= 85){
            return"Very Good";
        }else if (average >= 80){
            return"Good";
    }else if (average >= 75){
            return"Passing";
        }else {
        return"Failed";
    }
   }
     //Display student information
    public void displayStudentInfo() {
        double average = calculateAverage();

        System.out.println("===== STUDENT INFORMATION =====");
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println();
        System.out.println("Prelim Grade: " + (int) prelimGrade);
        System.out.println("Midterm Grade: " + (int) midtermGrade);
        System.out.println("Final Grade: " + (int) finalGrade);
        System.out.println();
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Classification: " + getClassification());

        if (average >= 75) {
            System.out.println("Status: PASSED");
        } else {
            System.out.println("Status: FAILED");
        }
    }
}

