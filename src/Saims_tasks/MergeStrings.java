package Saims_tasks;

public class MergeStrings {
    //    public static void main(String[] args) {
//
//
//        String s1 = "abc";
//        String s2 = "defhj";
//        System.out.println(merge(s1, s2));
//    }
//
//    public static String merge(String s1, String s2) {
//
//        String result = "";
//
//
//        for (int i = 0; i < s1.length() || i < s2.length(); i++) {
//
//
//            if (i < s1.length()) {
//                result += s1.charAt(i);
//            }
//
//
//            if (i < s2.length())
//                result += s2.charAt(i);
//        }
//
//        return result;
//    }
//}
    public static void main(String[]args){
        mergeString("Java","java");
    }
    public static void mergeString(String sentence1, String sentence2) {
        String mix = "";
        String addition = "";   /*addition is A substring of the longest word minus shorter word.*/
        int minLength = 0; // number of iterations */
        if (sentence1.length() > sentence2.length()) {
            addition = sentence1.substring(sentence2.length());
            minLength = sentence2.length();
        } else {
            addition = sentence2.substring(sentence1.length());
            minLength = sentence1.length();
        }
        for (int i = 0; i < minLength; i++) {
            mix += sentence1.charAt(i) + "" + sentence2.charAt(i);
        }
        System.out.println(mix + addition);
    }
}