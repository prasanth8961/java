public class LinkedList {
    private Node head;
    class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    LinkedList(){
        this.head = null;
    }

    public void insertAtBegining(int data){
       Node newNode = new Node(data);
       if(head == null){
            head = newNode;
       }
       newNode.next = head;
       head = newNode;
    }

    public void insertAtPos(int val , int pos){
          Node newNode = new Node(val);
          Node tempNode = head;

          if(pos == 0) {
            head = newNode;
          }
          for(int i = 0 ; i < pos ; i++){
              tempNode = tempNode.next;
              if(tempNode == null){
                throw new IllegalArgumentException("invalid position");
              }   
          }
          newNode.next  = tempNode.next;
          tempNode = newNode;
    }

    public void deleteAtIndex(int pos){

    }

    public void displyData(){
       Node  tempNode = head;
        while(tempNode != null){
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.next;
        }
    }

    public static void main(String args[]){
       LinkedList linkedlist = new LinkedList();
       linkedlist.insertAtBegining(2);
       linkedlist.insertAtBegining(5);
       linkedlist.insertAtBegining(8);
       linkedlist.displyData();
       linkedlist.deleteAtIndex(2);
    }
}
