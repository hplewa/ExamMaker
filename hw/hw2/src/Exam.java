import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

//The Exam class represents a gradable collection of Questions
public class Exam {
  private String text;
  private ArrayList<Question> questions;

  //Exam( String ) – A constructor for creating the Exam object. New Exams do not have Questions until they are added. The input parameter is the title / header of the exam, to be printed before the questions. ( Note that the title / header may consist of multiple lines. )
  public Exam(String s){
    text = s;
    questions = new ArrayList<Question> ();
  }

  // AddQuestion( Question ) – Add a Question to an Exam. By default new questions are added to the end of the existing list.
  public void AddQuestion(Question q){
    questions.add(q);
  }

  // print( void ) : void – Prints the exam to the screen, along with all of its questions.
  public void print(){
    System.out.println(title);
    for(Question q: questions){
      q.print();
    }
  }

  // reorderQuestions( void ) : void – Randomly reorders the Questions within the Exam.
  public void reorderQuestions(){
    Collections.shuffle(questions);
  }

  //reorderMCAnswers( position : int ) : void – For multiple choice questions only, this method reorders the answers of the question. If the position parameter is negative, then all MC questions get their answers reordered. Otherwise the position indicates which Question should have its answers reordered, provided that that Question is a MC type question.
  public void reorderMCAnswers(int position){
      if(position < 0){
          for(MCQuestion q: questions){
              q.reorderAnswers();
          }
      }
      else{
          questions[i].reorderAnswers();
      }
  }

  //getAnswerFromStudent( position : int ) : void – See previous explanation of “position”.
  public void getAnswerFromStudent(int position){ }

  //getValue( void ) : double – Get the overall value ( score ) of the exam. This method should work regardless of how many ( if any ) of the Questions have been answered.
  public double getValue(){
    double overallValue = 0.0;
    for(Question q: questions){
      overallValue += q.getValue();
    }
    return overallValue;
  }

  //reportQuestionValues( ) : void – This method produces a table of the values of each Question on the Exam, and the total.
  public void reportQuestionValues(){ }
};