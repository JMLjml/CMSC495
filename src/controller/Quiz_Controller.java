/** 
 * Quiz_Controller.java
 * 
 * Provides  controller functionality for the Dino Quiz Application.
 * 
 * Author(s):
 * 
 * John Lasheski - Basic design and initial method stub creation
 * 
 */

package controller;

import java.util.ArrayList;
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
    quizMenu = new QuizView();//thsi line starts the quiz screen
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

  public void displayNextQuestion() {};
  
  public boolean checkAnswer(String answer) {
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
