/** 
 * Question.java
 * 
 * Object class designed to hold one question. Will be used by the Quiz.java class to 
 * provide basic model functionality for the Dino Quiz Application.
 * 
 * Author(s):
 * 
 * John Lasheski
 * 
 */
package model;

import java.util.ArrayList;

public class Question {
  
  public enum QuestionTypeEnum {
    MULTIPLE_CHOICE, TRUE_FALSE
  }
  
  private QuestionTypeEnum questionType;
  private String questionText;
  private String answerText;
  private ArrayList<String> multipleChoiceOptions;
  
  /* Constructor
   * 
   * Still needs error checks and exception throwing ability
   */
  public Question(QuestionTypeEnum questionType, String questionText,
      String answerText, ArrayList<String> multipleChoiceOptions) {
    
    this.questionType = questionType;
    this.questionText = questionText;
    this.answerText = answerText;
    
    // Check to see if it is a multiple choice question
    if(this.questionType == QuestionTypeEnum.MULTIPLE_CHOICE) {
      this.multipleChoiceOptions = multipleChoiceOptions;
    } else {
      this.multipleChoiceOptions = null;
    }    
  }
  
  public String getQuestionText() {
    return this.questionText;
  }
  
  public  String getAnswerText() {
    return this.answerText;
  }
  
  public ArrayList<String> getMultipleChoiceOptions() {
    return this.multipleChoiceOptions;
  }
  
  public QuestionTypeEnum getQuestionType() {
    return this.questionType;
  }
}
