package cmis141.test;

import cmis141.week4.LoanCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Loan Calculator Program. Please do no make any financial decisions based on my sketchy code.
 */
class LoanCalculatorTest {

    private double delta = 0.001;
    private LoanCalculator testCase1 = new LoanCalculator(50000, 6, 0.03);

    @Test
    void testCaseOne() {
        System.out.println(testCase1.toString());
    }

    @Test
    void getLoanAmount() {
        assertEquals(50000, testCase1.getLoanAmount(), delta);
    }

    @Test
    void setLoanAmount() {
        assertEquals(50000, testCase1.getLoanAmount(), delta);
        testCase1.setLoanAmount(20000);
        assertEquals(20000, testCase1.getLoanAmount(), delta);
    }

    @Test
    void getLoanTermInYears() {
        testCase1.setLoanTermInMonths(15);
        assertEquals(1, testCase1.getLoanTermInYears());
        testCase1.setLoanTermInYears(5);
        assertEquals(5, testCase1.getLoanTermInYears());
    }

    @Test
    void setLoanTermInYears() {
        testCase1.setLoanTermInYears(17);
        assertEquals(17, testCase1.getLoanTermInYears());
        assertEquals(204, testCase1.getLoanTermInMonths());
    }

    @Test
    void getLoanTermInMonths() {
        testCase1.setLoanTermInMonths(15);
        assertEquals(15, testCase1.getLoanTermInMonths());
        testCase1.setLoanTermInYears(5);
        assertEquals(60, testCase1.getLoanTermInMonths());
    }

    @Test
    void setLoanTermInMonths() {
        testCase1.setLoanTermInMonths(75);
        assertEquals(75, testCase1.getLoanTermInMonths());
        assertEquals(6, testCase1.getLoanTermInYears());
    }

    @Test
    void getInterestRate() {
        testCase1.setInterestRate(.052);
        assertEquals(0.052, testCase1.getInterestRate());
    }

    @Test
    void setInterestRate() {
        testCase1.setInterestRate(0.075);
        assertEquals(0.075, testCase1.getInterestRate());
    }


}