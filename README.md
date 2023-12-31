# junit4-junit5-assignment

#Junit 4 : 

Create a JUnit4 test class called "StringUtilsTest". This test class should test the basic functionality of a simple StringUtils class that has the following methods:

    reverse(String str): returns the reverse of the input string - Implement this method yourself
    isEmpty(String str): returns true if the input string is empty, false otherwise - Implement this method yourself
    isPalindrome(String str): returns true if the input string is a palindrome, false otherwise - Implement this method yourself

Your "StringUtilsTest" class should have three test methods, one for each StringUtils method. Each test method should test the following scenarios:

    Test the method with a non-empty string
    Test the method with an empty string

For the isPalindrome() method, you should also test the following scenario:

    Test the method with a palindrome string
    Test the method with a non-palindrome string
    
    
#Junit 5: step by step questions-

Create a JUnit 5 test class called "PersonTest". This test class should test the basic functionality of a simple Person class that has the following properties:

    name (String): the name of the person 
    age (int): the age of the person
    email (String): the email address of the person

In Test class, create Person object with any given params and test the getters against the params being passed to create Person object.

Your "PersonTest" class should have three test methods, one for each property. Each test method should test the following scenarios:

    Test the getter method for a non-null value
    Test the getter method for a null value

For the "age" property, you should also test the following scenarios:

    Test the setter method with a positive integer
    Test the setter method with a negative integer
    Test the setter method with zero.
