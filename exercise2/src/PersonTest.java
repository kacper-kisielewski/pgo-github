import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testCalculateDiscount_YoungChild() {
        Person person = new Person(5, "Kraków", "Sunday");
        assertEquals(100, person.calculateDiscount());
    }

    @Test
    void testCalculateDiscount_Youth() {
        Person person = new Person(15, "Płock", "Thuesday");
        assertEquals(50, person.calculateDiscount());
    }

    @Test
    void testCalculateDiscount_Youth_Warsaw() {
        Person person = new Person(15, "Warsaw", "Monday");
        assertEquals(60, person.calculateDiscount());
    }

    @Test
    void testCalculateDiscount_Thursday() {
        Person person = new Person(25, "Warsaw", "Thursday");
        assertEquals(100, person.calculateDiscount());
    }

    @Test
    void testCalculateDiscount_Adult() {
        Person person = new Person(25, "Kraków","Friday");
        assertEquals(0, person.calculateDiscount());
    }

    @Test
    void testGetIndividualPrice_Youth() {
        Person person = new Person(18, "Kraków", "Wednesday");
        assertEquals(20.0, person.getIndividualPrice());
    }

    @Test
    void testGetIndividualPrice_Thursday() {
        Person person = new Person(21, "Kraków", "Thursday");
        assertEquals(0.0, person.getIndividualPrice());
    }
}