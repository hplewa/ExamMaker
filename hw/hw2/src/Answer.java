//The Answer class represents a textual multiple-choice answer
public class Answer{
  private String answer;
  private Boolean selected;
  private double value;

  //Answer( String ) – A constructor for creating the Answer object. By default new Answers are unselected and have no value.
  public Answer(String s){
    answer = s;
    selected = false;
    value = 0;
  }

  //print( int position ) : void – Prints the answer to the screen. The input parameter indicates the position of this answer in the list of answers, 1 for the first answer, 2 for the second, and so on.
  public void print(){
    System.out.println(answer);
  }

  //setSelected( Boolean ) : void – An answer is selected ( true ) when a student has selected this answer. It becomes unselected ( false ) if the student changes their mind or selects another answer when only one answer is allowed.
  public void setSelected(Boolean s){
    selected = s;
  }

  //setValue( double, double ) : void – sets the value(s) of this Answer if it is selected or unselected respectively. The default for each is zero if unset. Set values can be positive or negative.
  public void setValue(double v1, double v2){
    if(selected){
      value = v1;
    }
    else{
      value = v2;
    }
  }

  //getValue( void ) : double – Get the number of points that this answer contributes to the exam score, based on whether it is selected and its value when it is selected.
  public double getValue(){
    return value;
  }
}