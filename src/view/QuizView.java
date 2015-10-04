/************   
 * 
 *      Class:         QuizView
 *      Package:       View
 *      
 *      Created on:    9/18/2015 
 *      Author(s):     
 *          John Lasheski - Basic design and initial method stub creation
 *          Caroline Ganier - GUI
 *          ...
 *          ...
 *          ...
 *     
 *      Class Description:
 *          This class is responsible for creating and displaying the game play
 *          screen for the Agile Dinosaur game. Once initialized, this class 
 *          will build a window that displays a question as a label, and either 
 *          4 potential answer (multiple choice) or 2 potential answers (True or
 *          False).  The options will be displayed as radio buttons.  The window
 *          will also display 3 buttons, one to check the answer, one to go to 
 *          to the next screen, and one to exit the window.   
 * 
 ************/
package view;

import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import controller.Quiz_Controller;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class QuizView extends javax.swing.JFrame {

  private static final long serialVersionUID = 1L;
    private Quiz_Controller qController;
    private static String answer;
    private javax.swing.JButton btnDisplayNextQuestion;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton quitBtn;
    private javax.swing.JButton checkBtn;
    private javax.swing.JLabel questionNumberLabel;
    private javax.swing.JPanel jPanel1;
    //private javax.swing.JRadioButton jRadioButton1;
    //private javax.swing.JRadioButton jRadioButton2;
    //private javax.swing.JRadioButton jRadioButton3;
    //private javax.swing.JRadioButton jRadioButton4;
    private int questionCounter = 1;
    
    public QuizView(Quiz_Controller _qController) 
    //Constructor. Gives access to Quiz Controller to be used for answer 
    //validation and to start the get next question process.
    //initCoponents starts the window and component generation.
    {
        answer = "0";
        qController = _qController;
        initComponents();
    }

    public static JTextArea    jtaAnswerField = new JTextArea(3, 20);
    public static JRadioButton jRadioButton1 = new JRadioButton();
    public static JRadioButton jRadioButton2 = new JRadioButton();
    public static JRadioButton jRadioButton3 = new JRadioButton();
    public static JRadioButton jRadioButton4 = new JRadioButton();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        questionNumberLabel = new javax.swing.JLabel();
        
        quitBtn = new javax.swing.JButton();
        checkBtn = new javax.swing.JButton();
        btnDisplayNextQuestion = new javax.swing.JButton();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 233));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 255)));

        questionNumberLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        questionNumberLabel.setText("Q" + questionCounter);

        //set initial question text to the first question
        jtaAnswerField.setText("***Insert question here***");
        jtaAnswerField.setWrapStyleWord(true);
        jtaAnswerField.setLineWrap(true);
        jtaAnswerField.setOpaque(false);
        jtaAnswerField.setEditable(false);
        jtaAnswerField.setFocusable(false);
        jtaAnswerField.setBackground(UIManager.getColor("Label.backgroud"));
        jtaAnswerField.setFont(UIManager.getFont("Label.font"));
        jtaAnswerField.setBorder(UIManager.getBorder("Label.border"));

        quitBtn.setText("End Quiz");
        quitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        checkBtn.setText("Check Answer");
        checkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	checkBtn.setEnabled(false);//disable check button after it is hit--Bradley
                jButton2ActionPerformed(evt);
                btnDisplayNextQuestion.setEnabled(true);//enable next question button after answer checked--Bradley
            }
        });

        btnDisplayNextQuestion.setText("Next Question");
        btnDisplayNextQuestion.setEnabled(false);//first run have it disabled--Bradley
        btnDisplayNextQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	checkBtn.setEnabled(true);//enable check button after next question is hit--Bradley
                btnDisplayNextQuestionActionPerformed(evt);
                btnDisplayNextQuestion.setEnabled(false);//disable next question button after it is hit--Bradley
            }
        });


        jRadioButton1.setBackground(new java.awt.Color(102, 153, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Answer 1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(102, 153, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Answer 2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(102, 153, 255));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Answer 3");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setBackground(new java.awt.Color(102, 153, 255));
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Answer 4");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(quitBtn)
                .addGap(290, 290, 290))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(checkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)
                        .addComponent(btnDisplayNextQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(questionNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtaAnswerField, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton3)
                                    .addComponent(jRadioButton4))))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtaAnswerField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDisplayNextQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(checkBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addComponent(quitBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        //This is the action section for the QuizView Quit button. Clicking the
        //quit button should cause the window to become invisable and be removed
        System.out.println("You pressed the quit button in the quizView");
        this.setVisible(false);
        this.dispose();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        //This is the action section for the Quiz Screen Check Answer button.  
        //clicking the button should send the value stored in 'answer' to 
        //control.Quiz_Controller.checkAanswer(String).  If answer is filled by
        //the user selecting an answer from the radio button group, it will have
        //a String value of {1, 2, 3, 4}. If no answer was selcted, 'answer' will
        //be "0" (answer initialized to "0" in constructor; reset at method end
        System.out.println("You pressed the Check Answer button");
        String _message = "Incorrect Answer!";
        if (answer == "0")
            JOptionPane.showMessageDialog(jPanel1,"Please select an answer first.");
        else if (qController.checkAnswer(answer))
                JOptionPane.showMessageDialog(jPanel1,"Correct Answer!");
             else
                {
                 if (qController.getCurrentAnswer().equals("A"))   
                    _message = "Incorrect Answer!\nThe correct answer is: " + jRadioButton1.getText();
                 else if (qController.getCurrentAnswer().equals("B"))
                     _message = "Incorrect Answer!\nThe correct answer is: " + jRadioButton2.getText();
                    else if (qController.getCurrentAnswer().equals("C"))
                         _message = "Incorrect Answer!\nThe correct answer is: " + jRadioButton3.getText();
                        else if (qController.getCurrentAnswer().equals("D"))
                            _message = "Incorrect Answer!\nThe correct answer is: " + jRadioButton4.getText();
                 JOptionPane.showMessageDialog(jPanel1, _message);
                }
                //JOptionPane.showMessageDialog(jPanel1,"Incorrect Answer!");
        answer = "0";
    }

    private void btnDisplayNextQuestionActionPerformed(java.awt.event.ActionEvent evt) {
        // Controls total questions each quiz contains - Added by Wayne Tolson. 
        if(questionCounter == 10) {
            this.setVisible(false);
            this.dispose();
        }
        else {
            System.out.println("You pressed the Next Question button");
            buttonGroup1.clearSelection();
            questionCounter++;
            questionNumberLabel.setText("Q" + questionCounter);
            qController.displayNextQuestion();
        }
    }

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        answer = "A";
    }

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        answer = "B";
    }

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        answer = "C";
    }

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        answer = "D";
    }

    //setters and getters for necessary GUI fields--Made by Bradley Wetzel
    public static void setQuestionLabel(String questionText){
        jtaAnswerField.setText(questionText);
    }
    
    public String getQuestionLabel(){
        return jtaAnswerField.getText();
    }
    
    //current question number
    public void setQuestionNumberLabel(String questionNumber){
    	questionNumberLabel.setText(questionNumber);
    }
    
    public String getQuestionNumberLabel(){
    	return questionNumberLabel.getText();
    }
    
    public int getQuestionCount()
    //added by cGanier
    {
        return questionCounter;
    }
    
    //first answer
    public static void setRadioBtn1Text(String answerOneText){
    	jRadioButton1.setText(answerOneText);
    }
    public String getRadioBtn1Text(){
    	return jRadioButton1.getText();
    }
    
    //second answer
    public static void setRadioBtn2Text(String answerTwoText){
    	jRadioButton2.setText(answerTwoText);
    }
    public String getRadioBtn2Text(){
    	return jRadioButton2.getText();
    }
    
    //third answer
    public static void setRadioBtn3Text(String answerThreeText){
    	jRadioButton3.setText(answerThreeText);
    }
    public String getRadioBtn3Text(){
    	return jRadioButton3.getText();
    }
    
    //fourth answer
    public static void setRadioBtn4Text(String answerFourText){
    	jRadioButton4.setText(answerFourText);
    }
    public String getRadioBtn4Text(){
    	return jRadioButton4.getText();
    }
    
    //Return the answer variable
    public static String getAnswer(){
    	return answer;
    }
    
}