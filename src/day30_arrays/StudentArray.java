package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
        student1[0] = "DY444777";
        student1[1] = "Dilnoza";
        student1[2] = "Yuldasheva";
        student1[3] = "B22";
        student1[4] = "707-77-4774";

        String[] student2 = {"AD111555", "Adam","Rakhmanov","B22","707-11-1551"};

        System.out.println("student1 id = " +student1[0]);
        System.out.println("student1 firstname = " +student1[1]);
        System.out.println("student1 lastname = " +student1[2]);
        System.out.println("student1 batch num = " +student1[3]);
        System.out.println("student1 mobile num = " +student1[4]);
        System.out.println();
        System.out.println("STUDENT DATA LENGTH: " +student1.length);

        /**
         check if student1 data array contains 5 items.
         true:  PASS: data array has correct length
         false: FAIL: data array has incorrect length
         */
        System.out.println();
         if(student1.length == 5){
             System.out.println("PASS: data array has correct length");
         }else{
             System.out.println("FAIL: data array has incorrect length");
         }


         /**
         check if student1 and student2 arrays have same number of data
         TRUE: PASS: data arrays length match
         FALSE: FAIL: data arrays length mismatch
         */

        if(student1.length == student2.length ){
            System.out.println("PASS:  data arrays length match");
        }else{
            System.out.println("FAIL: data arrays length mismatch");
        }
        /**
         * read from array and print firstname and lastname in all uppercase
         * ADAM SMITH
         */
        System.out.println();
        System.out.println(student1[1].toUpperCase()+" "+student1[2].toUpperCase());
    }

}
