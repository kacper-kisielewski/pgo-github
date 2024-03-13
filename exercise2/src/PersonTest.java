import org.junit.Test;

import static org.junit.Assert.assertEquals;

class PersonTest {
    @Test
    void getDayOfWeek() {
    }

    @Test
    void calculateDiscount() {
        // Test when a person is under 10 years old
        Person child = new Person(5, "Warsaw");
        assertEquals(100, child.calculateDiscount());

        // Test when a person is between 10 and 18 years old
        Person teenager = new Person(15, "Krakow");
        assertEquals(50, teenager.calculateDiscount());

        // Test when a person is a resident of Warsaw
        Person warsawResident = new Person(25, "Warsaw");
        assertEquals(10, warsawResident.calculateDiscount());

        // Test when a person is a resident of Warsaw and between 10 and 18 years old
        Person warsawTeenagerResident = new Person(18, "Warsaw");
        assertEquals(60, warsawTeenagerResident.calculateDiscount());

        // TODO Test when the ticket is purchased on a Thursday
        Person thursdayCustomer = new Person(30, "Krakow");
        assertEquals(100, thursdayCustomer.calculateDiscount());

        // Test when multiple conditions apply (cumulative discounts, limit of 100)
        Person cumulativeDiscountCustomer = new Person(12, "Warsaw");
        assertEquals(100, cumulativeDiscountCustomer.calculateDiscount());
    }

    @Test
    void getIndividualPrice() {
    }
}