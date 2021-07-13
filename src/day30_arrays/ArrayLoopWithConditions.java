package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {

        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String[] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};
        //print all numbers from prices array that are more than 100
        System.out.println("-------------prices less than 100 -----------------------");
        for (double eachPrice : prices) {
            if (eachPrice > 100) {
                System.out.print(eachPrice + " ");
            }
        }
            System.out.println("\n-----------prices between10 and 70 inclusive--------------");
            for(double eachPr : prices ) {
                if (eachPr >= 10 && eachPr <= 70) {
                    System.out.print(eachPr + " ");
                }
            }
                System.out.println("\n----------count of the prices that are more than 50----------");
                   int count=0;
                for(double pr :prices){
                    if(pr>=50){
                        count++;
                    }
                }
                System.out.println("count = "+count);
        System.out.println("\n--------countries with name length more than 7  - inclusove------");
             for(String countryName : countries){
                 if(countryName.length()>=7){
                     System.out.println(countryName+"-"+countryName.length());
                 }
             }
            }
        }


