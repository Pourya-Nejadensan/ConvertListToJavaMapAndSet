import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students;

    public List<Course> getCoursesByStudentId(int studentId) {
        return findStudentById(studentId).getCourse();
    }

    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getStudentId() == id)
                return student;
        }
        return null;
    }

    public boolean removeStudent(int id) {
        if (findStudentById(1) != null){
            students.remove(findStudentById(1));
            return true;
        }
        return false;
    }

    public School() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
