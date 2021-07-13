package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        // 0    1   2  3    4    5     6   7   8     9 index
        int[] data = {32, 532, 1, 5454, 22, 123, 543, 999, 321, 3};
//       --------------for each loop------------------------
        for (int eachNum : data) {
            System.out.println(eachNum);
        }
        //repeat above with for loop
        System.out.println("---------For Loop---------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        System.out.println("--------------");
        System.out.println(data[data.length - 1]);

        //print all number backwards in same line
        for (int idx = data.length - 1;idx>=0;idx-- ){
            System.out.print(data[idx]+" ");
        }
    }
}

