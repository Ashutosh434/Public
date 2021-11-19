package A8;

import java.util.Scanner;

public class Q5 {

    private static StringBuilder charBuffer = new StringBuilder();

    public static String processWords(String input)
    {
        /* we are splitting the input based on
           spaces (s)+ : this regular expression
           will handle scenarios where we have words
           separated by multiple spaces */
        String s[] = input.split("(\\s)+");

        for(String values : s)
        {
           /* charAt(0) will pick only the first character
              from the string and append to buffer */
            charBuffer.append(values.charAt(0));
        }

        return charBuffer.toString();
    }

    // main function
    public static void main (String[] args)
    {
     Scanner sc = new Scanner(System.in);
        String input = "I am Ash";
        System.out.println(processWords(input));
    }
}

