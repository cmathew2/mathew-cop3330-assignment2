package ex33;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void answer1() {

        assertEquals("Yes", App.magicBall(0));
    }

    @Test
    public void answer2() {

        assertEquals("No", App.magicBall(1));
    }

    @Test
    public void answer3() {;

        assertEquals("Maybe", App.magicBall(2));
    }

    @Test
    public void answer4() {

        assertEquals("Ask again later", App.magicBall(3));
    }
}
