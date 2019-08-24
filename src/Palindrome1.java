//Elena Voinu

import java.util.Scanner;

public class Palindrome1 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word to check if it's a" +
                " palindrome or not: ");
        String word = sc.nextLine();

        reverse(word);

        //check if the reversed word equals to user's input
        if (reverse(word).equalsIgnoreCase(word)){
            System.out.println(word.toUpperCase() + " is a palindrome");
        }
        else{
            System.out.println(word.toUpperCase() + " is not a palindrome");
        }

    }
    public static String reverse(String word){

        //convert the string to an array of characters
        char[] ch = word.toCharArray();

        // create an array to store the characters
        char[] result = new char[ch.length];

        //indexes as many as in ch array
        int len = ch.length;

        //traverse the the char array in reverse direction
        for( char c : ch){

            // store the characters in the second array
            result[len-1] = c;

            // and decrement the index by 1
            len--;
        }
        
        // Create a string from  the char array
        // String class that takes char array as an argument 
         return new String(result);



    }
}
