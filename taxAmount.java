/* Write an app that 
	1) Gets a purchase amount from the user.
	2) Get a state of residence from the user (CA, NY,NJ,IL,TX, or Other):
	3) The tax rates for those states are:
	State   Rate
	====   ======
	CA 	    .075
	NY      .0825
	NJ      .0425
	IL      .105
	TX      .55
	Other   .10
	Any other input (besides these states) the rate is .10

	4) Write a method that has as its arguments the purchase amount input by the user, and the state of
    residence input by the user. The method should return a double value equal to
    purchase amount * (rate for the state of residence),

	5) Use the method to display that tax amount to the user. If your method is named calcTaxRateForPurchase, 
    your variable for storing the purchase amount is purchaseAmount and your variable for storing state of residence
    is stateOfResidence, then your code should look something like this:

	System.out.printlin("Your tax amount on a purchase of " + purchaseAmount + " is " + 
    calcTaxRateForPurchase(purchaseAmount,stateOfResidence));
*/

import java.util.Scanner;


public class taxAmount {
	public static void main(String[] args){
        
        // Declare all your variables at the top
        double purchaseAmount;
        String stateOfResidence;

        // You only need to create the scanner object only once.
		Scanner input = new Scanner(System.in);

        // Taking in the user input for the purchase amount
		System.out.println("Enter purchase amount: ");
		purchaseAmount = input.nextDouble();

        // Taking in the user input for the State
		System.out.println("Enter state of residence: ");
		stateOfResidence = input.next();
		System.out.println(stateOfResidence);

        // Closing the scanner. Just memorize this step for now!
		input.close();

        // The most important call of the main function.
	    System.out.println("Your tax amount on a purchase of " + calcTaxRateForPurchase(purchaseAmount, stateOfResidence));	
    }
	
	public static double calcTaxRateForPurchase(double purchaseAmount, String state) {
		double rate;
		if (state.equals("CA")) {
			rate = .075;
		} else if (state.equals("NY")) {
			rate = .0825;
		} else if (state.equals("NJ")) {
			rate = .0425;
		} else if (state.equals("IL")) {
			rate = .105;
		} else if (state.equals("TX")) {
			rate = .55;
		} else {
			rate = .10;
		}        
		return purchaseAmount * rate;
	}
	
}
