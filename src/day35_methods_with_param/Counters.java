package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
       count(7);
       printAge(1986);
       int birthYear=2008;
       printAge(birthYear);

        String word = "wooden spoon";
        count(word.length());
    }
    public static void count(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
        public static void printAge(int year){
            int age=2021-year;
            System.out.println("Birth year: "+year+". Age: "+age);

        }


    }


