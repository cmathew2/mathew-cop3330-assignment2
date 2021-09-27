package ex31;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void targetHeartRate55Intensity() {
        double given = Karonven.TargetRate(65, 55,22);
        assertEquals(138, given);
    }
    @Test
    public void targetHeartRate0() {
        double given = Karonven.TargetRate(0, 0,0);
        assertEquals(0, given);
    }
    @Test
    public void targetHeartRate60Intensity() {
        double given = Karonven.TargetRate(65, 60,22);
        assertEquals(145, given);
    }
}
