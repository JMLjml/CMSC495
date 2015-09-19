/* Caroline Ganier */
package view;

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
  
  
  /**
   * Create the Main Menu View.
   */
  public MainMenuView() {
    initialize();
  }
  
  
  // Public helper method used to toggle viability of main menu
  public void setVisable(boolean visable) {
    this.frame.setVisible(visable);
  }
  

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    // Playing around with buttons and action listeners
    btnQuit = new JButton("Quit");
    btnQuit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("You pressed the quit button");
      }
    });
    frame.getContentPane().add(btnQuit, BorderLayout.WEST);
    
    btnStart = new JButton("Start");
    btnStart.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("You pressed the start button");
      }
    });    
    frame.getContentPane().add(btnStart, BorderLayout.EAST);
  }
}
