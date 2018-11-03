import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


//The Question class represents a textual multiple-choice question
public abstract class Question{
  private String text;
  private Answer rightAnswer;
  private Answer studentAnswer;
  private double maxValue;

  //Question( String, double ) – A constructor for creating the Question object. The maxValue is what the question is worth if an answer receives full credit.
  public Question(String t, double m){
    text = t;
    maxValue = m;
  }

  public void setRightAnswer(Answer a){
    rightAnswer = a;
  }

  //print( ) : void – Prints the question to the screen. The MCQuestion class overrides this method to also print the available answers.
  public void print(){
    System.out.println(text);
  }

  //getNewAnswer ( ) : Answer – This method creates and returns a new Answer object, suitably matched to the Question type of the object through which this method is called. Note that it is abstract in the Question class, and overridden in concrete classes to return the appropriate kind of Answer. ( SAQuestion.getNewAnswer( ) returns a new SAAnswer, etc. ) This mechanism is an example of the Factory Method design pattern.
  public Answer getNewAnswer(){}

  //getNewAnswerFromStudent( ) : void – This also creates a new Answer of the appropriate type, similar to getNewAnswer. The differences are that this method gets the answer from the student/ keyboard, and the answer is stored in the studentAnswer field of the class instead of being returned.
  public void getNewAnswerFromStudent(){}

  //getValue( void ) : double – Get the number of points that this question contributes to the exam score, based on the maxValue of the question and evaluation of the current student answer. ( Answer classes have a getCredit( ) method which return a value from 0.0 to 1.0 )
  public double getValue(){
    double value = 0;
    for(Answer a: answers){
      value += a.getValue();
    }
    return value;
  }

  //AddAnswer( Answer ) and reorderAnswers( void ) have now been moved down into the MCQuestion class.
  public void AddAnswer(Answer a){}

  //selectAnswer( ) and unselectAnswer() have now been replaced with the more general getAnswerFromStudent( ).
  public void getAnswerFromStudent(){}

}