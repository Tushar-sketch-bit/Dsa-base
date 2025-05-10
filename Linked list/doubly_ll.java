public class doubly_ll<T> {
    static class objectt<U>{
        int lol;
    
         objectt(int a){
            this.lol=a;
        }

        @Override
        public String toString(){
            return "lol =" +lol;
        }
    }
    class Node{
        T data;
        Node next;
        Node prev;
        Node(T data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

     Node head;

     public void insertion_At_Begin(T data){
        Node newNode=new Node(data);
        if(head!=null){
            newNode.next=head;
            head.prev=newNode;
        }
        head=newNode;
     }
     public void printList(){
        Node temp=head;
        System.out.print("NULL <->");
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.print("Null");
     }

    public static void main(String[] args) {

        doubly_ll.objectt<Integer> oj= new doubly_ll.objectt<>(10);
        System.out.println(oj);
        doubly_ll<Object> list=new doubly_ll<>();
        list.insertion_At_Begin(oj.lol);
        list.insertion_At_Begin("hello");
        list.printList();







    }
}
