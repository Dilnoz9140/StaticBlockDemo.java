package repl_it;

public class sandwich1 {
    public static void main(String[] args) {
         /*A sandwich is two pieces of bread with something in between. Print the string that is between the first
        and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.
        input - breadjambread
        output: jam

        input hambreadapple
        output: nothing
        */
        //                 |
        String sandwich = "breadjambread";  // 0 + 5 = 5 -> substring(5) -> jam.contain(bread)
        if(sandwich.contains("bread")) { //

            int firstBread = sandwich.indexOf("bread") ;//0

            String afterBread = sandwich.substring(firstBread + 5) ;// jambread
            if(afterBread.contains("bread")) {// true

                int secondBread = afterBread.indexOf("bread");//3

                String result = sandwich.substring(firstBread + 5,  (firstBread + 5) +secondBread);//jam

                if(result.isEmpty()) {
                    System.out.println("nothing");
                } else {
                    System.out.println(result);
                }

            } else {
                System.out.println("nothing");
            }

        } else {
            System.out.println("nothing");
        }
    }
}


