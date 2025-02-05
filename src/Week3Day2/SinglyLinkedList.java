package Week3Day2;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    private Node head;

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.next =null;
    }

    public void displayLL(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+"-> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    // removes first occured data
    public void removeNode(int data){

        if (head == null){
            System.out.println("list is empty");
            return;
        }
        if(head.data == data){
            head = head.next;
            return;
        }
        Node prev = null;
        Node current = head;
        while(current!=null && current.data != data){

            prev = current;
            current =current.next;
        }

        if (current == null){
            System.out.println("does not found");
            return;
        }
        prev.next = current.next;

    }

    // remove all Occurence
    public void removeallOccurence(int data){
        if(head == null){
            System.out.println("empty linked list");
            return;
        }
        Node current = head;
        Node prev = null;

        while(current!=null){
            if(current.data == data){
                prev.next = current.next;
            }
            else{
                prev = current;
            }
            current = current.next;
        }

    }

    // search for a node
    public boolean search(int data){
        Node current = head;
        while(current != null){
            if(current.data == data){
                return true;
            }
            current = current.next;
        }

        return false;
    }

    // reverse a linkedList
    public void reverse(){
        Node prev = null;
        Node current = head;
        while(current!=null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public static void main(String[] args){

        SinglyLinkedList list = new SinglyLinkedList();

        list.addFirst(1);
        list.addFirst(2);
        list.displayLL();
        list.addLast(5);
        list.addLast(10);
        list.addLast(15);
        list.displayLL();
        list.addLast(5);
        list.addLast(10);

        list.removeNode(5);
        list.displayLL();

        list.removeallOccurence(10);
        list.displayLL();
        System.out.println(list.search(5));
        System.out.println(list.search(12));


        list.reverse();
        list.displayLL();


    }
}
