package cmis141.test;

/*
 * File: CheckDriver.java
 * Author: Hieu Dao-Mai
 * Date: 07-15-2017
 * Purpose: Create a test class to construct and call the methods of the Check class.
 */

import cmis141.week4.Check;

import java.util.Scanner;

class CheckDriver {

    public static void main(String[] args) {

        double chkAmount = 0.0;
        String payeeName = null;

        Scanner input = new Scanner(System.in);

        Check chkObj = new Check(1277263, 383843, 939.50, "Stephen Main");		/* create an object Check */

		
		/* Print out statements and calling in the methods */
        System.out.println("Routing Number = " + chkObj.getRoutingNums());
        System.out.println("Account Number = " + chkObj.getAccountNum());
        System.out.println("Amount = " + chkObj.getAmount());
        System.out.println("Payee = " + chkObj.getPayee());

    }

} // end CheckDriver