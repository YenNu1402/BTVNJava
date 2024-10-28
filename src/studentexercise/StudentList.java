package studentexercise;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    private List<Student> studentList;
    
    public StudentList(){
        this.studentList = new ArrayList<>();
    }
    public List<Student> getStudentList(){
        return studentList;
    }
    public void setStudentList(List<Student> studentList){
        this.studentList = studentList;
    }
    public void addStudent(Student student){
        studentList.add(student);
    }
    public boolean addStudentById(String id, Student newStudent){
        for(int i = 0; i < studentList.size(); i++){
            Student student = studentList.get(i);
            if (student.getId().equals(id)) {
                student.setFullName(newStudent.getFullName());
                student.setDateOfBirth(newStudent.getDateOfBirth());
                student.setGpa(newStudent.getGpa());
                student.setMajor(newStudent.getMajor());
                return true;
        }
    }
        return false;
}
    public boolean updateStudentById(String id, Student newStudent) {
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.getId().equals(id)) {
                student.setFullName(newStudent.getFullName());
                student.setDateOfBirth(newStudent.getDateOfBirth());
                student.setGpa(newStudent.getGpa());
                student.setMajor(newStudent.getMajor());
                return true; // Đã cập nhật thành công
            }
        }
        return false; // Không tìm thấy sinh viên với ID đã cho
    }
    public boolean deleteStudentById(String id) {
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.getId().equals(id)) {
                studentList.remove(i);
                return true;
            }
}
        return false;
}
public void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("Can't found students.");
        } else {
            for (int i = 0; i < studentList.size(); i++) {
                Student student = studentList.get(i);
                student.displayInfo();
                System.out.println("*********************");
            }
        }
    }
public Student findStudentWithHighestGpa() {
        if (studentList.isEmpty()) {
            return null;
        }

        Student highestGpaStudent = studentList.get(0);

        for (int i = 1; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.getGpa() > highestGpaStudent.getGpa()) {
                highestGpaStudent = student;
            }
        }
        return highestGpaStudent;
    }
}
