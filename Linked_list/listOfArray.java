public class listOfArray<T>{
    class Node{
        T[] data;
        Node next;
        Node(T[] data){
            this.data=data;
            this.next=null;
        }
    }
    public Node head; //instance node
    public void insert(T[] data){
        Node newNode=new Node(data);//actual object
        if(head==null){
            head=newNode;// instance gets its real obj value
            return;
        }
        Node temp=head;// temp is also an instance which gets head's value
        while(temp.next!=null){ // iterates while tem.next not null and
            temp=temp.next;  // when it finds that temp.next is empty 
        }
        temp.next=newNode;// then it points current interated node towards newNode
    }                     // that we created
    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print("HAHA ");
            for(T item:temp.data){
                System.out.print(item+" ");
            }
            System.out.print("HAHA ->");
            temp=temp.next;
        }
        System.out.println("SORRY SIR");
    }

    public static void main(String[] args) {
        listOfArray<Integer> list=new listOfArray<>();
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {4, 5, 6};
        Integer[] arr3 = {7, 8, 9,10,11};
        list.insert(arr1);
        list.insert(arr2);
        list.insert(arr3);
        list.printList();
        

    }
}