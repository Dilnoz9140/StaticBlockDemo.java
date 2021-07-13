package Practice_03_31_2021;

public class CountUpperCaseLowercase {
    public static void main(String[] args) {
        /**Count upper,lower,and numbers
        Given A String, find and print how many uppercase letter, lowercase letter, and number are in the String
         EX:
        input: 2juMp41EEkd4s4
         output:
         3 uppercase letters
         6 lowerCase letters
         5 numbers
         */
            int lowerCase=0;
            int upperCase=0;
            int number=0;

        String str="2juMp41EEkd4s4";
        for (int i =0; i<str.length(); i++){
            int eachLetter = str.charAt(i);
            if(eachLetter>='A'&& eachLetter<='Z') {// we can use Ascii table: if(eachLetter>=65 &&eachLetter<=90){
                upperCase++;

            }else if(eachLetter<='z'&&eachLetter>='a') {//else if(eachLetter>=97 && eachLetter<=122){
                lowerCase++;
            }else if(eachLetter>='0'&&eachLetter<='9'){//else if(eachLetter>=48 &&eachLetter<=57){number++;
                number++;
                }

            }
        System.out.println("Uppercase: "+upperCase);
        System.out.println("Lowercase: " + lowerCase);
        System.out.println("numbers: " + number);
        }

    }

