package controller;

import view.MainMenuView;
import view.QuizView;

public class Quiz_Application {
  
  private static MainMenuView mainMenu;
  private static Quiz_Controller qc;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    mainMenu = new MainMenuView();
    qc = new Quiz_Controller(mainMenu);
    
//    qc.launchQuizGame();
/*
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
