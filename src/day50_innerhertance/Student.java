package day50_innerhertance;


    //  IS-A
    public class Student extends Person {
        String school;

        public void study(String topic) {

            System.out.println(name +" is studying "+topic +" at " + school);
        }
    }

