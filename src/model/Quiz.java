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
  private static ArrayList<Question> questions;  
   
  public Quiz(String name) {
    this.name = name;
    this.questions = new ArrayList<Question>();
  }
  

public String toString() {
    return this.name;
  }
  
  public static void parseQuestions() {
	  
	  System.out.println("Parsing Questions!");
	 
	        BufferedReader br = null;
	        String strLine = "";
	        try {
	            br = new BufferedReader( new FileReader("data/multiple_choice_formatted.txt"));
	            while( (strLine = br.readLine()) != null){
	              
	              Question question;
	              
	              QuestionTypeEnum questionType = null;
	            	
	            		       
	            	String[] parts = strLine.split(";");
	            	
	            	// Check to see if it is a multiple choice question, or if it is a true/false question
	            	if (parts[0].equals("M")) {	            	  
	            	  questionType = QuestionTypeEnum.MULTIPLE_CHOICE;	            	  
	            	} else if (parts[0].equals("T")) {
	            	  questionType = QuestionTypeEnum.TRUE_FALSE;	            	  
	            	} else {
	            	  // Invalid format, throw an exception here
	            	}
	            	
	            	
	            	
	            	if(questionType == QuestionTypeEnum.MULTIPLE_CHOICE) { // read in a multiple choice question
	            	  String questionText = parts[1];
	            	  
	            	  ArrayList<String> multipleChoiceOptions = new ArrayList<String>();
	            	  multipleChoiceOptions.add(parts[2]);
	            	  multipleChoiceOptions.add(parts[3]);
	            	  multipleChoiceOptions.add(parts[4]);
	            	  multipleChoiceOptions.add(parts[5]);
	            	  
	            	  String answerText = parts[6];
	            	  
	            	  question = new Question(questionType, questionText, answerText, multipleChoiceOptions);
	            	  
	            	  
	                
	            	  
	            	} else { // it must be a T/F question
	            	  
	            	  String questionText = parts[1];
	            	  String answerText = parts[2];
	            	  question = new Question(questionType, questionText, answerText, null);
	            	}
	            	
	            	System.out.println(question.getQuestionText());
                System.out.println(question.getAnswerText());
                System.out.println(question.getQuestionType());
                System.out.println(question.getMultipleChoiceOptions());
	            	
	            	
	            	
	            	questions.add(question);

	            	
	            }
	        } catch (FileNotFoundException e) {
	            System.err.println("Unable to find the file: fileName");
	        } catch (IOException e) {
	            System.err.println("Unable to read the file: fileName");
	        }	        
  }
  
  public ArrayList<Question> getQuestions() {
    return questions;
  }
  
  public int getScore() {
    return this.score;
  }
  
  public void setScore(int score) {
    this.score = score;
  }
}
