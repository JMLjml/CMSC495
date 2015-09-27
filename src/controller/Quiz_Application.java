/** 
 * Quiz_Application.java
 * 
 * Runs and contains the main methofd for the Dino Quiz application.
 * 
 * Author(s):
 * 
 * John Lasheski
 * Caroline Ganier
 * 
 */
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
      mainMenu = new MainMenuView();
      qc = new Quiz_Controller(mainMenu);
  }     
}