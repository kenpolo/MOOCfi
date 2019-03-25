
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        while (true) {
            System.out.print("name: ");
            String studentName = reader.nextLine();
            if (studentName.isEmpty()) {
                break;
            } else {
                System.out.print("studentnumber: ");
                String studentNum = reader.nextLine();
                list.add(new Student(studentName, studentNum));
            }

        }
        for (Student student : list) {
            System.out.println(student);

        }
        System.out.println("Give search term: ");
        String find = reader.nextLine();
        for (Student student : list) {
            if ((student.getName().contains(find))) {
                System.out.println("Result:");
                System.out.println(student);
            }
        }
    }

}
