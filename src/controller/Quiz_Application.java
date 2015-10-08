/************   
 * 
 *      Class:         Quiz_Application.java
 *      Package:       controller
 *      
 *      Created on:    September, 2015 
 *      Author(s):     
 *          John Lasheski   - Basic design and initial method stub creation
 *          Caroline Ganier - Class calls
 *     
 *      Class Description:
 *          Runs and contains the main method for the Dino Quiz application.
 * 
 ************/
package controller;

import view.MainMenuView;

public class Quiz_Application {
  
  private static MainMenuView mainMenu;
  private static Quiz_Controller qc;
 
  //Launch the application.
  public static void main(String[] args) {
      mainMenu = new MainMenuView();//creates Main Menu Instance
      qc = new Quiz_Controller(mainMenu);//Launches game;passes Main menu Window
  }     
}