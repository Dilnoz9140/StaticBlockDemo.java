package Practice_03_23_2021;

public class ThreeWordsContains {

    public static void main(String[] args) {

        String wordOne = "java";
        String wordTwo = "mouse";
        String wordThree = "apples";
        String biggestWordWithA = ""; // java

        if(wordOne.contains("A") && wordOne.length() > biggestWordWithA.length()) {
        biggestWordWithA = wordOne;
        }

        if(wordTwo.contains("A") && wordTwo.length() > biggestWordWithA.length()) {
        biggestWordWithA = wordTwo;
        }

        if(wordThree.contains("A") && wordThree.length() > biggestWordWithA.length()) {
        biggestWordWithA = wordThree;
        }

        if(biggestWordWithA.isEmpty()) {
        System.out.println("No words contained A");
        } else {
        System.out.println("Longest word with A: " + biggestWordWithA);
        }


        }
}
