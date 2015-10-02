/** 
 * Quiz_Controller_Tests.java
 * 
 * JUnit tests for the Quiz_Controller.java class.
 * 
 * Author(s):
 * 
 * John Lasheski
 * 
 */
package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import view.MainMenuView;
import controller.Quiz_Controller;

public class Quiz_Controller_Tests {
  
  private MainMenuView mainMenu;

  private Quiz_Controller qc;
  
  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {
      this.mainMenu = new MainMenuView();
      this.qc = new Quiz_Controller(this.mainMenu);
  }

  /**
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception {
  }

 
  @Test
  public void testToString() {
    assertEquals("Quiz Controller", qc.toString());
  }


  // Test when the user has the right answer
  @Test
  public void testCheckAnswer_Correct() {
    fail("Not Yet Implemented");
  }

  // Test when the user has the wrong answer
  @Test
  public void testCheckAnswer_Wrongt() {
    fail("Not Yet Implemented");
  }

  
  @Test
  public void testUpdateScores() {
    fail("Not Yet Implemented");
  }
}

