/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.Custom;

import java.util.ArrayList;

/**
 *
 * @author fsr19
 */
public class StudentPrivateClass implements Student {
    private String name, nationality;
    ArrayList<CourseGrade> courses = new ArrayList<>();
    
    public StudentPrivateClass(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }
   
    public String getName() {
        return name;
    }
    
    public String getNationality() {
        return nationality;
    }
    
    /**
     * Get the average grade
     * @return returns double that range from 0...100
     */
    public double getAverage() {
        double sum = 0;
        int ECTS = 0;
        for (CourseGrade c : courses) {
            sum += c.getCalculatedGrade();
            ECTS += c.getECTS();
        }
        
        return sum / ECTS * 100;
    }
    
    /**
     * Add a course to the student with grade
     * @param course the course that wants to be added.
     * @param grade the grade rated from 0.0 to 1.0
     */
    public void addCourse(Course course, double grade) {
        courses.add(new CourseGrade(course, grade));
    }
    
    /**
     * Get the calculated grade from the given course if the student have taken that course
     * @param course the course
     * @return the grade for the course if the student have, the value is from 0.0 to 1.0. If the student does not have the course the functions returns -1 
     */
    public double getCalculatedGradeFromCourse(Course course) {
        for (CourseGrade c : courses) {
            if (c.getCourse().equalsCourse(course)) {
                return c.getCalculatedGrade() / course.getECTS();
            }
        }
        return -1;
    }
    
    
    private class CourseGrade {
        private Course course;
        /**
         * Rated from 0.0 to 1.0
         */
        private double grade;
        
        public CourseGrade(Course course, double grade) {
            this.course = course;
            this.grade = grade;
        }
        
        public double getCalculatedGrade() {
            return grade * course.getECTS();
        }
        
        public double getECTS() {
            return course.getECTS();
        }
        
        public Course getCourse() {
            return course;
        }
        
    }
}
