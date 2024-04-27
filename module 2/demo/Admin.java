import java.util.ArrayList;

public class Admin {
    private String adminUsername;
    private String adminPassword;
    private ArrayList<Student> studentList;

    public Admin(String adminUsername, String adminPassword) {
        this.adminUsername = adminUsername;
        this.adminPassword = adminPassword;
        this.studentList = new ArrayList<>();
    }

    public void addStudent(String name, String nim, String faculty, String programStudi) {
        if (nim.length() != 15) {
            System.out.println("NIM harus 15 digit");
            return;
        }
        Student newStudent = new Student(name, faculty, programStudi);
        studentList.add(newStudent);
        System.out.println("Student successfully registered.");
    }

    public void displayStudents() {
        for (Student student : studentList) {
            System.out.println("Name: " + student.getName() + "\nFaculty: " + student.getFaculty() + "\nNIM: " + student.getProgramStudi() + "\nProgram: " + student.getProgramStudi());
        }
    }

    public boolean authenticate(String username, String password) {
        return adminUsername.equals(username) && adminPassword.equals(password);
    }
}
