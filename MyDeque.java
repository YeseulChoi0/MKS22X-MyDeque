@SuppressWarnings("unchecked")
public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  public MyDeque(){
    data = (E[])new Object[10];
  }

  public MyDeque(int initialCapacity){
    data = (E[])new Object[initialCapacity];
  }

  public int size(){
    return size;
  }

  public String toString(){
    String s = "{";
    for (int i =0; i < size; i++){
      s += data[i] + ", ";
    }
    return s + "}";
  }

  public void addFirst(E element){
    if (start == 0){
      start = data.length - 1;
    }else{
      start--;
    }
    data[start] = element;
    System.out.println(start);
    size++;
  }

  public void addLast(E element){
    if (end == data.length-1){
      end = 0;
    }else{
      end++;
    }
    data[end] = element;
    size++;
  }

  public E removeFirst(){
    if (start == data.length-1){
      start = 0;
    }else{
      start++;
    }
    E returner = data[start];
    data[start] = null;
    size--;
    return returner;
  }

  public E removeLast(){
    if (end == 0){
      end = data.length - 1;
    }else{
      end--;
    }
    E returner = data[end];
    data[end] = null;
    size--;
    return returner;
  }

  public E getFirst(){
    return data[start];
  }

  public E getLast(){
    return data[end];
  }

}
