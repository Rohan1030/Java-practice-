package linkedlist;




public class LL {

class Node 
{
  String data;
  Node next;

  Node(String data)
  {
    this.data = data;
    this.next=null;

  }

}

private Node head;



// add-first 
public void addFirst(String data)
{
  Node newNode = new Node(data);
  if(head == null)
  {
    head = newNode;
    return;
  }
  newNode.next = head;
  head = newNode;
}


// add - last

public void addLast(String data)
{
  Node newNode = new Node(data);
  if(head == null)
  {
    head = newNode;
    return;
  }
  Node currNode = head;
  while(currNode.next != null)
  {
    currNode = currNode.next;

  }
  currNode.next = newNode;
}




//print      

public void printList()
{
  if(head == null)
  {
    System.out.println("list is empty");
    return;
  }

  Node currNode = head;
  while(currNode.next != null){
  System.out.println(currNode.data + "->");

  currNode = currNode.next;
  }


  System.out.println("NULL");
  
}


//deleteFirst

public void deleteFirst()
{
  if(head == null)
  {
    System.out.println("List is empty");
    return;
  }

  head = head.next;

}



//deleteLast


public void deleteLast()
{
  if(head ==null)
  {
    System.out.println("The list is empty");
    return;
  }
  if(head.next==null)
  {
    head=null;
    return;
  }

  Node secondLast = head;
  Node lastNode = head.next;

  while(lastNode.next != null)
  {
    lastNode = lastNode.next;
    secondLast = secondLast.next;


  }
  secondLast.next = null;


}















  public static void main(String[] args) {
    LL list = new LL();

   
    list.addFirst("b");
     list.addFirst("a");
    list.addFirst("b");
    list.printList();

    list.addLast(null);
    list.printList();

    list.deleteFirst();
    list.printList();







    
  }
  
}
