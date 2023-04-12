package org.example;
public class StringOperation {

    // This function is to reverse a string.
    public static String reverse(String statement) {
        if (statement == null || statement.isEmpty()) {
            return statement;
        }
        char[] chars = statement.toCharArray();
        int index = 0, ArrayOfStrings = chars.length - 1;
        while (index < ArrayOfStrings) {
            char temp = chars[index];
            chars[index] = chars[ArrayOfStrings];
            chars[ArrayOfStrings] = temp;
            index++;
            ArrayOfStrings--;
        }
        return new String(chars);
    }
    // This function checks whether a string is empty or not.
    public static boolean isEmpty(String statement) {
        return statement == null || statement.isEmpty();
    }
    // This function checks whether a string is Palindrome or not.
    public static Boolean isPalindrome(String stringToCheck)
    {
        if(stringToCheck == "" || stringToCheck == null)
            return false;

        String reversedString= reverse(stringToCheck);

        if(stringToCheck.equals(reversedString)) {
            return true;
        }
        else {
            return false;
        }
    }
}

