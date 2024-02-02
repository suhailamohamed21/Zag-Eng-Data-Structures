import java.util.NoSuchElementException;

public class GLinkedList<E> {
    class Node{
        E value;
        Node nextNode;
        public Node(E v){
            value = v;
        }
    }
    Node head;
    Node tail;
    int size = 0;
    public void addFirst(E item){        //O(1)
        Node node = new Node(item);
        if(isEmpty()){
            head = tail = node;
            size++;
            return;
        }
        node.nextNode = head;
        head = node;
        size++;
    }
    public void addLast(E item){         //O(1)
        Node node = new Node(item);
        if(isEmpty()){
            head = tail = node;
            size++;
            return;
        }
        tail.nextNode = node;
        tail = node;
        size++;
    }
    public void removeFirst(){             //O(1)
        if(isEmpty()){
            throw new NoSuchElementException("empty list");
        }

        if(head == tail){
            head = tail = null;
            size--;
            return;
        }

        Node temp = head;
        head = head.nextNode;
        temp.nextNode = null;
        size--;
    }
    public void removeLast(){               //O(n)
        if(isEmpty()){
            throw new NoSuchElementException("empty list");
        }

        if(head == tail){
            head = tail = null;
            size--;
            return;
        }

        Node beforeLast = getBeforeLast();
        tail = beforeLast;
        tail.nextNode = null;
        size--;
    }
    public int indexOf(E item){            //O(n)
        Node current = head;
        int index = 0;
        while (current != null){
            if (current.value == item)
                return index;

            index++;
            current = current.nextNode;
        }
        return -1;
    }
    public boolean contains(E value){       //O(n)
        int index = indexOf(value);
        return index != -1;
    }
    public int getSize() {                     //O(n)
        return size;
    }
    public void printElements(){               //O(n)
        if(isEmpty()){
            throw new NoSuchElementException("empty list");
        }

        if(head == tail){
            System.out.println(head.value);
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.println(current.value);
            current = current.nextNode;
        }
    }
    public Node getBeforeLast(){
        Node current = head;
        Node beforeLast = head;
        while(current.nextNode != null){
            beforeLast = current;
            current = current.nextNode;
        }
        return beforeLast;
    }

    private boolean isEmpty(){
        return head == null;
    }

    public void reverse(){
        if(isEmpty())
            return;

        Node previous = head;
        Node current = head.nextNode;

        while (current != null){
             Node next = current.nextNode;
             current.nextNode = previous;
             previous = current;
             current = next;
        }

        Node temp = head;
        head = tail;
        tail = temp;
        tail.nextNode = null;
    }
}