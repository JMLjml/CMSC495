package controller;

import java.util.ArrayList;

import model.Quiz;

public class Quiz_Controller {

  private ArrayList<Quiz> quizzes;
  private ArrayList<Integer> scores;
  private int currQuestion;
  
  public Quiz_Controller() {
    // TODO Auto-generated constructor stub
  }
  
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
