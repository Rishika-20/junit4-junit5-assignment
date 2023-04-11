import org.junit.jupiter.api.BeforeEach;
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
    public void nameTest_non_empty_string(){

        person.setName("Rishika");
        assertEquals("Rishika", person.getName());
    }
    @Test
    public void nameTest_empty_string() {

        person.setName("");
        assertEquals("", person.getName());
    }
    //Test cases: for age.
    @Test
    public void ageTest_positive_value(){
        person.setAge(32);
        assertEquals(32, person.getAge());
    }
    @Test
    public void ageTest_negative_value() {
        person.setAge(0);
        assertTrue(person.getAge() <= 0, "Reminder! age cannot be -ve or 0.");
    }
    //Test cases: for Emails.
    @Test
    public void emailTest_with_validation(){
        person.setEmail("Rishika@gmail.com");
        assertEquals("Rishika@gmail.com", person.getEmail());
        String email = person.getEmail();
        assertTrue(email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"));
    }


}
