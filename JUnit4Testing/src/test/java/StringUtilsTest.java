import org.example.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class StringUtilsTest
{
    StringUtils stringUtils;
    @Before
    public void setup()
    {
        stringUtils = new StringUtils();
    }

    // Testing:- reverse method with non-empty string.
    @Test
    public void testReversee_test1()
    {
        String reversedString = stringUtils.reverse("Rishika");
        assertEquals("akihsiR", reversedString);
    }

    // Testing:- reverse method with empty string.
    @Test
    public void testReverse_test2()
    {
        String reversedString = stringUtils.reverse("");
        assertEquals("", reversedString);
    }
    // Testing:- isEmpty() with non-empty method.
    @Test
    public void testEmpty_test1(){
        Boolean emptyString = stringUtils.isEmpty("hello");
        assertEquals(false, emptyString);
    }

    // Testing:- isEmpty method with empty method.
    @Test
    public void testEmpty_test2(){
        Boolean emptyString = stringUtils.isEmpty("");
        assertEquals(true, emptyString);
    }

    // Testing:- isPalindrome method with palindrome string.
    @Test
    public void testIsPalindrome_test1(){
        Boolean isPalindromeOrNot = stringUtils.isPalindrome("maam");
        assertEquals(true, isPalindromeOrNot);
    }

    // Testing:- isPalindrome method with non-palindrome string.
    @Test
    public void testIsPalindrome_test2(){
        Boolean isPalindromeOrNot = stringUtils.isPalindrome("Java Studio");
        assertEquals(false, isPalindromeOrNot);
    }

    // Testing:- isPalindrome method with empty string.
    @Test
    public void testIsPalindrome_test3(){
        Boolean isPalindromeOrNot = stringUtils.isPalindrome("");
        assertEquals(false, isPalindromeOrNot);
    }
    @After
    public void tearDown(){
        System.out.println("\nThis is called after each tests.");
    }
}