import java.util.Arrays;

public class StudentManagement {
    private Student[] students;
    private int count;

    public StudentManagement() {
        this.students = new Student[100];
        this.count = 0;
    }

    /**
     * add student into array.
     *
     * @param newStudent : student of insert
     */
    public void addStudent(Student newStudent) {
        if (count < 100) {
            students[count] = new Student(newStudent);
            count++;
        }
    }

    public static boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     *  print student by group.
     */
    public String studentsByGroup() {
        StringBuilder result = new StringBuilder();
        boolean[] processed = new boolean[count];

        for (int i = 0; i < count; i++) {
            if (!processed[i]) {
                String currentGroup = students[i].getGroup();
                result.append(currentGroup).append("\n");

                for (int j = i; j < count; j++) {
                    if (students[j].getGroup().equals(currentGroup) && !processed[j]) {
                        result.append(students[j].getInfo()).append("\n");
                        processed[j] = true;
                    }
                }
            }
        }

        return result.toString();
    }

    /**
     *  remove student in array.
     *
     * @param id : student's id to remove
     */
    public void removeStudent(String id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[count - 1] = null;
                count--;
                return;
            }
        }
    }

}