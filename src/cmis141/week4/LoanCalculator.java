package cmis141.week4;

import java.text.NumberFormat;

/*  File:    LoanCalculator.java
 *  Author:  Stokes, James
 *  Date:    7/10/2017
 *  Purpose: A loan calculator which accepts a loanAmount, loanTermInYears, and interestRate (APR) to provide an idea of monthly payments as well as total after loan is paid in full.
 */
public class LoanCalculator {

    private int loanAmount, loanTermInYears, loanTermInMonths;
    private double interestRate, monthlyPayment, totalAmount;

    // Constructor
    public LoanCalculator(int loanAmount, int loanTermInYears, double interestRate) {
        this.loanAmount = loanAmount;
        this.loanTermInYears = loanTermInYears;
        this.interestRate = interestRate;
        this.loanTermInMonths = loanTermInYears * 12; // turn received years into months.
        this.monthlyPayment = monthlyPayment(loanAmount, loanTermInMonths, interestRate); // initialize monthly payment
        this.totalAmount = monthlyPayment * loanTermInMonths; // initialize total
    }

    // toString that will display the useful information.
    @Override
    public String toString() {
        // format numbers to to always be in the ##,###.## format
        NumberFormat nf = NumberFormat.getInstance();
        nf.setGroupingUsed(true);
        nf.setMaximumFractionDigits(2);

        return "LoanCalculator{" +
                "loanAmount=$" + nf.format(loanAmount) +
                ", loanTermInYears=" + loanTermInYears +
                ", loanTermInMonths=" + loanTermInMonths +
                ", interestRate=" + (interestRate * 100) + "%" +
                ", monthlyPayment=$" + nf.format(monthlyPayment) +
                ", totalAmount=$" + nf.format(totalAmount) +
                '}';
    }

    // Loan Amount
    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    // Loan Term in Years
    public int getLoanTermInYears() {
        return loanTermInYears;
    }

    public void setLoanTermInYears(int loanTermInYears) {
        this.loanTermInYears = loanTermInYears;
        this.loanTermInMonths = loanTermInYears * 12;
    }

    // Loan Term in Months
    public int getLoanTermInMonths() {
        return loanTermInMonths;
    }

    public void setLoanTermInMonths(int loanTermInMonths) {
        this.loanTermInMonths = loanTermInMonths;
        this.loanTermInYears = loanTermInMonths / 12;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // calculate monthly payments
    private double monthlyPayment(int loanAmount, int loanTermInMonths, double interestRate) {
        double monthlyRate = interestRate / 12;
        return (loanAmount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -loanTermInMonths));
    }

    // calculate total paid after all payments.
    private double calculateTotal() {
        double total = 0;
        for (int i = 0; i < loanTermInMonths; i++) {
            total += monthlyPayment;
        }
        return total;
    }

} // end class