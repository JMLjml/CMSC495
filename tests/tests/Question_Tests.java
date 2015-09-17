/** 
 * Question_Tests.java
 * 
 * JUnit tests for the Question.java class.
 * 
 * Author(s):
 * 
 * John Lasheski
 * 
 */

package tests;

import static org.junit.Assert.*;
import model.Question;
import model.Question.QuestionTypeEnum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Question_Tests {
  
  Question question;
  String questionText;
  String answerText; 
  
  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {
    this.questionText = new String("What is the name of the dino?");
    this.answerText = new String("T-Rex");
    this.question = new Question(QuestionTypeEnum.TRUE_FALSE, 
                                 this.questionText, this.answerText, null);
  }

  /**
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testConstructor() {
      fail("Not yet Implemented");
  }

  @Test
  public void testGetQuestionText() {
    String expected = new String("What is the name of the dino?");
    assertEquals(expected, this.question.getQuestionText());
  }

  @Test
  public void testGetAnswerText() {
    String expected = new String("T-Rex");
    assertEquals(expected, this.question.getAnswerText());
  }

  @Test
  public void testGetMultipleChoiceOptions() {
    fail("Not Yet Implemented");
  }

  @Test
  public void testGetQuestionType() {
      fail("Not Yet Implemented");
  }
}
