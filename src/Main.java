import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the minimum value: ");
        int minValue = scanner.nextInt();

        System.out.print("Enter the maximum value: ");
        int maxValue = scanner.nextInt();

        Counter myCounter = new Counter(minValue, maxValue);

        while (true) {
            System.out.println("Current value: " + myCounter.getValue());

            System.out.println("Enter 1 to increment the counter");
            System.out.println("Enter 2 to quit");

            int choice = scanner.nextInt();

            if (choice == 1) {

                myCounter.increment();

            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }

        scanner.close();
    }
}
