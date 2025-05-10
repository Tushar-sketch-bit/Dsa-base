import java.util.ArrayList;


public class listOfGenerics<T> {

    class Node{
        T data;
        Node next;
        Node(T data){
            this.data=data;
            this.next=null;
        }
    }
     Node head;


    public void printlist(){
        if(head==null) return;
        Node temp=head;
        while(temp!=null){
            //System.out.print(temp.data+" -> "+" ("+System.identityHashCode(temp)+") ");
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("Over N Out");
    }
    //only head insertion

    public void insertAtBegin(T data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }


    //insert at specific position
    public void setDataAt(T data, int posi){
        if(posi==1){
            insertAtBegin(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        for(int i=1;temp!=null && i<posi-1;i++){
            temp=temp.next;
        }
        if(temp==null) return;
        newNode.next=temp.next;
        temp.next=newNode;
    }

    // delete a node by value

    public void deleteByValue(T key){
        if(head==null) return;
        if(head.data.equals(key)){
            head=head.next;
            return;
        }
        Node temp=head;
        while(temp.next !=null && !temp.next.data.equals(key)){
            temp=temp.next;
        }
        if(temp.next !=null){
            temp.next=temp.next.next;
        }
    }

    // delete by position

    public void deleteByPosi(int pos){
        if(head==null) return;
        if(pos==1){
            head=head.next;
            return;

        }
        Node temp=head;
        for(int i=1; temp.next !=null && i<pos-1;i++){
            temp=temp.next;
        }
        if(temp==null || temp.next==null) return;
        temp.next=temp.next.next;
    }

    //search for a element by value
    public boolean search(T key){
        Node temp=head;
        while(temp!=null){
            if(temp.data==key) return true;
            temp=temp.next;
        }
        return false;
    }

    //get data at

    public void getDataAt(int posi){
        if (posi < 1) {
            System.out.println("Invalid position");
            return;
        }
        Node temp=head;
        
        for(int i=1;temp!=null && i<posi;i++){
            temp=temp.next;
        }
        if(temp!=null){
            System.out.println("data at "+posi+" is: "+temp.data);  
        }
        else{
            System.out.println("invalid position ");
        }
    }

    // reverse linked list

    public void reverse(){
    Node prev = null;
    Node current = head;
    Node nextNode;

    while(current != null) {
        nextNode = current.next;     // Save the next node (don’t lose the list)
        current.next = prev;         // Reverse the link (flip the sword 🔄)
        prev = current;              // Move prev ahead (step forward)
        current = nextNode;          // Move current ahead (next target)
    }
    head = prev;                     // Head now points to the last node (victory!)
    

    }

    // middle element

    public void getMiddle(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        System.out.println("middle element is: "+slow.data);
    }

    //convert to array 

    public void ToArray(){
        ArrayList<T> array=new ArrayList<>();
        Node temp=head;
        while(temp!=null){
            array.add(temp.data);
            temp=temp.next;
        }
        System.out.println(array);
       // System.out.println(System.identityHashCode(array));
    }

    //detect loop using floyd cycle 

    public void detectLoop(){

    }

    public static void main(String[] args) {
        listOfGenerics<String> list1=new listOfGenerics<>();
        list1.insertAtBegin("hello");
        list1.setDataAt("dosto", 2);
        list1.setDataAt("mera", 3);
        list1.setDataAt("naam", 4);
        list1.setDataAt("tushar", 5);
        list1.setDataAt("hai", 6);
    //   list1.deleteByPosi(1);
    //   list1.deleteByPosi(2);
        list1.printlist();
        System.out.println();
     // System.out.println (list1.search("naam"));
     // list1.getDataAt(4);
       System.out.println("array conversion: ");
        list1.ToArray();
        listOfGenerics<Integer> list2 =new listOfGenerics<>();
        list2.setDataAt(10, 1);
        list2.setDataAt(20, 2);
        list2.setDataAt(30, 3);
        list2.setDataAt(40, 4);
        System.out.println();
        System.out.println("second list: ");
        list2.printlist();
        System.out.println();
        System.out.println("second list to array: ");
        list2.ToArray();
       




    }
}
