import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();

        Student student1 = new Student("Billy", "Java 1.0");
        Teacher teacher = new Teacher("Benny", "Mathmatics");

        student1.addCourse("Mathmatics");
        teacher.addCourse("Mathmatics");

    }
}