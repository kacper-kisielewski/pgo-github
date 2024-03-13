import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
    }
    public static void task1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("City of residence: ");
        String city = scanner.next().toLowerCase();

        System.out.print("Day of the week: ");
        String weekday = scanner.next().toLowerCase();

        int discount = 0;
        if ((age < 10) || (weekday.equals("thursday"))) {
            discount += 100;
        } else {
            if ((age >= 10) && (age <= 18))
                discount += 50;
            if (city.equals("warsaw"))
                discount += 10;
        }

        double price = (1 - (discount / 100.00)) * 40;

        System.out.println("Data: " + city + ", " + age + " years old, " + weekday + " Ticket price: " + price + " PLN");
        System.out.println("Discount: " + discount + "%");
    }
}