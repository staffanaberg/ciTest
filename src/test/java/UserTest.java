import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void testSetName() {
        User user = new User("Staffan", "password123");
        user.setName("Henry");
        String actual = user.getName();
        String expected = "Henry";
String none = "";
        assertEquals(expected, actual);


    }

}
