import java.util.NoSuchElementException;

public class LinkedList {
    class Node{
        int value;
        Node nextNode;
        public Node(int v){
            value = v;
        }
    }
    Node head;
    Node tail;
    int size = 0;
    public void addFirst(int item){        //O(1)
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
    public void addLast(int item){         //O(1)
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
    public int indexOf(int item){            //O(n)
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
    public boolean contains(int value){       //O(n)
        int index = indexOf(value);
        return index != -1;
    }
    public int getSize() {                     //O(n)
        Node current = head;
        int index = 0;
        while (current != null) {
            index++;
            current = current.nextNode;
        }
        return index;
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
    public void max(){                        //O(n)
        if(isEmpty()){
            throw new NoSuchElementException("empty list");
        }

        Node max = head;
        Node current = head;
        while (current != null) {
            if(current.value > max.value)
                max.value = current.value;
            current = current.nextNode;
        }
        System.out.println("Max value is: "+ max.value);
    }
    public void min(){                         //O(n)
        if(isEmpty()){
            throw new NoSuchElementException("empty list");
        }

        Node min = head;
        Node current = head;
        while (current != null) {
            if(current.value < min.value)
                min.value = current.value;
            current = current.nextNode;
        }
        System.out.println("Min value is: "+ min.value);
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
}
