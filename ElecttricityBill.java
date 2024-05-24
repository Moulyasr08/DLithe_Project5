import java.util.Scanner;
public class ElecttricityBill {
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter Service Number: ");
	        String serviceNum = s.nextLine();
	        System.out.print("Enter Previous Reading: ");
	        int previousReading = s.nextInt();
	        System.out.print("Enter Current Reading: ");
	        int currentReading = s.nextInt();
	        int units = currentReading - previousReading;
	        double cost;
	        if (units< 100) {
	            cost = units * 1.0;
	        } else if (units < 150) {
	            cost = units * 1.5;
	        } else if (units < 200) {
	            cost = units * 2.0;
	        } else {
	            cost = units * 2.5;
	        }
	        double cgst = cost * 0.05;
	        double sgst = cost * 0.15;
	        double totalAmount = cost + cgst + sgst;
	        System.out.println("Electricity Bill");
	        System.out.println("Service Number: " + serviceNum);
	        System.out.println("Previous Reading: " + previousReading);
	        System.out.println("Current Reading: " + currentReading);
	        System.out.println("Units Consumed: " + units);
	        System.out.println("Cost of Electricity: Rs. " + cost);
	        System.out.println("CGST:" + cgst);
	        System.out.println("SGST:" + sgst);
	        System.out.println("Total Amount" + totalAmount);
	    }
	}




