/** 
 * Quiz_Controller.java
 * 
 * Provides  controller functionality for the Dino Quiz Application.
 * 
 * Author(s):
 * 
 * John Lasheski - Basic design and initial method stub creation
 * Joseph Dain - nextQuestion Logic
 * Joseph Dain - checkAnswer Logic
 */

package controller;

import java.util.ArrayList;
import java.util.Random;
import java.awt.EventQueue;

import view.MainMenuView;
import view.QuizView;
import model.Question;
import model.Quiz;
import view.MainMenuView;

public class Quiz_Controller {

  private ArrayList<Quiz> quizzes;
  private Question currQuestion;
  private MainMenuView mainMenu;
  private QuizView quizMenu;//added by cGanier
  
  static Random rn = new Random();
  static int randQuestion = getRandomQuestionNumber();
  
  public Quiz_Controller(MainMenuView _mainMenu) {
    this.mainMenu = _mainMenu;
    mainMenu.setVisible(true);
    mainMenu.setControl(this);
  }
    
  
  public void launchQuizGame() {
    System.out.println("This is the main entry point for the whole system");
    System.out.println("Launch the main menu view here");
    quizMenu = new QuizView(this);//this line starts the quiz screen
    displayNextQuestion();
            
    try 
    {
      quizMenu.setVisible(true);
    } 
    catch (Exception e) 
    {
      e.printStackTrace();
    }
  };
  
 
  
  public boolean writeScores() {
    return false;
  }

  public static void displayNextQuestion() 
  {  
      
      ArrayList<String> currentMultipleChoiceOptions;
      
      Question currentQuestion;
      
    	  System.out.println("Reached next question method");
    	  
    	  //move up from line 97--Bradley Wetzel
    	  randQuestion = getRandomQuestionNumber();
      
      currentQuestion = new Question(model.Quiz.getQuestions().get(randQuestion).getQuestionType(),
    		  model.Quiz.getQuestions().get(randQuestion).getQuestionText(), 
    		  model.Quiz.getQuestions().get(randQuestion).getAnswerText(), 
    		  model.Quiz.getQuestions().get(randQuestion).getMultipleChoiceOptions());    
      
      //Display questionType
      System.out.println(currentQuestion.getQuestionType());
      
     //if(model.Quiz.getQuestions().get(randQuestion).getQuestionType().toString() == "MULTIPLE_CHOICE"){
           
     //view.QuizView.jRadioButton3.setVisible(true);
   	  //view.QuizView.jRadioButton4.setVisible(true); 
    	 
      view.QuizView.setQuestionLabel(currentQuestion.getQuestionText());
      
      currentMultipleChoiceOptions = model.Quiz.getQuestions().get(randQuestion).getMultipleChoiceOptions();    
     
      view.QuizView.setRadioBtn1Text(currentMultipleChoiceOptions.get(0));
      view.QuizView.setRadioBtn2Text(currentMultipleChoiceOptions.get(1));
      view.QuizView.setRadioBtn3Text(currentMultipleChoiceOptions.get(2));
      view.QuizView.setRadioBtn4Text(currentMultipleChoiceOptions.get(3));     
      
      //Get new random question
      
     /* }else{
    	  view.QuizView.setRadioBtn1Text("True");
    	  view.QuizView.setRadioBtn2Text("False");
    	  view.QuizView.jRadioButton3.setVisible(false);
    	  view.QuizView.jRadioButton4.setVisible(false);
    	  
    	 //Get new random question
          randQuestion = getRandomQuestionNumber();
      }*/
      
  }


public boolean checkAnswer(String answer) {
	
	String answerVar = null;
	
	if(view.QuizView.getAnswer() == "1"){
		answerVar = "A";
	}
	if(view.QuizView.getAnswer() == "2"){
		answerVar = "B";
	}
	if(view.QuizView.getAnswer() == "3"){
		answerVar = "C";
	}
	if(view.QuizView.getAnswer() == "4"){
		answerVar = "D";
	}
	
	System.out.println("answerVar: " + answerVar);
	System.out.println("Actual Answer: " + model.Quiz.getQuestions().get(randQuestion).getAnswerText());
	
	if(answerVar.equalsIgnoreCase(model.Quiz.getQuestions().get(randQuestion).getAnswerText())){
		//Add to score
		updateScores();
		System.out.println("YOU GOT IT CORRECT, AWESOME!!!");
		return true;
	}else{
		System.out.println("YOU GOT IT WRONG, NOT AWESOME!!!");
		//Dont add to score
	}
	
      //System.out.println("Answer: " + answerVar);
    return false;
  }
  
  public void startQuiz(String name) {};

  private boolean loadQuiz(String name) {
    return false;
  }
  
  private void updateScores() {
	  System.out.println("Getting ready to add score!");
	  //model.Quiz.setScore();
  };
  
public static int getRandomQuestionNumber(){
	return rn.nextInt(20) + 1;
}
  
  //Dummy Method to get unit testing working
  public String toString() {
    return "Quiz Controller";
  }
  
}