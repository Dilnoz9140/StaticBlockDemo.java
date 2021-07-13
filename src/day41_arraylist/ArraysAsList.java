package day41_arraylist;

import java.beans.beancontext.BeanContextChild;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23,1,34,54,654);
        System.out.println("nums = "+nums);
        //nums.add(100); UnsupportedOperationException
        //nums.remove(0);UnsupportedOperationException
        //nums.clear();UnsupportedOperationException

        List<Integer>numsList = new ArrayList<>(Arrays.asList(4,2,4,23,5344,100));
        numsList.add(33);
        numsList.add(56);
        System.out.println("numsList after adding = "+numsList);
        numsList.remove(0);
        numsList.remove(new Integer(23));
        System.out.println("numsList after removing = "+numsList);
        /**
         List String drinksWithCaffeine -> coffee, tea, monster, red bull, coke, pepsi, mdew, kambucha, celsius
         int caffeineAmount = 0;
         monster , red bull, celsius:
         caffeineAmount = 150
         coffee, kambucha:
         caffeineAmount = 112
         tea, coke, pepsi, mdew:
         caffeineAmount = 35
         */
        List<String>drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee","tea","monster","red bull","coke",
                "pepsi", "mdew","kambucha","celsius"));
        System.out.println(drinksWithCaffeine);
        int caffeineAmount=0;
        for (String eachDrink:drinksWithCaffeine){
            if(eachDrink.equals("monster")|| eachDrink.equals("red bull")||eachDrink.equals("celsius")){
                caffeineAmount=150;
                System.out.println(eachDrink+" --> "+caffeineAmount );
            }else if(eachDrink.equals("coffee")||eachDrink.equals("kambucha")){
                caffeineAmount=112;
                System.out.println(eachDrink + " --> "+caffeineAmount);
            }else if(eachDrink.equals("tea")||eachDrink.equals("coke")||eachDrink.equals("pepsi")
                    || eachDrink.equals("mdew")){
                caffeineAmount=35;
                System.out.println(eachDrink + " --> "+caffeineAmount);

            }
        }
        System.out.println("-----------------------------------------------------------------");
             for(String eachDrink:drinksWithCaffeine){
                 switch (eachDrink){
                     case "monster": case "red bull": case "celsius":
                         caffeineAmount = 150;
                         System.out.println(eachDrink + " --> "+caffeineAmount);
                         break;
                     case "coffee": case "kambucha":
                         caffeineAmount = 112;
                         System.out.println(eachDrink + " --> "+caffeineAmount);
                         break;
                     case "tea": case "coke": case "pepsi": case "mdew":
                         caffeineAmount = 35;
                         System.out.println(eachDrink + " --> "+caffeineAmount);
                         break;

                 }

        }
              drinksWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase()));

        drinksWithCaffeine.forEach(each -> {
            System.out.println("-------");
            System.out.println("each = " + each);
            System.out.println("-------");
        });
    }

    }

