import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int []data;

  public ArraySequence(int [] other){
    data = other;
    currentIndex = 0;
  }

  public void reset(){
    currentIndex = 0;
  }

  public int length(){
    return data.length;
  }

  public boolean hasNext(){
    return currentIndex < length();
  }

  public int next(){
    if (hasNext() == false){
      throw new NoSuchElementException("the element " + currentIndex + " is not in this ArraySequence");
    }
    currentIndex+=1;
    return data[currentIndex - 1];
  }

}
