package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Application_Window {

  private JFrame frame;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    
    Quiz_Controller qc = new Quiz_Controller();
    
    qc.launchQuizGame();
    
    
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Application_Window window = new Application_Window();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public Application_Window() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

}