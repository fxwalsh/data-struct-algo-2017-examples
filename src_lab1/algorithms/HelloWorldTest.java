package algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {
  @Test
  public void testHello() {
    HelloWorldInterface hw = new HelloWorld();
    assertTrue(hw!=null);
    hw.display();
  }
}
