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
    Quiz_Controller.displayNextQuestion();    
    String correct = new String(Quiz_Controller.getCurrentQuestion().getAnswerText());    
    assertTrue(qc.checkAnswer(correct));
    }

  // Test when the user has the wrong answer
  @Test
  public void testCheckAnswer_Wrong() {
    Quiz_Controller.displayNextQuestion(); 
    String wrong = "garbage";
    assertFalse(qc.checkAnswer(wrong));
  }

  
  /** reads in the current score, checks a known correct answer and then tests
   *  that the score has been ++'d
  */
  @Test
  public void testUpdateScores() {
    int score = qc.getCurrentScoreAsInt();
    String correct = new String(Quiz_Controller.getCurrentQuestion().getAnswerText());
    qc.checkAnswer(correct);
    
    assertEquals(score + 1, qc.getCurrentScoreAsInt());    
  }
}

