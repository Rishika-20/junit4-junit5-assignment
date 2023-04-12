import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {
    private Person person;
    @BeforeEach
    public void setUp(){
        person = new Person();
    }

    //Test cases: for name.
    @Test
    @DisplayName("Testing name with valid Input")
    public void nameTest_givenNonEmptyInput_shouldReturnName(){

        person.setName("Rishika");
        assertEquals("Rishika", person.getName());
    }
    @Test
    @DisplayName("Testing name with empty Input")
    public void nameTest_givenEmptyInput_shouldReturnNull() {

        person.setName("");
        assertEquals("", person.getName());
    }
    //Test cases: for age.
    @Test
    @DisplayName("Testing age with positive Input")
    public void ageTest_givenPositiveValue_shouldReturnValidAge(){
        person.setAge(32);
        assertEquals(32, person.getAge());
    }
    @Test
    @DisplayName("Testing age with negative Input")
    public void ageTest_givenNegativeInput_shouldReturnNull() {
        person.setAge(0);
        assertTrue(person.getAge() <= 0, "Reminder! age cannot be -ve or 0.");
    }
    //Test cases: for Emails.
    @Test
    @DisplayName("Testing email validation")
    public void emailTest_givenInputEmail_shouldReturnValidEmail(){
        person.setEmail("Rishika@gmail.com");
        assertEquals("Rishika@gmail.com", person.getEmail());
        String email = person.getEmail();
        assertTrue(email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"));
    }


}
