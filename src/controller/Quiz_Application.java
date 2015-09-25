package controller;

import java.util.ArrayList;

import view.QuizView;
import view.MainMenuView;

import model.Question;
// delete this import, it wont be needed later
import model.Quiz;

public class Quiz_Application {
  
  private static MainMenuView mainMenu;
  private static Quiz_Controller qc;

  /** 
  * Launch the application.
   */
  public static void main(String[] args) {
    
    /** 
     * Just testing parsing here. delete this later
     *  */
    
    Quiz quiz = new Quiz("Parsing Test");
    quiz.parseQuestions();

    ArrayList<Question> questions = quiz.getQuestions();
    
   
      mainMenu = new MainMenuView();
      qc = new Quiz_Controller(mainMenu);
      
      
    
/****    This just tests the quizview class  ***
    QuizView qv = new QuizView();  
    try 
    {
      qv.setVisable(true);
    } 
    catch (Exception e) 
    {
      e.printStackTrace();
    }
    qv.initialize();
*/    
  }     
}