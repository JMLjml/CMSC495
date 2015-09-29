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
import javax.swing.JOptionPane;//added by cGanier
import javax.swing.JPanel;

import view.MainMenuView;
import view.QuizView;
import model.Question;
import model.Question.QuestionTypeEnum;
import model.Quiz;
import view.MainMenuView;

public class Quiz_Controller {

  //private ArrayList<Quiz> quizzes;
  private static Quiz quiz;
  private Question currQuestion;
  private MainMenuView mainMenu;
  private QuizView quizMenu;//added by cGanier
  private boolean gameLaunched = false;//added by cGanier
  private int gamesLaunched = 0;//added by cGanier
  
  static Random rn = new Random();
  static int randQuestion = getRandomQuestionNumber();
  static Question currentQuestion;
  
  public Quiz_Controller(MainMenuView _mainMenu) {
    this.mainMenu = _mainMenu;
    mainMenu.setVisible(true);
    mainMenu.setControl(this);
    this.quiz = new Quiz("Random");
  }
  
  public void launchQuizGame() {
    gameLaunched = true;//added by cganier.  used in check score method.
    gamesLaunched++;//added by cganier.  used in check score method.
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
  
 public void scorePopUp(JPanel _jPan)
 //causes a pop up with #correct/#answered and an okay button
 //added by cGanier
 {
     if (gamesLaunched > 1)//played more then onen game, list highest and current score
         JOptionPane.showMessageDialog(_jPan, "You have played " + Integer.toString(gamesLaunched) 
                 + " games.\n" + this.getHighScore() + this.getCurrentScore());
     else 
         if (gamesLaunched == 1)//one game has been played, list current score only
            JOptionPane.showMessageDialog(_jPan, this.getCurrentScore());
         else//no games played
            JOptionPane.showMessageDialog(_jPan, "You must start the game before checking your score.");
 }
 
 public String getCurrentScore()
 {
     String _temp = "Your current score is " + Integer.toString(quiz.getScore()) + " out of " 
                     + Integer.toString(quizMenu.getQuestionCount()) + ".";
     return _temp;
 }
 
 public String getHighScore()
 {
     String _temp;
     _temp = "Your high score is " + "*insert high score here*" + ".\n";
     return _temp;
 }
 
  
  public boolean writeScores() {
    return false;
  }

  public static void displayNextQuestion() {
    System.out.println("Reached next question method");
    	  
    // Get new random question
    randQuestion = getRandomQuestionNumber();
      
    currentQuestion = quiz.getQuestion(randQuestion);
    
    //Display questionType
    System.out.println(currentQuestion.getQuestionType());
      
    //if the current question is multiple choice
    if(currentQuestion.getQuestionType() == QuestionTypeEnum.MULTIPLE_CHOICE) {
      
      // make buttons 3 and 4 show up
      view.QuizView.jRadioButton3.setVisible(true);
   	  view.QuizView.jRadioButton4.setVisible(true); 
    	 
   	  // read in the question text
      view.QuizView.setQuestionLabel(currentQuestion.getQuestionText());
      
      // set the text for multiple choice options     
      view.QuizView.setRadioBtn1Text(currentQuestion.getMultipleChoiceOptions().get(0));
      view.QuizView.setRadioBtn2Text(currentQuestion.getMultipleChoiceOptions().get(1));
      view.QuizView.setRadioBtn3Text(currentQuestion.getMultipleChoiceOptions().get(2));
      view.QuizView.setRadioBtn4Text(currentQuestion.getMultipleChoiceOptions().get(3));
      
    
    } else {
      
      // read in the question text
      view.QuizView.setQuestionLabel(currentQuestion.getQuestionText());
    	  
      // label the buttons true false and hide the rest
    	view.QuizView.setRadioBtn1Text("True");
    	view.QuizView.setRadioBtn2Text("False");
    	view.QuizView.jRadioButton3.setVisible(false);
    	view.QuizView.jRadioButton4.setVisible(false);
    }
  }


  public boolean checkAnswer(String answer) {
  
    if(answer.equals(currentQuestion.getAnswerText())) {
      System.out.println("YOU GOT IT CORRECT, AWESOME!!!");
      updateScores();
      return true;    
    } else {
      System.out.println("YOU GOT IT WRONG, NOT AWESOME!!!");
      //Dont add to score
      return false;    
    }
  }
	   
  private void updateScores() {
	  System.out.println("Getting ready to add score!");
	  model.Quiz.setScore();	  
  }  
  
  //generates random number from 0 to 39
  public static int getRandomQuestionNumber(){
    return rn.nextInt(39) + 1;
  }
  
  //Dummy Method to get unit testing working
  public String toString() {
    return "Quiz Controller";
  }
  
}