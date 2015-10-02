/** 
 * Quiz.java
 * 
 * Provides basic model functionality for the Dino Quiz Application.
 * 
 * Author(s):
 * 
 * John Lasheski - Basic design and initial method stub creation, also contributed
 *                 to the parsing method
 * 
 * Joe Dain - Parsing method and file IO
 * 
 */

package model;

import java.util.ArrayList;
import model.Question;
import model.Quiz;

public class Quiz {
  private String name;
  private int score = 0;
  private ArrayList<Question> questions;  
   
  public Quiz(String name) {
    this.name = name;
    this.questions = new ArrayList<Question>();
    
    model.QuestionParser.parseQuestions(questions);   
  }  

  public String toString() {
    return this.name;
  }
  
  public ArrayList<Question> getQuestions() {
    return this.questions;
  }
  
  public void initScore() { //Used to reset score for each quiz - Added by Wayne Tolson
    score = 0;
  }
    
  public int getScore() {
    return this.score;
  }
  
  public void setScore() {
    score++;
  }
  
  public Question getQuestion(int index) {
    return questions.get(index);
  } 
}
