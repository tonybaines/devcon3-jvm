package demo;

import org.junit.*;
import static org.junit.Assert.*;

public class LogicTest {
  Logic logic = new Logic();

  @Test public void shouldDoNOTLogic() {
    assertEquals(true, logic.not(false));
    assertEquals(false, logic.not(true));
  }
  
  @Test public void shouldDoANDLogic() {
    assertEquals(true, logic.and(true,true));
    assertEquals(false, logic.and(true,false));
    assertEquals(false, logic.and(false,true));
    assertEquals(false, logic.and(false,false));
  }

  @Test public void shouldDoORLogic() {
    assertEquals(true, logic.or(true,true));
    assertEquals(true, logic.or(true,false));
    assertEquals(true, logic.or(false,true));
    assertEquals(false, logic.or(false,false));
  }

  @Test public void shouldDoXORLogic() {
    assertEquals(false, logic.xor(true,true));
    assertEquals(true, logic.xor(true,false));
    assertEquals(true, logic.xor(false,true));
    assertEquals(false, logic.xor(false,false));
  }
}
