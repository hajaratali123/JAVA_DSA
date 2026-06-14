// ── Singly Linked List Node ──────────────────────────
class node {
    int data; // to store value
    node next; // to reference to next node (null if it's last node)

    node(int data){
        this.data= this;
        this.next=null;
    }
}
// ── Doubly Linked List Node ──────────────────────────

class Dnode{
    int data;
    Dnode prev;
    Dnode next;

    Dnode(int data){
        this.data=this;
        prev =next=null;
    }
}

// ── Generic Node (works with any type) ──────────────

class GenericNode{
    T data;
    GenericNode<T> next;

    GenericNode(T data){
        this.data = data;
    }
}