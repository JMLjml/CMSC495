package controller;

import java.util.ArrayList;

import java.awt.EventQueue;

import view.MainMenuView;
import model.Quiz;

public class Quiz_Controller {

  private ArrayList<Quiz> quizzes;
  private ArrayList<Integer> scores;
  private int currQuestion;
  private MainMenuView mainMenu;
  
  public Quiz_Controller(MainMenuView mainMenu) {
    this.mainMenu = mainMenu;
    // TODO Auto-generated constructor stub
  }
  
  public void launchQuizGame() {
    System.out.println("This is the main entry point for the whole system");
    
    System.out.println("Launch the main menu view here");
    
    try {
      
      this.mainMenu.setVisable(true);
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    
  };
  
  public ArrayList<Integer> getScores() {
    return this.scores;
  }
  
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
