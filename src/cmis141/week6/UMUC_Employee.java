package cmis141.week6;

/**
 * Created by jstok on 7/26/2017.
 */
public class UMUC_Employee {
    private double payRate = 0.0;
    private double hoursWorked = 0.0;
    private double pay = 0.0;

    private UMUC_Employee() {
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    private void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    private void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    private double calculatePay(){
        pay = payRate * hoursWorked;
        return pay;
    }

    public static void main(String[] args) {
        UMUC_Employee jane = new UMUC_Employee();
        UMUC_Employee tom = new UMUC_Employee();
        double pay = 0.0;

        jane.setPayRate(19.95);
        jane.setHoursWorked(38.0);
        pay = jane.calculatePay();
        System.out.println("Jane is owed " + pay);// OUTPUT

        tom.setPayRate(20.54);
        tom.setHoursWorked(42.0);
        pay = tom.calculatePay();
        System.out.println("Tom is owed " + pay);


    }
}
