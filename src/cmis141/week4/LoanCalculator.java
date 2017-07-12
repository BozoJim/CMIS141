package cmis141.week4;

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
        return "LoanCalculator{" +
                "loanAmount=" + loanAmount +
                ", loanTermInYears=" + loanTermInYears +
                ", loanTermInMonths=" + loanTermInMonths +
                ", interestRate=" + interestRate +
                ", monthlyPayment=" + monthlyPayment +
                ", totalAmount=" + totalAmount +
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
    }

    // Loan Term in Months
    public int getLoanTermInMonths() {
        return loanTermInMonths;
    }

    public void setLoanTermInMonths(int loanTermInYears) {
        this.loanTermInMonths = loanTermInYears * 12;
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
        double monthlyPayment = (loanAmount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -loanTermInMonths));
        return monthlyPayment;
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