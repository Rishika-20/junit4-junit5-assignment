package org.example;
public class StringUtils {

    // This function is to reverse a string.
    public static String reverse(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        char[] chars = string.toCharArray();
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
    public static boolean isEmpty(String string) {
        return string == null || string.isEmpty();
    }
    // This function checks whether a string is Palindrome or not.
    public Boolean isPalindrome(String stringToCheck)
    {
        if(stringToCheck == "" || stringToCheck == null)
            return false;

        String reversedString= reverse(stringToCheck);

        if(stringToCheck.equals(reversedString))
            return true;
        else
            return false;
    }
}

