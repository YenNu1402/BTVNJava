package studentexercise;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Student extends Person implements displayInfo{
    private float gpa;
    private String major;
    public Student(String id, String fullName, Date dateOfBirth, float gpa, String major){
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }
    public Student(){
        
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID: " + getId());
        System.out.println("Full Name: " + getFullName());
        System.out.println("Date Of Birth: " + sdf.format(getDateOfBirth()));
        System.out.println("GPA: " + gpa);
        System.out.println("Major: " + major);
    }
    
}
