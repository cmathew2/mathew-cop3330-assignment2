package ex25;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void very_Weak_Password(){
        int given = App.passwordValidator("12345");

        assertEquals(0, given );
    }
    @Test
    public void Weak_Password(){
        int given = App.passwordValidator("abcdef");

        assertEquals(1, given );
    }
    @Test
    public void Strong_Password(){
        int given = App.passwordValidator("123abcxyz");

        assertEquals(2, given );
    }
    @Test
    public void very_Strong_Password(){
        int given = App.passwordValidator("1337h@xor!");

        assertEquals(3, given );
    }
}
