public class Main {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray(10);
        array.insert(10);
        array.insert(20);
        array.insert(60);
        array.insert(80);
        array.insert(100);
        array.printArray();
        array.max();
        array.min();
        System.out.println(array.indexOf(60));
    }
}