package OfficeHours.Practice_03_03_2021;
/**Create A class Employee
create A main method

        Declare and assign these variables according to the most appropriate datatypes: (Use as many datatypes as you can for practice)

        - first name, last name, company name, salary, start day, start month, start year, are they full time, job title, office address,

        Declare new variables and use concatenation from previous variables to set their values

        - full name (first and last name)
        - full start date (start month date, year)
        - email (first name + start day @ company name .com)
        - Salary after 3 years (base salary + start month * 10000)
        Ex: base: 100000
        start day: 2
        after 3 year: (100000 + (2 * 1000)) = 102000

        Display the values of the variables following given example image*/

public class Employee {
    public static void main(String[] args) {
        String firstName="James";
        String lastName= "Bond";
        String companyName="Tesla";
        double salary=100000.0;
        char $ ='$';
        byte startDay=4;
        String startMonth="January";
        int startYear = 2021;
        boolean isFullTime= true;
        String jobTitle = "SDET";
        String officeAddress="100 S LaneHampton, VA 13312";

        String fullName=firstName+" "+lastName;
        String fullStartDate=startMonth+" "+startDay+","+ startYear;
        String email=firstName + startDay+"@"+companyName+".com";
        double salaryAfter3Years=salary+(startDay*1000);

        System.out.println("    ***** "+companyName+" New Hire Information *****");
        System.out.println(firstName+" welcome to "+companyName);
        System.out.println("Your start date as A "+ jobTitle+" will be on "+startMonth+" "+startDay+","+startYear);
        System.out.println("You are fulltime: "+isFullTime+" and will he making "+salary+" per year");
        System.out.println("The office is located at: \n"+officeAddress);

        System.out.println("\n   Official Information:");
        System.out.println("New hire name: "+fullName);
        System.out.println("Starts on: "+startMonth+" "+startDay+","+startYear);
        System.out.println("Email generated: "+email);
        System.out.println("Your expected salary after 3years: "+salaryAfter3Years);






    }
}
