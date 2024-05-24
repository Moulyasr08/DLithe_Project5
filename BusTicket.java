import java.util.Scanner;
public class BusTicket {
		    public static void main(String[] args) {
		        Scanner s = new Scanner(System.in);
		        System.out.print("Enter Boarding Stop : ");
		        int boardingStop = s.nextInt();
		        System.out.print("Enter Destination Stop : ");
		        int destinationStop = s.nextInt();
		        System.out.print("Enter Number of Adult Passengers: ");
		        int adultPassengers = s.nextInt();
		        System.out.print("Enter Number of Child Passengers: ");
		        int childPassengers = s.nextInt();
		        int numberOfStops = destinationStop - boardingStop;
		        double adultTicketCost = adultPassengers * 10.0 * numberOfStops;
		        double childTicketCost = childPassengers * 5.0 * numberOfStops;
		        double totalTicketCost = adultTicketCost + childTicketCost;
		        double discount = 0.0;
		        if (adultPassengers >= 5) {
		            discount = 0.20;
		        } else if (adultPassengers == 4) {
		            discount = 0.15;
		        } else if (adultPassengers == 3) {
		            discount = 0.10;
		        } else if (adultPassengers == 2) {
		            discount = 0.05;
		        }
		        double discountedCost = totalTicketCost * (1 - discount);
		        double tax = discountedCost * 0.10;
		        double finalTotalCost = discountedCost + tax;
		        System.out.println("Bus Ticket");
		        System.out.println("Boarding Stop: " + boardingStop);
		        System.out.println("Destination Stop: " + destinationStop);
		        System.out.println("Number of Stops: " + numberOfStops);
		        System.out.println("Number of Adult Passengers: " + adultPassengers);
		        System.out.println("Number of Child Passengers: " + childPassengers);
		        System.out.println("Adult Ticket Cost: Rs. " + adultTicketCost);
		        System.out.println("Child Ticket Cost: Rs. " + childTicketCost);
		        System.out.println("Total Ticket Cost (Before Discount): Rs. " + totalTicketCost);
		        System.out.println("Discount: " + (discount * 100) + "%");
		        System.out.println("Total Ticket Cost : Rs. " + discountedCost);
		        System.out.println("Tax: Rs. " + tax);
		        System.out.println("Total Ticket Cost : Rs. " + finalTotalCost);
		    }
		

	}




