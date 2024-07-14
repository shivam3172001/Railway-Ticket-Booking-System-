import java.util.Scanner;

public class RailwayReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Railway Reservation System");
        System.out.println("1. Book Ticket");
        System.out.println("2. Cancel Ticket");
        System.out.println("3. Check PNR Status");
        System.out.println("4. Exit");
        System.out.print("Please select an option: ");

        int choice = scanner.nextInt();
        scanner.nextLine(); 

        if (choice == 1) {
            bookTicket(scanner);
        } else if (choice == 2) {
            cancelTicket(scanner);
        } else if (choice == 3) {
            checkPNRStatus(scanner);
        } else if (choice == 4) {
            System.out.println("Exiting the system. Thank you!");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }

        scanner.close();
    }

    public static void bookTicket(Scanner scanner) {
        System.out.print("Enter passenger name: ");
        String name = scanner.nextLine();
        System.out.print("Enter train number: ");
        int trainNumber = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Ticket booked successfully for " + name + " on train number " + trainNumber);
    }

    public static void cancelTicket(Scanner scanner) {
        System.out.print("Enter booking reference number: ");
        String bookingReference = scanner.nextLine();

        System.out.println("Ticket with booking reference " + bookingReference + " has been cancelled successfully.");
    }

    public static void checkPNRStatus(Scanner scanner) {
        System.out.print("Enter PNR number: ");
        String pnr = scanner.nextLine();

        System.out.println("PNR Status for " + pnr + " is: Confirmed.");
    }
}
