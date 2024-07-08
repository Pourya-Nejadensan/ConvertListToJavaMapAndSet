import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // task 1 ----------------------------------

        List<Student> students = new ArrayList<Student>();

        students.add(new Student("aaa",
                "aaa",
                1
        ));
        students.add(new Student("bbb",
                "bbb",
                2
        ));
        students.add(new Student("ccc",
                "ccc",
                3
        ));

        for (Student student : students) {
            System.out.println("Id : " + student.getStudentId());
            System.out.println("Name : " + student.getFirstName());
            System.out.println("Last Name : " + student.getLastName());
            System.out.println("---------------------");
        }

        // task 2 ----------------------------------

        System.out.println("// task 2 ----------------------------------");

        School school = new School();
        for (Student student : students) {
            school.addStudent(student);
        }
        System.out.println(school);

        school.printStudents();

        // task 3 ----------------------------------
        System.out.println("task 3 ----------------------------------");
        System.out.println(school.findStudentById(1));
        System.out.println(school.findStudentById(5));
        System.out.println(school.removeStudent(1));
        System.out.println(school);
        System.out.println(school.removeStudent(1));

        // bonus: Course ----------------------------------
        System.out.println("bonus: Course ----------------------------------");
        System.out.println(school);
        List<Course> myCourse = new ArrayList<>();
        myCourse.add(new Course("Math", "Math", 10));
        myCourse.add(new Course("Informatik", "Informatik", 20));

        students.get(2).addCourse(myCourse.get(0));
        students.get(2).addCourse(myCourse.get(1));

        System.out.println(school.getCoursesByStudentId(3));
        System.out.println(school.getCoursesByStudentId(2));



    }
}
