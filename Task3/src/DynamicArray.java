public class DynamicArray {
    int [] items;
    int size = 0;
    int count = 0;

    public DynamicArray(int num){
        size = num;
        items = new int[size];
    }
    public DynamicArray(){
        size = 20;
        items = new int[size];
    }
    public void printArray(){
        for(int i = 0; i < count; i++)
            System.out.println(items[i]);
    }
    public void insert(int item){
        if(count == size)
            createArray();

        items[count] = item;
        count++;
    }
    private void createArray(){
        size = size * 2;
        int [] newArray = new int[size];
        for(int i = 0; i < count; i++)
            newArray[i] = items[i];

        items = newArray;

    }
    public void removeAt(int index){
        if(index < 0 || index > count)
            throw new IllegalStateException("not valid index");

        for(int i = index; i < count - 1; i++)
            items[i] = items[i+1];
        count--;
    }
    public int indexOf(int item){
        for(int i = 0; i < count; i++)
            if(items[i] == item)
                return i;

        return -1;
    }
    public int at(int index){
        for(int i = 0; i < count; i++)
            if(i == index)
                return items[index];
        return -1;
    }
    public void max(){
        int max = 0;
        for(int i = 0; i < count; i++)
            if(items[i] > max)
                max = items[i];
        System.out.println("Max number in items is: "+ max);
    }
    public void min(){
        int min = items[0];
        for(int i = 0; i < count; i++)
            if(items[i] < min)
                min = items[i];
        System.out.println("Min number in items is: "+ min);
    }
    public void remove(int item){
        int index = indexOf(item);
        removeAt(index);
    }
}
