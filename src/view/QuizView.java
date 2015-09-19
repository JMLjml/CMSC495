/*********
 * 
 * Class:           QuizView
 * Package:         view
 * 
 * Date Created:    9/18/2015
 * Created By:      Caroline Ganier
 * 
 * Last Update on:  9/18/2015
 * Last Updated by: Caroline Ganier
 * 
 * Description:     
 *      This class manages the user interface for each question of a quiz game. 
 *      
 * 
*********/

package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class QuizView {
    private JFrame frame;
    private JButton btnQuit;
    private JButton btnCheckAnswer;
    private JButton btnDisplayNextQuestion;
    
    public QuizView()
    {
        initialize();
    }
    
    public void setVisable(boolean visable)
    {
        this.frame.setVisible(visable);
    }
    
    private void initialize()
    {
        frame = new JFrame("QuizView");
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

        btnCheckAnswer = new JButton("Check Answer");
        btnCheckAnswer.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            System.out.println("You pressed the Check Answer button");
          }
        });    
        frame.getContentPane().add(btnCheckAnswer, BorderLayout.EAST);
        
        btnDisplayNextQuestion = new JButton("Next Question");
        btnDisplayNextQuestion.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            System.out.println("You pressed the Next Question button");
          }
        });    
        frame.getContentPane().add(btnDisplayNextQuestion, BorderLayout.SOUTH);

    }    
    
}
