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
  
  public Question(QuestionTypeEnum questionType, String questionText,
      String answerText, ArrayList<String> multipleChoiceOptions) {
    
    this.questionText = questionText;
    this.answerText = answerText; 
  }
  
  public String getQuestionText() {
    return this.questionText;
  }
  
  public String getAnswerText() {
    return this.answerText;
  }
  
  public ArrayList<String> getMultipleChoiceOptions() {
    return this.multipleChoiceOptions;
  }

  public QuestionTypeEnum getQuestionType() {
    return this.questionType;
  }
}
