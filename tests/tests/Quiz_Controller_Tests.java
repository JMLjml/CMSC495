/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import controller.Quiz_Controller;
/**
 * @author john
 *
 */
public class Quiz_Controller_Tests {

  Quiz_Controller qc = new Quiz_Controller();
  
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
   * Test method for {@link java.lang.Object#toString()}.
   */
  @Test
  public void testToString() {
    assertEquals("Quiz Controller", qc.toString());
  }

}
