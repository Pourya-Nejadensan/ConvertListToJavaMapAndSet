public class Course {
    private String courseName;
    private String instructorName;
    private int room;

    public Course(String courseName, String instructorName, int room) {
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", instructorName='" + instructorName + '\'' +
                ", room=" + room +
                '}';
    }
}
