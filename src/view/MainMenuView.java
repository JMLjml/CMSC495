package view;

import controller.Quiz_Controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class MainMenuView {

  private JFrame frame;
  private JButton btnQuit, btnStart;
  
  private Quiz_Controller qController;
  
  /**
   * Create the Main Menu View.
   */
  public MainMenuView() {
    initialize();
  }
  
  //test - cGanier
  public void setControl(Quiz_Controller _qController)
  {
      qController = _qController;
  }
  
  // Public helper method used to toggle viability of main menu
  public void setVisable(boolean visable) {
          this.frame.setVisible(visable);
  }
  

  /**
   * Initialize the contents of the frame.
   */
  public void initialize() {
    frame = new JFrame("Main Menu");
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    // Playing around with buttons and action listeners
    btnQuit = new JButton("Quit");
    
    frame.getContentPane().add(btnQuit, BorderLayout.WEST);
    btnQuit.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        frame.setVisible(false);
        frame.dispose();
        System.out.println("You pressed the quit button");
      }
    });  
    
    btnStart = new JButton("Start");
    btnStart.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        setVisable(false);
        qController.launchQuizGame();
        System.out.println("You pressed the start button");
      }
    });    
    frame.getContentPane().add(btnStart, BorderLayout.EAST);
  }
}
