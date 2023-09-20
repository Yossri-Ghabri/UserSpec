package userTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;
import org.user.userspec.entity.Users;


import java.time.LocalDate;

@SpringBootTest
public class UserServiceTest {


    @Test
    public void should_save_user(){

        Users user = new Users("anna",
                LocalDate.of(1990, 5, 15));
        user.setName("anna");
        user.setBirthdate(LocalDate.of(1990, 5, 15));
        user.setCountryOfResidence("France");
        user.setPhoneNumber("1234567890");
        user.setGender("femme");

        assertEquals("anna", user.getName());
        assertEquals(LocalDate.of(1990, 5, 15), user.getBirthdate());
        assertEquals("France", user.getCountryOfResidence());
        assertEquals("1234567890", user.getPhoneNumber());
        assertEquals("femme", user.getGender());
    }


    @Test
    public void test_Get_User_By_Id() {

        Users user = new Users("max", LocalDate.of(1990, 5, 15));
        user.setId(1L);
        user.setName("max");
        user.setBirthdate(LocalDate.of(1990, 5, 15));
        user.setCountryOfResidence("France");
        user.setPhoneNumber("1234567890");
        user.setGender("homme");

        assertEquals("max", user.getName());
        assertEquals(LocalDate.of(1990, 5, 15), user.getBirthdate());
        assertEquals("France", user.getCountryOfResidence());
        assertEquals("1234567890", user.getPhoneNumber());
        assertEquals("homme", user.getGender());

    }

}
