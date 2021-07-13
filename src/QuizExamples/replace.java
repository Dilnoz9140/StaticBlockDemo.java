package QuizExamples;

public class replace {
    public static void main(String[] args) {
        String ta ="A";//A
        ta =ta +"B";//AB
        String tb ="C";//C
        ta = ta+tb;//ABC
        ta.replace('C','D');
        System.out.println(ta);

    }
}

