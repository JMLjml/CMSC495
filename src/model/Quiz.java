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

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import view.QuizView;
import model.Question.QuestionTypeEnum;
import model.Question;
import model.Quiz;

public class Quiz {
  private String name;
  private int score = 0;
  private static ArrayList<Question> questions = null;
  
   
  public Quiz(String name) {
    this.name = name;
  }
  

public String toString() {
    return this.name;
  }
  
  public static void parseQuestions() {
	  
	  System.out.println("Parsing Questions!");
	 
	        BufferedReader br = null;
	        String strLine = "";
	        try {
	            br = new BufferedReader( new FileReader("testFile.txt"));
	            while( (strLine = br.readLine()) != null){
	            	
	            	//Question.multipleChoiceOptions.clear();	   
	       
	            	String[] parts = strLine.split(";");
	            	
	            	Question.multipleChoiceOptions.add(parts[1]);
	            	Question.multipleChoiceOptions.add(parts[2]);
	            	Question.multipleChoiceOptions.add(parts[3]);
	            	Question.multipleChoiceOptions.add(parts[4]);            	

	            	
	            	Question q1 = new Question(QuestionTypeEnum.MULTIPLE_CHOICE,parts[0],parts[5],multipleChoiceOptions);
	            	
	            	System.out.println(q1.getQuestionText());
	            	System.out.println(q1.getAnswerText());
	            	System.out.println(q1.getQuestionType());
	            	System.out.println(q1.getMultipleChoiceOptions());
	            	
	            	//questions.add(q1);

	            	
	            }
	        } catch (FileNotFoundException e) {
	            System.err.println("Unable to find the file: fileName");
	        } catch (IOException e) {
	            System.err.println("Unable to read the file: fileName");
	        }	        
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
