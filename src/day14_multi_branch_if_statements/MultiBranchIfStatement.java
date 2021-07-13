package day14_multi_branch_if_statements;

public class MultiBranchIfStatement {
    public static void main(String[] args) {
        int day=1;
        if(day==1) {
            System.out.println("Monday");
        }else {
            System.out.println("Not Monday");
        }
            if (day == 1) {
                System.out.println("Tuesday");
            }else{
                System.out.println("Not Tuesday");
            }
            if (day == 3) {
                System.out.println("Wednesday");
            }else {
                System.out.println("Not wednesdsay");
            }
        System.out.println("==============Multi Branch If Statements===============");

            day=1;
            if(day==1){
                System.out.println("Monday");
            }else if(day==1){
                System.out.println("Tuesday");
            }else if(day==3) {
                System.out.println("Wednesday");
            }else{
                System.out.println("Java day");
            }

        }
    }

