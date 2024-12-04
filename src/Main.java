public class Main {
    public static void main(String[] args) {
        Student vasya = new Student(4234565,
                "Васильев",
                "Васек",
                "Группа 1",
                "Кафедра 1",
                "Разработка Java-приложений",
                5,
                "Марк Маркович Марков");
        Student petya = new Student(8752342,
                "Петров",
                "Петька",
                "Группа 2",
                "Кафедра 2",
                "Разработка Java-приложений",
                3,
                "Марк Маркович Марков");
        Student misha = new Student(3463187,
                "Мешок",
                "Мишаня",
                "Группа 3",
                "Кафедра 3",
                "Разработка Java-приложений",
                8,
                "Марк Маркович Марков");

        GroupStudents students = new GroupStudents();
        students.setGroupId(346233463);
        students.addStudent(misha);
        students.addStudent(vasya);
        students.addStudent(petya);

        students.printStudents();

        students.sort();

        students.printStudents();

        students.delete("Васильев");

        students.printStudents();

    }
}
