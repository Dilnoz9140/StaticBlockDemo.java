package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Moscow";
        if(city.equals("Moscow") || city.equals("Tampa")){
            System.out.println("Willing to relocate to " + city);
        }else{
            System.out.println("Not considering-"+city);
        }
        String teacher = "Saim";
        // Saim, Murodil --> it is A java class with Saim
        // otherwise --> Soft kill class with Nadir

        if(teacher.equals("Saim") || teacher.equals("Muradil")){
            System.out.println("Its A java class with "+ teacher);
        }else {
            System.out.println("Soft skill class with "+teacher );
        }
        if(teacher.equals("Saim") || teacher.equals("Muradil")) {
            System.out.println("Its A java class with "+ teacher);
        }else if(teacher.equals("Nadir")) {
            System.out.println("Soft skill class with " + teacher);
        }else {
            System.out.println("Some class with " + teacher);
        }
            System.out.println("==========================================");



        //company - "Google" OR salary >= 100k -> accept offer
        String company = "NadirTech";
        double salary = 105_000.0;

        if(company.equals("Google") || salary >= 100_000) {
            System.out.println("Accepting offer from " +company);
        }else {
            System.out.println("Rejecting offer from " + company);
        }

        if(company.equals("Google") && salary >= 100_000) {
            System.out.println("Accepting offer from " +company);
        }else {
            System.out.println("Rejecting offer from " + company);
        }

    }
}
