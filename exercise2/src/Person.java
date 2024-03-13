import java.time.LocalDate;

public class Person {
    public static int basePrice = 40;
    public int age;
    public String city;
    public String weekday;

    public Person(int age, String city) {
        this.age = age;
        this.city = city.toLowerCase();
        this.weekday = getDayOfWeek().toLowerCase();
    }

    public Person(int age, String city, String weekday) {
        this(age, city);
        this.weekday = weekday.toLowerCase();
    }

    public static String getDayOfWeek() {
        return LocalDate.now().getDayOfWeek().name();
    }

    public int calculateDiscount() {
        int discount = 0;
        if ((this.age < 10) || (this.weekday.equals("thursday"))) {
            discount = 100;
            return discount;
        }
        if (this.age <= 18)
            discount += 50;
        if (this.city.equals("warsaw"))
            discount += 10;
        return discount;
    }

    public double getIndividualPrice() {
        return (1 - (calculateDiscount() / 100.00)) * basePrice;
    }

    public void printData() {
        System.out.println("Data: " + this.city + ", " + this.age + " years old, " + this.weekday + " Ticket price: " + getIndividualPrice() + " PLN");
        System.out.println("Discount: " + calculateDiscount() + "%");
    }
}
