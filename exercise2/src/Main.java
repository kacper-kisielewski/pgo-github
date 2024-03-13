import java.time.*;

class Person {
    public static int basePrice = 40;
    protected int age;
    protected String city;
    protected String weekday;
    protected int discount;

    public Person(int age, String city) {
        this.age = age;
        this.city = city.toLowerCase();
        this.weekday = getDayOfWeek().toLowerCase();
        this.discount = calculateDiscount();
    }

    public Person(int age, String city, String weekday) {

    }

    public static String getDayOfWeek() {
        return LocalDate.now().getDayOfWeek().name();
    }

    protected int calculateDiscount() {
        int discount = 0;
        if ((this.age < 10) || (this.weekday.equals("thursday"))) {
            discount = 100;
            return discount;
        }
        if ((this.age >= 10) && (this.age <= 18))
                discount += 50;
        if (this.city.equals("warsaw"))
                discount += 10;
        return discount;
    }

    public double getIndividualPrice () {
        return (1 - (this.discount / 100.00)) * basePrice;
    }

    public void printData() {
        System.out.println("Data: " + this.city + ", " + this.age + " years old, " + this.weekday + " Ticket price: " + getIndividualPrice() + " PLN");
        System.out.println("Discount: " + discount + "%");
    }
}

public class Main {
    public static void main(String[] args) {
        Person customer = new Person(18, "Warsaw");
        customer.printData();
    }
}