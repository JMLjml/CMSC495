/** 
 * Quiz.java
 * 
 * Provides basic model functionality for the Dino Quiz Application.
 * 
 * Author(s):
 * 
 * John Lasheski - Basic design and initial method stub creation
 * 
 */

package model;

import java.util.ArrayList;

public class Quiz {
  private String name;
  private int score = 0;
  private ArrayList<Question> questions = null;
  
   
  public Quiz(String name) {
    this.name = name;
  }
  
  public String toString() {
    return this.name;
  }
  
  private void parseQuestions() {
  
  }
  
  public ArrayList<Question> getQuestions() {
    ArrayList<Question> questions = null;
    return questions;
  }
  
  public int getScore() {
    return this.score;
  }
  
  public void setScore(int score) {
    this.score = score;
  }
}
