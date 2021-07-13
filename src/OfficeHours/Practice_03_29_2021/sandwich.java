package OfficeHours.Practice_03_29_2021;

public class sandwich {
    public static void main(String[] args) {
        /**A sandwich is two pieces of bread with something in between. Print the string that is between
         the first and last appearance of "bread" in the given string,
         or return string "nothing" if there are not two pieces of bread.
         input:breadjambread
         output:jam

         input xxbreadapple
         output:nothing
         **/
        String sandwich = "breadjambread";  // 0 + 5 = 5 -> substring(5) -> jam.contain(bread)
        boolean isValid = false;
        String result = "";

        if(sandwich.contains("bread")) { // 5,5

            int firstBread = sandwich.indexOf("bread");

            if(sandwich.substring(firstBread+5).contains("bread")) { //jambread

                int secondBread = sandwich.lastIndexOf("bread");
                result = sandwich.substring(firstBread + 5,secondBread);
                isValid = true;
            }

        }

        if(!isValid || result.isEmpty()) {
            System.out.println("nothing");
        } else {
            System.out.println(result);
        }


    }
}
