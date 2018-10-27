import java.util.Collections;
import java.util.List;


public class ExamTester{
  public static void main(String[] args){
    Exam exam = new Exam("Test");
    Question q1 = new Question("What is 1 + 1?");
    q1.AddAnswer(new Answer("2"));
    q1.AddAnswer(new Answer("1"));
    q1.AddAnswer(new Answer("3"));
    exam.AddQuestion(q1);
    exam.print();
    exam.reorderQuestions();
    exam.print();
  }
}