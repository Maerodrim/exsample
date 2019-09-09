import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class PersonTest {
    @Test
    public void test(){
        Person firstHuman = new Person();
        Person secondHuman = new Person();
        Person thirdHuman = new Person();

        firstHuman.setFirstName("Gans");
        firstHuman.setLastName("Chylc");
        firstHuman.setPassportId(236235444);

        secondHuman.setFirstName("Katerin");
        secondHuman.setLastName("Malkin");
        secondHuman.setPassportId(833534346);

        thirdHuman.setFirstName("Piligrim");
        thirdHuman.setLastName("Scott");
        thirdHuman.setPassportId(913463494);

        assertEquals(firstHuman.getFirstName(), "Gans");
        assertEquals(firstHuman.getLastName(), "Chylc");
        assertEquals(firstHuman.getPassportId(), 236235444);

        assertEquals(secondHuman.getFirstName(), "Katerin");
        assertEquals(secondHuman.getLastName(), "Malkin");
        assertEquals(secondHuman.getPassportId(), 833534346);

        assertEquals(thirdHuman.getFirstName(), "Piligrim");
        assertEquals(thirdHuman.getLastName(), "Scott");
        assertEquals(thirdHuman.getPassportId(), 913463494);
    }
}
