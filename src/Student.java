public class Student {

    private int studentId;
    private String fam;
    private String name;
    private String group;
    private String department;
    private String discipline;
    private int mark;
    private String teacherName;

    public Student(int studentId, String fam, String name, String group, String department, String discipline, int mark, String teacherName) {
        this.studentId = studentId;
        this.fam = fam;
        this.name = name;
        this.group = group;
        this.department = department;
        this.discipline = discipline;
        this.mark = mark;
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "id = " + studentId +
                ", фамилия = '" + fam + '\'' +
                ", имя = '" + name + '\'' +
                ", группа = '" + group + '\'' +
                ", кафедра = '" + department + '\'' +
                ", дисциплина = '" + discipline + '\'' +
                ", оценка = " + mark +
                ", преподаватель = '" + teacherName + '\'' +
                "\n";
    }

    public int getId() {
        return studentId;
    }

    public void setId(int id) {
        this.studentId = id;
    }

    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
