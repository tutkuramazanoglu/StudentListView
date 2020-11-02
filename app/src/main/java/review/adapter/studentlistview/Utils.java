package review.adapter.studentlistview;

import java.util.ArrayList;

public class Utils {

    private  Utils(){};

    public static ArrayList<Student> loadStudent(){
        ArrayList<Student>getListOfStudents=new ArrayList<>();
        getListOfStudents.add(new Student("Tutku","Co76123","CSAT",3));
        getListOfStudents.add(new Student("Alex", "C071010", "CPCT", 2));
        getListOfStudents.add(new Student("Emily", "C072255", "CSAT", 3));
        getListOfStudents.add(new Student("Leslie", "C078631", "EMBT", 1));
        return getListOfStudents;
    }

}
