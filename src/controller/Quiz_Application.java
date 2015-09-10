package controller;

import view.MainMenuView;

public class Quiz_Application {

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    
    MainMenuView mainMenu = new MainMenuView();
    
    Quiz_Controller qc = new Quiz_Controller(mainMenu);
    
    qc.launchQuizGame();
  }
}
