import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<String> canTeach; //ArrayList for courses the teacher can teach
    private ArrayList<String> currentCourses; //ArrayList for courses the teacher is currently teaching


    public Teacher (String name, ArrayList<String> canTeach){
        super(name); // Calls Persons' constructor
        this.canTeach = canTeach;
        this.currentCourses = new ArrayList<>(); //Initializes ArrayList
    }

    @Override
    public boolean addCourse(String course) {
        if (canTeach.contains(course)) { //Checking if the teacher can teach the course
            currentCourses.add(course);
            return true;
            }else{
            return false;

        }
    }
}
