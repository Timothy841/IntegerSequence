import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  private int currentIndex;
  private int[] data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    currentIndex = 0;
    data = new int[other.length];
    for (int i = 0; i<other.length;i++){
      data[i] = other[i];
    }
  }

  public ArraySequence(IntegerSequence otherseq){
    currentIndex = 0;
    data = new int[otherseq.length()];
    for (int i = 0; i<otherseq.length();i++){
      data[i] = otherseq.next();
    }
  }

  public void reset(){
    currentIndex = 0;
  }

  public int length(){
    return data.length;
  }

  public boolean hasNext(){
    if (currentIndex >=0 && currentIndex <=data.length-1){
      return true;
    }
    return false;
  }

  public int next(){
    if (hasNext()==false){
      throw new NoSuchElementException();
    }
    currentIndex++;
    return data[currentIndex-1];
  }
}
