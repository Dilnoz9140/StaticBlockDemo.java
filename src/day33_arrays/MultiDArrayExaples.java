package day33_arrays;

import java.util.Arrays;

public class MultiDArrayExaples {
    public static void main(String[] args) {
        String[][] users = new String[3][2];
        users[0][0] = "Adam Rakhmanov";
        users[0][1] = "Adams0105";
        users[1][0] = "Noah Rakhmanov";
        users[1][1] = "NoahTn0311";
        users[2][0] = "Ayub RAkhmanov";
        users[2][1] = "AyubTash0622";

        String[][] userData = {{"Adam Rakhmanov", "Adams0105"},
                {"Noah Rakhmanov", "NoahTn0311"},
                {"Ayub RAkhmanov", "AyubTash0622"}};

       // System.out.println(users[0][0].split(" ")[0]);
        System.out.println(users[0][0]);
        System.out.println(users[1][0]);
        System.out.println(users[2][0]);

        System.out.println(users[0][1]);
        System.out.println(users[1][1]);
        System.out.println(users[2][1]);

        System.out.println(Arrays.deepToString(userData));
    }
}
