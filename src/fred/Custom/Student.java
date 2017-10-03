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
public interface Student {
    public abstract String getName();
    public abstract String getNationality();
    public abstract double getAverage();
    public abstract void addCourse(Course course, double grade);
    public abstract double getCalculatedGradeFromCourse(Course course);
}
