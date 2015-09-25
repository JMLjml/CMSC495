/** 
 * Quiz_Controller.java
 * 
 * Provides  controller functionality for the Dino Quiz Application.
 * 
 * Author(s):
 * 
 * John Lasheski - Basic design and initial method stub creation
 * Joseph Dain - nextQuestion Logic
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
      System.out.println("Reached next question method");
      
      Random rn = new Random();
      int randQuestion = rn.nextInt(20 - 0 + 1) + 0;
      
      view.QuizView.setQuestionLabel(model.Quiz.getQuestions().get(randQuestion).getQuestionText());
  }
  
  
  public boolean checkAnswer(String answer) {
      System.out.println("Answer: " + answer);
    return false;
  }
  
  public void startQuiz(String name) {};

  private boolean loadQuiz(String name) {
    return false;
  }
  
  private void updateScores() {};
  

  //Dummy Method to get unit testing working
  public String toString() {
    return "Quiz Controller";
  }
  
}