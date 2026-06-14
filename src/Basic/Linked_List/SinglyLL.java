package Basic.Linked_List;

public class SinglyLL {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // ---- Insert at Beginning O(1)-----
    private void insertFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            //newNode.next=head;
            head=newNode;
            return;
        }
        Node tem = head;
    
        while(tem.next!=null){
            tem=tem.next;
        }
        tem.next=newNode;

    }

    void Display(Node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.data + " -> ");
        Display(head);
    }

    void Print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();
        list.insertFront(10);
        list.insertFront(20);
        list.insertFront(30);
        System.out.println("fist list ");
        list.Print();
        System.out.println("Display linked list :");
       // list.Display(list.head);
       list.insertEnd(200);
       System.out.println("updated list ");
        list.Print();

    }

}
