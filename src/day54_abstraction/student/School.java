package day54_abstraction.student;

public class School {
    public static void main(String[] args) {
        //Student student = new Student(); //ERROR - cannot create object of Student
        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.attendClass();

        CampusStudent campusStudent = new CampusStudent();
        campusStudent.attendClass();

    }
}
