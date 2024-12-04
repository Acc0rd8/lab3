import java.util.Arrays;

public class GroupStudents {

    private int groupId;
    private Student[] students;

    public GroupStudents() {
        students = new Student[0];
    }

    public GroupStudents(int groupId, Student[] students) {
        this.groupId = groupId;
        this.students = students;
    }

    public Student getStudentById(int studentId) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                return student;
            }
        }
        return null;
    }

    public void addStudent(Student student) {
        Student[] newStudents = new Student[students.length + 1];
        System.arraycopy(students, 0, newStudents, 0, students.length);
        newStudents[newStudents.length - 1] = student;
        students = newStudents;
    }

    public int delete(String fam) {
        boolean found = false;
        int studentIdx = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFam().equals(fam)) {
                found = true;
                studentIdx = i;
                break;
            }
        }
        if (!found) {
            return -1;
        }
        for (int i = studentIdx; i < students.length - 1; i++) {
            Student stud = students[i];
            students[i] = students[i + 1];
            students[i + 1] = stud;
        }
        Student[] newStudents = new Student[students.length - 1];
        System.arraycopy(students, 0, newStudents, 0, students.length - 1);
        students = newStudents;
        return 1;
    }

    public void sort() {
        int n = students.length;
        Student temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (students[j - 1].getFam().compareTo(students[i].getFam()) > 0) {
                    temp = students[j - 1];
                    students[j - 1] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    public void printStudents() {
        System.out.println(Arrays.toString(students));
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
