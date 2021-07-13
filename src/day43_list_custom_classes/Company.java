package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        /**add 3 objects of Employee class...*/
        Employee emp1 = new Employee();
        emp1.name = "Adam Smith";
        emp1.jobTitle = "SDET";
        emp1.work();

        Employee emp2= new Employee();
        emp2.name="Noah Smith";
        emp2.jobTitle="Full stack developer";
        emp2.work();

        emp1.work();

    }
}