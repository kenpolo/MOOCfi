
public class Student {
    

    private String name;
    private String studentnumber;
    

    public Student(String name, String studentnumber) {
        this.name = name;
        this.studentnumber = studentnumber;
        
    }
    public String getName() {
        return this.name;
    }
    public String getStudentNumber() {
        return this.studentnumber;
    }
    public String toString() {
    return this.name + " (" + this.studentnumber + ") ";
}
    
}
