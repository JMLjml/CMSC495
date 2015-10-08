/************   
 * 
 *      Class:         QuestionParser.java
 *      Package:       model
 *      Created on:    September, 2015 
 * 
 *      Author(s):     
 *          John Lasheski   - Basic design and initial method stub creation, 
 *                            also contributed to the parsing method
 *          Joe Dain        - Parsing method and file IO
 *          Caroline Ganier - pop up window for IO error
 * 
 *      Class Description:
 *          Parses Questions objects from a flat text file for the Quiz class 
 *          to use.
 * 
 ************/
package model;

import java.awt.Window;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import model.Question.QuestionTypeEnum;
import model.Question;
import view.MainMenuView;

public class QuestionParser {
    
  javax.swing.JPanel _winRef;
  
  public static void parseQuestions(ArrayList<Question> questions) {
    System.out.println("Parsing Questions!");
       
    BufferedReader br = null;
    String strLine = "";
   
    try {
      br = new BufferedReader( new FileReader("data/questionList.txt"));
      while( (strLine = br.readLine()) != null) {
        Question question;
        QuestionTypeEnum questionType = null;
                
        String[] parts = strLine.split(";");
                
        // Check to see if it is a multiple choice question, or if it is a true/false question
        if (parts[0].equals("M")) {
          questionType = QuestionTypeEnum.MULTIPLE_CHOICE;
        
        } else if (parts[0].equals("T")) {
          questionType = QuestionTypeEnum.TRUE_FALSE;
        
        } else {
            // Invalid format, throw an exception here
        }
                              
                
        if(questionType == QuestionTypeEnum.MULTIPLE_CHOICE) { // read in a multiple choice question
          String questionText = parts[1];
               
          ArrayList<String> multipleChoiceOptions = new ArrayList<String>();
          multipleChoiceOptions.add(parts[2]);
          multipleChoiceOptions.add(parts[3]);
          multipleChoiceOptions.add(parts[4]);
          multipleChoiceOptions.add(parts[5]);
                  
          String answerText = parts[6];
                  
          question = new Question(questionType, questionText, answerText, multipleChoiceOptions);
                  
                  
        } else { // it must be a T/F question
                  
          String questionText = parts[1];
          String answerText = parts[2];
          question = new Question(questionType, questionText, answerText, null);
        }
                
              
        questions.add(question);
        
      }
      
    } catch (FileNotFoundException e) {
      //pop up window added by cGanier
      javax.swing.JPanel _jPanel1 = new javax.swing.JPanel();
      _jPanel1.setBackground(new java.awt.Color(102, 153, 255));
      System.err.println("Unable to find the file: fileName");
      JOptionPane.showMessageDialog(_jPanel1, "Unable to find the file: fileName");
      
    } catch (IOException e) {
      System.err.println("Unable to read the file: fileName");
      //pop  up window added by cGanier
      javax.swing.JPanel _jPanel1 = new javax.swing.JPanel();//create a temp container
      _jPanel1.setBackground(new java.awt.Color(102, 153, 255));
      JOptionPane.showMessageDialog(_jPanel1, "Unable to find the file: fileName");
    }  
  }
}