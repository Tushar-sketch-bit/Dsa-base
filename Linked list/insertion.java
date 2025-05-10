


public class insertion<T>{

   class Node{
        T data;
        Node next;
        Node(T data){
            this.data=data;
            this.next=null;
    
        }
    }
    

   
   private Node head;
    public void insertAtPosi(T data, int posi){
        Node newNode=new Node(data);
        if(posi==1){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node temp=head;
        for(int i=1;temp != null && i<posi-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    } 
 static int count;
    public void printlist(){
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.data+ " -> ");
            count++;
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        insertion<Integer> list=new insertion<>();
        list.insertAtPosi(10, 1);
        list.insertAtPosi(20, 2);
        list.insertAtPosi(30, 3);
        list.insertAtPosi(40, 4);

         list.printlist();
         
        insertion<String> list1=new insertion<>();
        list1.insertAtPosi("ten", 1);
        list1.insertAtPosi("twenty", 2);
        list1.insertAtPosi("thirty", 3);
        list1.insertAtPosi("forty", 4);
        list1.printlist();
        
        System.out.println("total length of list is: "+count);


    }
}
