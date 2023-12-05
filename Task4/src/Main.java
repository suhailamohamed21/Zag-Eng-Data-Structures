public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(14);
        list.addFirst(17);
        list.addFirst(19);
        list.addFirst(20);
        list.printElements();
        list.max();
        list.min();
    }
}