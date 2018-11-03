import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


//The Question class represents a textual multiple-choice question
public class Question{
  private String question;
  private List<Answer> answers;

  //Question( String ) – A constructor for creating the Question object. New Questions do not have Answers until they are added.
  public Question(String q){
    question = q;
    answers = new ArrayList<Answer>();
  }

  //AddAnswer( Answer ) – Add an Answer to a Question. By default new answers are added to the end of the existing list.
  public void AddAnswer(Answer a){
    answers.add(a);
  }

  //print( int position ) : void – Prints the question to the screen, along with all of its answers. The input parameter indicates the position of this question in the list of questions, 1 for the first question, 2 for the second, and so on.
  public void print(){
    System.out.println(question);
    for(Answer a: answers){
      a.print();
    }
  }

  //selectAnswer( int position ) : void – selects the Answer in the given position. This may or may not require unselecting other previously selected Answers.
  public void selectAnswer(int position){
    answers.get(position).setSelected(true);
  }

  //unselectAnswer( int position ) : void – unselects the Answer in the given position.
  public void unselectAnswer(int position){
    answers.get(position).setSelected(false);
  }

  //reorderAnswers( void ) : void – Randomly reorders the Answers within the Question.
  public void reorderAnswers(){
    Collections.shuffle(answers);
  }

  //getValue( void ) : double – Get the number of points that this question contributes to the exam score, based on which answers are currently selected.
  public double getValue(){
    double value = 0;
    for(Answer a: answers){
      value += a.getValue();
    }
    return value;
  }
}