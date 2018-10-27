import java.util.Collections;
import java.util.List;

//The Exam class represents a gradable collection of Questions
public class Exam {
  private String title;
  private List<Question> questions;

  //Exam( String ) – A constructor for creating the Exam object. New Exams do not have Questions until they are added. The input parameter is the title / header of the exam, to be printed before the questions. ( Note that the title / header may consist of multiple lines. )
  public Exam(String s){
    title = s;
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
      q.print(0);
    }
  }

  // getQuestion( int position ) : Question – returns ( a reference to ) the question in the given position within the exam.
  public Question getQuestion(int position){
    return questions.get(position);
  }

  // reorderQuestions( void ) : void – Randomly reorders the Questions within the Exam.
  public void reorderQuestions(){
    Collections.shuffle(questions);
  }

  // getValue( void ) : double – Get the overall value ( score ) of the exam. This method should work regardless of how many ( if any ) of the Questions have been answered.
  public double getValue(){
    double overallValue = 0.0;
    for(Question q: questions){
      overallValue += q.getValue();
    }
    return overallValue;
  }


};