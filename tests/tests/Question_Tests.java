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

import java.util.ArrayList;

import model.Question;
import model.Question.QuestionTypeEnum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Question_Tests {
  
  Question question;
  String questionText;
  String answerText;
  ArrayList<String> multipleChoiceOptions = new ArrayList<String>();
  
  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {
    this.questionText = new String("The Koreaceratops is thought to have been a(n)  _________.");
    this.answerText = new String("D");
    this.multipleChoiceOptions.add("omnivore");
    this.multipleChoiceOptions.add("carnivore");
    this.multipleChoiceOptions.add("herbivore");
    this.multipleChoiceOptions.add("strong swimmer");
    this.question = new Question(QuestionTypeEnum.MULTIPLE_CHOICE, 
                                 this.questionText, this.answerText, this.multipleChoiceOptions);
  }

  /**
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testGetQuestionText() {
    String expected = new String("The Koreaceratops is thought to have been a(n)  _________.");
    assertEquals(expected, this.question.getQuestionText());
  }

  @Test
  public void testGetAnswerText() {
    String expected = new String("D");
    assertEquals(expected, this.question.getAnswerText());
  }

  @Test
  public void testGetMultipleChoiceOptions() {
    ArrayList<String> expected = new ArrayList<String>();
    expected.add("omnivore");
    expected.add("carnivore");
    expected.add("herbivore");
    expected.add("strong swimmer");
    assertEquals(expected, this.question.getMultipleChoiceOptions());
  }

  @Test
  public void testGetQuestionType() {
      QuestionTypeEnum expected = QuestionTypeEnum.MULTIPLE_CHOICE;
      assertEquals(expected, this.question.getQuestionType());
  }
}
