import java.util.Scanner;
public class ATMWithdraw {
	public static void main(String[] args) {
		
		        Scanner s = new Scanner(System.in);
		        int initialBalance = 10000;
		        int atmPin = 1234;
		        int cashInATM = 8000;
		        System.out.print("Enter your ATM PIN: ");
		        int enteredPin = s.nextInt();
		        if (enteredPin != atmPin) {
		            System.out.println("Incorrect PIN. Transaction failed.");
		            return;
		        }
		        System.out.print("Enter the amount to withdraw: ");
		        int amountToWithdraw = s.nextInt();
		        if (amountToWithdraw % 100 != 0) {
		            System.out.println("Invalid amount. Please enter a multiple of 100.");
		            return;
		        }
		        if (amountToWithdraw > initialBalance) {
		            System.out.println("Insufficient balance. Transaction failed.");
		            return;
		        }
		        if (amountToWithdraw > cashInATM) {
		            System.out.println("Insufficient cash in ATM. Transaction failed.");
		            return;
		        }
		        initialBalance -= amountToWithdraw;
		        cashInATM -= amountToWithdraw;
		        System.out.println("Transaction successful.");
		        System.out.println("Updated balance: Rs. " + initialBalance);
		    }
		}

