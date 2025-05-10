import java.util.LinkedList;


public class LL {
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    private Node head;
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        newNode.next=head;
        head=newNode;    
    }
    public void printList(){
        Node temp=head;
        while(temp!=head){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("linked list");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
       list.printList();

        
    }










}