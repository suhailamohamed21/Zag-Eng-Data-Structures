import java.util.NoSuchElementException;

public class StackLinkedList {
    private class Node{
        int value;
        Node down;
        public Node(int v){
            value = v;
        }
    }
    Node top;
    public boolean isempty(){
        return top == null;
    }

    public void push(int value){
        Node node = new Node(value);
        node.down = top;
        top = node;
    }

    public int peek(){
        if(isempty())
            throw new NoSuchElementException();

        return top.value;
    }

    public int pop(){
        if (isempty())
            throw new NoSuchElementException();

        Node temp = top;
        top = top.down;
        temp.down = null;

        return temp.value;
    }
}
