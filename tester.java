public class tester{

  public static void main(String[] args){
    IntegerSequence r = new Range(10,15);
    while(r.hasNext()){
      System.out.print(r.next());
      if( r.hasNext() ){
         System.out.print( ", " );
      }
    }
    System.out.println();
    r.reset();
    System.out.println(r.length());
    int i = 0;
    while(i < 10){
      System.out.print(r.next());
      if( r.hasNext() ){
         System.out.print( ", " );
      }
      i+=1;
    }
  }

}
