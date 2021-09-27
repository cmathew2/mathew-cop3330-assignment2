package ex28;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void Sum_12345(){
        int[] given = {1, 2, 3, 4, 5};
        int result = App.loopSum(given);

        assertEquals(15, result);
    }

    @Test
    public void Sum_11111(){
        int[] given = {1, 1, 1, 1, 1};
        int result = App.loopSum(given);

        assertEquals(5, result);
    }

    @Test
    public void Sum_00000(){
        int[] given = {0, 0, 0, 0, 0};
        int result = App.loopSum(given);

        assertEquals(0, result);
    }
}
