import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {
    private Map<Integer, Student> students;

    public List<Course> getCoursesByStudentId(int studentId) {
        return findStudentById(studentId).getCourse();
    }

    public Student findStudentById(int id) {
        for (Map.Entry<Integer,Student>  student: students.entrySet()) {
            if (student.getKey() == id)
                return student.getValue();
        }
        return null;
    }

    public boolean removeStudent(int id) {
        if (findStudentById(id) != null){
            students.remove(findStudentById(id));
            return true;
        }
        return false;
    }

    public School() {
        students = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.put(student.getStudentId(),student);
    }

    public void printStudents() {
        for (Map.Entry<Integer,Student>  student: students.entrySet()) {
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
