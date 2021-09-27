package ex27;

import org.junit.Test;

import static ex27.App.*;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void is_Code_Working() {
        firstName = "John";
        lastName = "Johnson";
        inputZIP = "55555";
        inputID = "TK-4321";

        validateInput();

        assertEquals("There were no errors found.", output);

    }
}
