public class Main {
    public static void main(String[] args) {
        GLinkedList <String> list = new GLinkedList<>();
        list.addFirst("ahmed");
        list.addFirst("ali");
        list.addFirst("omar");
        list.addFirst("mohamed");

        list.printElements();
        list.reverse();
        list.printElements();
    }
}