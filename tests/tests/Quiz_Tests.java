/**
 * Quiz_Tests.java
 * 
 * Junit tests for the Quiz.java class
 * 
 * Author(s):
 * 
 * John Lasheski
 */


package tests;

import static org.junit.Assert.*;
import model.Quiz;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class Quiz_Tests {
  
  Quiz quiz; 
  
  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {
    this.quiz = new Quiz("DUMMY");
  }

  /**
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testToString() {
    assertEquals("DUMMY", quiz.toString());
  }

  @Test
  public void testConstructor() {
      assertEquals("DUMMY", quiz.toString());
      assertEquals(0, quiz.getScore());
  }
  
  @Test
  public void testParseQuestions() {
    quiz.parseQuestions();
    assertNotEquals(null, quiz.getQuestions());
  }
  
  @Test
  public void testGetScore() {
    Quiz ScoreTestQuiz = new Quiz("ScoreTest");
    assertEquals(0, ScoreTestQuiz.getScore());
  }
  
  @Test
  public void testSetScore() {
    Quiz ScoreTestQuiz = new Quiz("ScoreTest");
    assertEquals(0, ScoreTestQuiz.getScore());
    ScoreTestQuiz.setScore();
    assertEquals(1, ScoreTestQuiz.getScore());
  }
}
