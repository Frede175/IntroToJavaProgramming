/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fred.Custom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author fsr19
 */
public class StudentHashMap implements Student {
    private final String name, nationality;
    
    HashMap<Course, Double> courses = new HashMap<>();
    
    public StudentHashMap(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }
   
    @Override
    public String getName() {
        return name;
    }
    
    @Override
    public String getNationality() {
        return nationality;
    }
    
    /**
     * Get the average grade
     * @return returns double that range from 0...100
     */
    @Override
    public double getAverage() {
        double sum = 0;
        int ECTS = 0;
        for (Map.Entry<Course, Double> c : courses.entrySet()) {
            sum += c.getValue() * c.getKey().getECTS();
            ECTS += c.getKey().getECTS();
        }
        
        return sum / ECTS * 100;
    }
    
    /**
     * Add a course to the student with grade
     * @param course the course that wants to be added.
     * @param grade the grade rated from 0.0 to 1.0
     */
    @Override
    public void addCourse(Course course, double grade) {
        courses.put(course, grade);
    }
    
    /**
     * Get the calculated grade from the given course if the student have taken that course
     * @param course the course
     * @return the grade for the course if the student have, the value is from 0.0 to 1.0. If the student does not have the course the functions returns -1 
     */
    @Override
    public double getCalculatedGradeFromCourse(Course course) {
        for (Map.Entry<Course, Double> c : courses.entrySet()) {
            if (c.getKey().equalsCourse(course)) {
                return (c.getValue() * c.getKey().getECTS()) / course.getECTS();
            }
        }
        return -1;
    }
}
