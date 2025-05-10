

public class doublyGenerics<T>{

    class Node{
        T data;
        Node prev;
        Node next;
        Node(T data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }

    private Node head;
    private Node tail;

    public doublyGenerics(){
        head=null;
        tail=null;
    }

    //print list in forward direction 
     public void printForward(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println();
     }

     public void insertAtBegin(T data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        
    }

    //insert at last default method
    public void insertAtLast(T data){
       Node newNode=new Node(data);
       if(tail==null){
        head=tail=newNode;
       }
       else{
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
       }
    }

    //get last node's data
    public T GetLast(){
        return tail.data;
    }
    public T GetFirst(){
        return head.data;
    }
    public void getTailAddress(){
        System.out.println(System.identityHashCode(tail));
    }
    public void getHeadAddress(){
        System.out.println(System.identityHashCode(head));
    }
    //print backwards
   public void printBackwards(){
    Node temp=tail;
    while(temp!=null){
        System.out.println(temp.data +" ");
        temp=temp.prev;
    }
    System.out.println();
   }
      
   //print by recursion
   public void printByRecursion(Node temp){
    if(temp==null){
        return ;
    }
    System.out.print(temp.data+" -> ");
    printByRecursion(temp.next);
   }
    public void printForward1(){
    printByRecursion(head);
    System.out.println();
    }
    // insert at position 
     public void insertAtPosi(T data,int posi){
        Node newNode=new Node(data);
        Node temp=head;
        if(posi<1){
            System.out.println("invalid position");
        }
        else if(posi==1){
            insertAtBegin(data);
            return;
        }
        else{
            for(int i=1;temp!=null && i<posi-1;i++){
                temp=temp.next;
            }
            if(temp == null || temp.next == null) {
                insertAtLast(data);  // Handle end insertion
                return;
            }
            Node nextNode=temp.next;
             temp.next=newNode;
             newNode.prev=temp;
             newNode.next=nextNode;
             nextNode.prev=newNode;
        }
     }

     //insert at last with tail pointer O(1)
     public void insertAfterTail(T data){
        Node newNode=new Node(data);
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
     }

     //delete first node 
     public void delFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head==tail){
            head=tail=null;
        }
        else{
            head=head.next;
            head.prev=null;
        }
     }

     //delete last node
     public void delLast(){
        if(tail==null){
            System.out.println("lis is empty");
            return;
        }
        if(tail==head){
            head=tail=null;
        }
        else{
            tail=tail.prev;
            tail.next=null;
        }
     }

     //delete by position
     public void delByPosition(int posi){
        if(posi<1 || head==null){
            System.out.println("invalid position or empty list.");
            return;
        }
        if(posi==1){
            delFirst();
            return;
        }
        Node temp=head;
        for(int i=1;temp!=null && i<posi-1;i++){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("position exceeds list length");
            return;
        }
        if(temp==tail){
            delLast();
            return;
        }
        else{
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
        }
     }
     public static void main(String[] args) {
        doublyGenerics<Integer> list1=new doublyGenerics<>();
        list1.insertAtBegin(40);
        list1.insertAtBegin(30);
        list1.insertAtBegin(20);
        list1.insertAtBegin(10);

        System.out.println("FORWARD DIRECTIONAL LIST:");
        list1.printForward();

        System.out.println("Head's address: ");
        list1.getHeadAddress();

        System.out.println("Tail's address: ");
        list1.getTailAddress();
        
        System.out.println("first element: "+list1.GetFirst());
        
        System.out.println("Last element: "+list1.GetLast());

        list1.insertAtPosi(25, 3);
        System.out.println();
        list1.printForward();
        System.out.println();
        System.out.println("list using recursion ");
        list1.printForward1();
       

        //Scanner sc=new Scanner(System.in);
        //System.out.println("enter a position of node to delete it: ");
        //int a =sc.nextInt();
        //sc.close();
       // list1.delByPosition(a);

     }
}
