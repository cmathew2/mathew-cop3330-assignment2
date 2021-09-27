package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void calculateYears_4_18() {
        App app = new App();
        double rate = 4;
        int years = App.yearsTillDouble(rate);
        assertEquals(18,years);
    }

    @Test
    public void calculateYears_6_12() {
        App app = new App();
        double rate = 6;
        int years = App.yearsTillDouble(rate);
        assertEquals(12,years);
    }
}
