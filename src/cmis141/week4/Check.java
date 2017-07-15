package cmis141.week4;

/**
 * File: Check.java
 * Author: Hieu Dao-Mai
 * Date: 07-14-2017
 * Purpose: Provide java code for a simple class for a check which includes at least one constructor, two methods,
 * and two private fields.
 */

public class Check {

    /* fields */
    private int accountNum;
    private int routingNum;
    private double amount;
    private String payee;

    /* constructor */
    public Check(int acctNum, int rtNum, double amt, String pay) {
        accountNum = acctNum;
        routingNum = rtNum;
        amount = amt;
        payee = pay;
    }

    /* methods */
    public int getAccountNum() {
        return this.accountNum;
    }

    public int getRoutingNums() {
        return this.routingNum;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getPayee() {
        return this.payee;
    }

}