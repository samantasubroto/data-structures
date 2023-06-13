package LinkedList.Impl1;

import LinkedList.Impl1.Node;

public class LinkedList {
    
    Node head;

    public static LinkedList insert(LinkedList list, int value) {
      Node new_node = new Node(value, null);
      if(list.head == null) {
        list.head = new_node;
        return list;
      }
      Node temp = list.head;
       while(temp.next != null) {
        temp = temp.next;
       }
       temp.next = new_node;
       return list;
    }

    public static void display(LinkedList list) {
        if(list.head == null)
          return;
        Node temp = list.head;
        while(temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void search(LinkedList list) {

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = insert(list, 11);
        list = insert(list, 22);
        list = insert(list, 33);
        list = insert(list, 44);
        display(list);
    
  }
}