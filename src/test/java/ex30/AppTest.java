package ex30;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void Is_100_in_the_Table() {
        int given = App.product(10, 10);
        assertEquals(100, given);
    }
}
