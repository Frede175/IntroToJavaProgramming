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
public class Course {
    private String code, name;
    private int ECTS;
    
    public Course(String code, String name, int ECTS) {
        this.code = code;
        this.name = name;
        this.ECTS = ECTS;
    }
    
    public String getCode() {
        return code;
    }
    
    public String getName() {
        return name;
    }
    public double getECTS() {
        return ECTS;
    }

    public boolean equalsCourse(Course course) {
        return code.equalsIgnoreCase(course.code);
    }
}
