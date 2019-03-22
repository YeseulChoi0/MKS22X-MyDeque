public class Driver{
  public static void main(String[] commandLine){
    MyDeque deque = new MyDeque<Integer>(2);
    System.out.println(deque.toString());
    deque.addFirst(10);
    deque.addFirst(9);
    deque.addLast(11);
    System.out.println(deque.toString());
  }
}
