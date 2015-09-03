/**
 * 
 */
package tests;

import static org.junit.Assert.*;
import model.Quiz;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author john
 *
 */
public class Quiz_Tests {
  
  model.Quiz quiz = new Quiz("DUMMY");
  
  int expected = 7;

  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {
  }

  /**
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception {
  }

  /**
   * Test method for {@link model.Quiz#dummyTestStub()}.
   */
  @Test
  public void testDummyTestStub() {
    assertEquals(expected, quiz.dummyTestStub());
    
  }

  /**
   * Test method for {@link java.lang.Object#toString()}.
   */
  @Test
  public void testToString() {
    assertEquals("DUMMY", quiz.toString());
  }

}
