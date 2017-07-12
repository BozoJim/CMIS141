package cmis141.test;

import cmis141.week4.LoanCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by jstok on 7/10/2017.
 */
class LoanCalculatorTest {


    LoanCalculator testCase1 = new LoanCalculator(50000, 6, 0.03);

    @Test
    void testCaseOne() {
        System.out.println(testCase1.toString());
    }

    @Test
    void getLoanAmount() {
        assertEquals(.03, testCase1.getInterestRate());
    }

    @Test
    void setLoanAmount() {
    }

    @Test
    void getLoanTermInYears() {
    }

    @Test
    void setLoanTermInYears() {
    }

    @Test
    void getLoanTermInMonths() {
    }

    @Test
    void setLoanTermInMonths() {
    }

    @Test
    void getInterestRate() {
    }

    @Test
    void setInterestRate() {
    }


}