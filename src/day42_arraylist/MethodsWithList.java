package day42_arraylist;

import java.util.*;

public class MethodsWithList {
    public static void main(String[] args) {
        printStrList(Arrays.asList("Adam","Noah","Mom"));
        System.out.println(sumIntegerList(Arrays.asList(1,2,3,4,5,6,7,8,9,10)));
    }
    public static void printStrList(List<String> str){
        for(String word: str){
            System.out.print(word+" ");
        }
        System.out.println();
    }

    /**
     * method:sumIntegerList
     * param:List og integers
     * returns int
     * calculates sum of integers in the list then returns
     */

    public static int sumIntegerList(List<Integer> num) {
        int sum=0;
        for(int eachNum: num){
            sum+=eachNum;
        }

        return sum;
    }
}









