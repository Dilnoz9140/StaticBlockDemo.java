package day05_primitives_concatnation;

public class JobInfo {
    public static void main(String[] args){
        String title="Java SDET";
        String company="Google";
        String jobDescription="Java Selenium,Cucumber, Junit";
        double salary=7777.77;
        byte  yearsExp=7;
        boolean hasBenefits=true;
        System.out.println("Job Title is:"+title+"\n"+"Company:"+company+"\n"+"Job description:"
                +jobDescription+"\n"+"Salary:"+"$"+salary+"\n"+"Years experiance:"
                +yearsExp+"years"+"\n"+"Has benefits?"+hasBenefits);
        System.out.println("Job Title is:"+"\t"+title+"\n"+"Company:"+"\t"+company+"\n"+"Job description:"+"\t"
                +jobDescription+"\n"+"Salary:"+"$"+salary+"\n"+"Years experiance:"+yearsExp+"years"+"\n"+"Has benefits?"+hasBenefits);
    }
}
