public class LL1{
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;

        }
    }
     Node head;
    public void addfirst(String data){
       Node newNode=new Node(data);
       newNode.next=head;
       head=newNode;
    }
    public static void main(String[] args) {
        LL1 firstList=new LL1();
        Node first=firstList.new Node("first");
        Node second=firstList.new Node("second");
        Node third=firstList.new Node("third");
        first.next=second;
        second.next=third;

        firstList.head=first;
        firstList.addfirst("new first");

        Node temp = firstList.head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println(firstList.head.data);
    }
    
    }







