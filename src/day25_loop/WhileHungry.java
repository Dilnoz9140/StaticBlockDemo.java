package day25_loop;

public class WhileHungry {
    /**boolean isHungry = true;
     int bananas = 0;
     int countToFull = 3;

     it takes 3 bananas for isHungry to be set to false

     while hungry
     eat banana 1

     when bananas reaches countToFull
     set hungry to false

     increase banana by 1       **/

    public static void main(String[] args) {
        boolean isHungry=true;
        int bananas=0;
        int countToFull =3;
        while(isHungry){
            bananas++;
            System.out.println("Eating bananas: \uD83C\uDF4C "+bananas);
            if(bananas==countToFull){
                isHungry=false;//isHungry=bananas==countToFull ? false:true;
            }
        }
        System.out.println("Had enough bananas. lets get back to studying");
    }


     }
