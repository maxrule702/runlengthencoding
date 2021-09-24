package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        Scanner userscanner = new Scanner(System.in);
        System.out.println("Enter your string");
        String user = userscanner.nextLine();
        String str = user;

        String value = getRunLengthEncodingForGivenString(str);
        System.out.println(value);
    }

    public static String getRunLengthEncodingForGivenString(String str) {
        String value = "", compare = "";

        for (int i = 0; i < str.length(); i++) {
            CharSequence seq = str.charAt(i) + "";

            if (compare.contains(seq))
                continue;

            compare = compare + str.charAt(i);

            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count = count + 1;
            }

            value = value + str.charAt(i) + Integer.toString(count);
        }
        return value;
    }

}
