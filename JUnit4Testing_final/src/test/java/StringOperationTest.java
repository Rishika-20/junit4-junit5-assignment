import org.example.StringOperation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringOperationTest {
    StringOperation stringOperation;

    @Before
    public void setup() {
        stringOperation = new StringOperation();
    }

    // Testing:- reverse method with non-empty string.
    @Test
    public void testReversee_reverse_with_non_empty_string() {
        //String reversedString = stringUtils.reverse("Rishika");
        assertEquals("akihsiR", stringOperation.reverse("Rishika"));
    }

    // Testing:- reverse method with empty string.
    @Test
    public void testReverse_reverse_with_empty_string() {
        String reversedString = stringOperation.reverse("");
        assertEquals("", reversedString);
    }

    // Testing:- isEmpty() with non-empty method.
    @Test
    public void testEmpty_with_non_empty_method() {
        Boolean emptyString = stringOperation.isEmpty("hello");
        assertEquals(false, emptyString);
    }

    // Testing:- isEmpty method with empty method.
    @Test
    public void testEmpty_with_empty_method() {
        Boolean emptyString = stringOperation.isEmpty("");
        assertEquals(true, emptyString);
    }

    // Testing:- isPalindrome method with palindrome string.
    @Test
    public void testIsPalindrome_with_valid_palindrome_string() {
        Boolean isPalindromeOrNot = stringOperation.isPalindrome("maam");
        assertEquals(true, isPalindromeOrNot);
    }

    // Testing:- isPalindrome method with non-palindrome string.
    @Test
    public void testIsPalindrome_with_invalid_palindrome_string() {
        Boolean isPalindromeOrNot = stringOperation.isPalindrome("Java Studio");
        assertEquals(false, isPalindromeOrNot);
    }

    // Testing:- isPalindrome method with empty string.
    @Test
    public void testIsPalindrome_with_empty_string() {
        Boolean isPalindromeOrNot = stringOperation.isPalindrome("");
        assertEquals(false, isPalindromeOrNot);
    }

    @After
    public void tearDown() {
        System.out.println("\nYour test is success.");
    }
}