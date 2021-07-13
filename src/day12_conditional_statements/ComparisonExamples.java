package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int speedLimit = 55;
        int currentSpeed=45;
        System.out.println(currentSpeed > speedLimit);//false 45 NOT MORE 55
        System.out.println(speedLimit < currentSpeed); //false 55 NOT LESS 45
        System.out.println(speedLimit == currentSpeed);//false 55 NOT EQUAL TO 45

        boolean isSpeeding = currentSpeed>speedLimit;
        System.out.println("are you speeding? - "+isSpeeding);
        System.out.println("currentSpeed = "+currentSpeed+"mph");
        System.out.println("speedLimit = "+speedLimit+"mph");

        currentSpeed +=20;  //currentSpeed=currentSpeed+20 ==>   same meaning
        isSpeeding = currentSpeed>speedLimit;
        System.out.println("are you speeding? - "+isSpeeding);
        System.out.println("currentSpeed = "+currentSpeed+"mph");
        System.out.println("speedLimit = "+speedLimit+"mph");

        double accountBalance = 250.25;
        double itemPrice = 200.99;
        System.out.println("can I afford? - " + (accountBalance >= itemPrice)); //true

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("can afford = " + canAfford);

        //decrease balance by itemPrice. using shorthand operator
        accountBalance = accountBalance - itemPrice;
        accountBalance -= itemPrice;

        boolean isBroke = accountBalance <= 0;
        System.out.println("Am I broke? - " + isBroke);
    }
}

