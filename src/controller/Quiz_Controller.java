/** 
 * Quiz_Controller.java
 * 
 * Provides  controller functionality for the Dino Quiz Application.
 * 
 * Author(s):
 * 
 * John Lasheski - Basic design and initial method stub creation, displayNextQuestion
 *                 updateScore logic, checkEndOfQuiz logic
 * Joseph Dain - nextQuestion Logic
 * Joseph Dain - checkAnswer Logic
 * Wayne Tolson - highScore dialogue
 * 
 */

package controller;


import java.util.Random;
import javax.swing.JOptionPane;//added by cGanier
import javax.swing.JPanel;
import view.MainMenuView;
import view.QuizView;
import model.Question;
import model.Question.QuestionTypeEnum;
import model.Quiz;


public class Quiz_Controller {

  private static Quiz quiz;
  private MainMenuView mainMenu;
  private QuizView quizMenu;//added by cGanier
 // private boolean gameLaunched = false;//added by cGanier
  private int gamesLaunched = 0;//added by cGanier
  private int highScore = 0;
  private static int questionCount = 0;
  
  static Random rn = new Random();
  static int randQuestion = getRandomQuestionNumber();
  static Question currentQuestion;
  
  public Quiz_Controller(MainMenuView _mainMenu) {
    this.mainMenu = _mainMenu;
    mainMenu.setVisible(true);
    mainMenu.setControl(this);
    quiz = new Quiz("Random");
  }
  
  public void launchQuizGame() {
 //   gameLaunched = true;//added by cganier.  used in check score method.
    gamesLaunched++;//added by cganier.  used in check score method.
    questionCount = 0;
    quiz.initScore();
    System.out.println("This is the main entry point for the whole system");
    System.out.println("Launch the main menu view here");
    quizMenu = new QuizView(this);//this line starts the quiz screen
    displayNextQuestion();
    checkEndOfQuiz();
            
    try 
    {
      quizMenu.setVisible(true);
    } 
    catch (Exception e) 
    {
      e.printStackTrace();
    }
  };
  
 public void scorePopUp(JPanel _jPan)
 //causes a pop up with #correct/#answered and an okay button
 //added by cGanier
 {
     if (gamesLaunched > 1)//played more then one game, list highest and current score
         JOptionPane.showMessageDialog(_jPan, "You have played " + Integer.toString(gamesLaunched) 
                 + " games.\n" + this.getHighScore() + this.getCurrentScore());
     else 
         if (gamesLaunched == 1)//one game has been played, list current score only
            JOptionPane.showMessageDialog(_jPan, this.getCurrentScore());
         else//no games played
            JOptionPane.showMessageDialog(_jPan, "You must start the game before checking your score.");
 }
 
  // return the currentScore as a String message for the popup dialogue
  public String getCurrentScore() {
    return "Your current score is " + Integer.toString(quiz.getScore()) + " out of " 
                     + Integer.toString(quizMenu.getQuestionCount()) + ".";
  }
 
  
  // return the currentScore of the quiz as an int 
  public int getCurrentScoreAsInt() {
    return quiz.getScore();
  }
 
  // return the highScore from all games as a string message for the popup dialogue
  public String getHighScore() {    
     return "Your high score is " + highScore + ".\n";
  }  
 

  /** displayNextQuestion
   *  Method increments the questionCount number before reading in the next
   *  random question from the array of available questions. After reading in the 
   *  question the method checks to see if it is a multiple choice question or
   *  a true false question. From there the quizView dialogues are updated.
   */
  public void displayNextQuestion() {
    System.out.println("Reached next question method");
    
    questionCount++;
    	  
    // Get new random question
    randQuestion = getRandomQuestionNumber();
      
    currentQuestion = quiz.getQuestion(randQuestion);
    
    //Display questionType
    System.out.println(currentQuestion.getQuestionType());
      
    //if the current question is multiple choice
    if(currentQuestion.getQuestionType() == QuestionTypeEnum.MULTIPLE_CHOICE) {
      
      // make buttons 3 and 4 show up
      view.QuizView.jRadioButton3.setVisible(true);
   	  view.QuizView.jRadioButton4.setVisible(true); 
    	 
   	  // read in the question text
      view.QuizView.setQuestionLabel(currentQuestion.getQuestionText());
      
      // set the text for multiple choice options     
      view.QuizView.setRadioBtn1Text(currentQuestion.getMultipleChoiceOptions().get(0));
      view.QuizView.setRadioBtn2Text(currentQuestion.getMultipleChoiceOptions().get(1));
      view.QuizView.setRadioBtn3Text(currentQuestion.getMultipleChoiceOptions().get(2));
      view.QuizView.setRadioBtn4Text(currentQuestion.getMultipleChoiceOptions().get(3));
      
    
    } else {
      
      // read in the question text
      view.QuizView.setQuestionLabel(currentQuestion.getQuestionText());
    	  
      // label the buttons true false and hide the rest
    	view.QuizView.setRadioBtn1Text("True");
    	view.QuizView.setRadioBtn2Text("False");
    	view.QuizView.jRadioButton3.setVisible(false);
    	view.QuizView.jRadioButton4.setVisible(false);
    }
  }


  /** checkAnswer
   * 
   * @param answer
   * @return true if correct
   * 
   * checks the supplied String argument against the expected answer string
   * if matching the score is updated. Method also checks to see if it is time to
   * end the game by calling the checkEndOfGame method.
   */
  public boolean checkAnswer(String answer) {
  
    if(answer.equals(currentQuestion.getAnswerText())) {
      System.out.println("YOU GOT IT CORRECT, AWESOME!!!");
      updateScores();
      return true;    
    } else {
      System.out.println("YOU GOT IT WRONG, NOT AWESOME!!!");
      //Dont add to score
      return false;    
    }   
  }
  
  // End the game after 10 questions
  public void checkEndOfQuiz() {
    if(questionCount > 9) {
      quizMenu.setVisible(false);
      quizMenu.dispose();
      
      // Maybe add a game over popup here?
      
    }
  }
	   
  /** updateScores
   * Method will increment the currentScore by one and then check for a new
   * highScore. If a new highScore has been obtained, the highScore will be set
   * to the currentScore.
   */
  private void updateScores() {
	  System.out.println("Updating scores!");
	  quiz.setScore();
	   
	  // update the highScore if needed
	  if(quiz.getScore() > this.highScore) {
	    this.highScore = quiz.getScore();
	  }
  }  
  
  //generates random number from 0 to 49
  public static int getRandomQuestionNumber(){
    return rn.nextInt(49) + 1;
  }
  
  //Dummy Method to get unit testing working
  public String toString() {
    return "Quiz Controller";
  }
  
  // getter Method
  public static Question getCurrentQuestion() {
    return currentQuestion;
  }  
}