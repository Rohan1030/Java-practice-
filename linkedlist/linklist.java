package linkedlist;
import java.util.*;

public class linklist {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();

      list.addFirst("a");
      list.addFirst("is");
      System.out.println(list);

      list.add("this");
      System.out.println(list);

      System.out.println(list.size());

      for(int i=0;i<list.size();i++) {
System.out.print(list.get(i)+" -> ");
      }
      System.out.println("null");


list.removeFirst();
list.removeLast();
System.out.println(list);





  }


}
