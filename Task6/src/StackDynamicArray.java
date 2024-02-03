import java.util.NoSuchElementException;

public class StackDynamicArray {
    int[] items;
    int size = 0;
    int count = 0;
    public StackDynamicArray(int s){
        size = s;
        items = new int[size];
    }
    public StackDynamicArray(){
        size = 100;
        items = new int[size];
    }

    public void push(int val){
        if(size == count)
            createNewArray();

        items[count] = val;
        count++;
    }

    public void createNewArray(){
        size *= 2;
        int[] newArray = new int[size];
        for(int i = 0; i < count; i++)
            newArray[i] = items[i];
        items = newArray;
    }
    public boolean isempty(){
        return count == 0;
    }

    public int peek(){
        if(isempty())
            throw new NoSuchElementException();

        return items[count - 1];
    }

    public int pop(){
        if(isempty())
            throw new NoSuchElementException();

        int temp = items[count - 1];
        count--;
        return temp;
    }
}

