package day18_conditions_practice_strings_intro;
import java.util.Scanner;
public class ScoreRangeTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A score:");
        int score=scan.nextInt();
        if(score<=100&&score>=91) {
            System.out.println("Your grade is A");
        }else if(score>=61&&score<=90) {
            System.out.println("Your grade is B");
        }else if(score<=60&&score>=41) {
            System.out.println("Your grade is C");
        }else if(score>=1&&score<=40) {
            System.out.println("Your grade is D");
        }else{
            System.out.println("Invalid score");
        }
    }
}
