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


  @Test
  public void testConstructor() {
    fail("Not Yet Implemented");
  }

  @Test
  public void testLaunchQuizGame() {
    fail("Not Yet Implemented");
  }

  // Write to file is successful
  @Test
  public void writeScores_Succeed() {
    assertEquals(true, qc.writeScores());
  }

  // Write to file is unsuccessful
  @Test
  public void writeScores_Fail() {
    assertEquals(false, qc.writeScores());
  }

  @Test
  public void testDisplayNextQuestion() {
    fail("not Yet Implemented");
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
  public void testStartQuiz() {
    fail("not Yet Implemented");
  }

  // Test a successful quiz load
  @Test
  public void testLoadQuiz_Successful() {
    fail("Not Yet Implemnted");
  }

  // Test an unsuccessful quiz load
  @Test
  public void testLoadQuiz_Unsuccessful() {
    fail("Not Yet Implemnted");
  }

  @Test
  public void testUpdateScores() {
    fail("Not Yet Implemented");
  }
}

