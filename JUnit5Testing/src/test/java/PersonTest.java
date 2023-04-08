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
    public void nameTest(){

        person.setName("");
        assertEquals("", person.getName());
        person.setName("Rishika");
        assertEquals("Rishika", person.getName());
    }
    //Test cases: for age.
    @Test
    public void ageTest(){
        person.setAge(32);
        assertEquals(32, person.getAge());
        person.setAge(0);
        assertTrue(person.getAge()<=0, "Reminder! age cannot be -ve or 0.");
    }
    //Test cases: for Emails.
    @Test
    public void emailTest(){
        person.setEmail("Rishika@gmail.com");
        assertEquals("Rishika@gmail.com", person.getEmail());
        String email = person.getEmail();
        assertTrue(email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"));
    }


}
