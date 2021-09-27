package ex26;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void calculate_70_Months_Until_PaidOff() {
        double balance = 5000;
        double apr = 12;
        double payment = 100;

        int given = PaymentCalculator.calculateMonthsUntilPaidOff(balance, apr, payment);

        assertEquals(70, given);
    }

    @Test
    public void calculate_0_Months_Until_PaidOff() {
        double balance = 0;
        double apr = 0;
        double payment = 0;

        int given = PaymentCalculator.calculateMonthsUntilPaidOff(balance, apr, payment);

        assertEquals(0, given);
    }
}
