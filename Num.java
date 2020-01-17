public class Num implements Comparable{
public static void main(String []args){
private int value;
public Num(int value){
this.value = value;
}
public int getValue(){
  return value;
}
public void setValue(int value){
  this.value = value;
}
public String to String(){

  return " " + value;
}
public boolean equals(Num otherNum){
  return this.value== otherNum.value;
}

public int compareTo(Object other){
  Num otherNum = (Num) other;
  return this.getValue() - otherNum.getValue()
}


}

}
