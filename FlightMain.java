import java.util.Scanner;

public class FlightTicketMain {
    public static void main(String[] args) {
        int r_pos, c_pos, choice;
        String passanger_name, passanger_ticket_cancel;
        Scanner sc = new Scanner(System.in);
        FlightTicket fticket = new FlightTicket(5, 16);

        while (true) {
            System.out.println("1 for Ticket Reservation\n2 for Ticket Cancelation\n3 for display\n4 for exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter your name");
                    sc.nextLine();
                    passanger_name = sc.nextLine();
                    try {
                        System.out.println("Enter the position you want");
                        r_pos = sc.nextInt();
                        c_pos = sc.nextInt();
                        fticket.Ticket_reservation(passanger_name, r_pos, c_pos);

                    } catch (Exception e) {
                        System.out.println("Seat position is out of range");
                    }

                    // System.out.println("Your ticket has been sucessfully booked");
                    break;

                case 2:
                    System.out.println("Enter your name to cancel the ticket");
                    sc.nextLine();
                    passanger_ticket_cancel = sc.nextLine();
                    // System.out.println("Enter the pos");
                    // r_pos=sc.nextInt();
                    // c_pos=sc.nextInt();
                    fticket.Ticket_cancel(passanger_ticket_cancel);

                    break;
                case 3:
                    fticket.display_seats();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }

        }

    }

}
