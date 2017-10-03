/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.Custom;

/**
 *
 * @author fsr19
 */
public class Starter {
    
    
    public void run() {
        Course oop = new Course("OOP_CODE", "OOP", 20);
        Course ise = new Course("ISE_CODE", "ISE", 5);
        Course com = new Course("COMPUTER_CODE", "Computer systems", 5);
        
        Student[] students = {
            new StudentHashMap("Frederik", "Denmark"),
            new StudentHashMap("Jeppe", "Denmark"),
            new StudentHashMap("Nick", "USA")
        };
        
        students[0].addCourse(oop, 1);
        students[0].addCourse(ise, 1);
        students[0].addCourse(com, 1);
        
        students[1].addCourse(oop, 0.5);
        students[1].addCourse(ise, 0.5);
        students[1].addCourse(com, 0.75);
        
        students[2].addCourse(oop, 0.1);
        students[2].addCourse(ise, 0.1);
        
        printStudentNameAndAverage(students[0]);
        printStudentNameAndAverage(students[1]);
        printStudentNameAndAverage(students[2]);
        printAverageFromCourse(oop, students);
        printNumberOfStudentsFormNationality("Denmark", students);
        
    }
    
    
    private void printStudentNameAndAverage(Student student) {
        System.out.println(student.getName() + " got an average of: " + student.getAverage());
    }
    
    
    private void printAverageFromCourse(Course course, Student[] students) {
        double averageSum = 0;
        int count = 0;
        for (Student s : students) {
            double grade = s.getCalculatedGradeFromCourse(course);
            if (grade != -1) {
                averageSum += grade;
                count++;
            }
        }
        double average = averageSum / count * 100;
        
        System.out.println("The average for " + course.getName() + " is " + average);
    }
    
    private void printNumberOfStudentsFormNationality(String nationality, Student[] students) {
        int count = 0;
        for (Student s : students) {
            if (s.getNationality().equalsIgnoreCase(nationality)) {
                count++;
            }
        }
        System.out.println("Number of students from " + nationality + " is " + count);
    }
    
}
