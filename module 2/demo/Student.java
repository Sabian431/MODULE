public class Student {
    private String name;
    private String faculty;
    private String programStudi;

    public Student(String name, String faculty, String programStudi) {
        this.name = name;
        this.faculty = faculty;
        this.programStudi = programStudi;
    }

    // Metode untuk menampilkan buku (Simulasi saja, tidak terimplementasi secara penuh)
    public void displayBooks() {
        System.out.println("Menampilkan daftar buku...");
    }

    public void logout() {
        System.out.println("System logout...");
    }

    // Getter untuk atribut-atribut Student
    public String getName() {
        return name;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getProgramStudi() {
        return programStudi;
    }
}
