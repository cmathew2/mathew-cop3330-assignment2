package ex24;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
      public void is_Anagram_True(){

        boolean given = App.isAnagram("note", "tone");

        assertEquals(true, given);
    }
     @Test
     public void is_Anagram_False1() {

         boolean given = App.isAnagram("apple", "app");

         assertEquals(false, given);
     }
     @Test
     public void is_Anagram_False2() {

         boolean given = App.isAnagram("depart", "arrive");

         assertEquals(false, given);
     }
}
