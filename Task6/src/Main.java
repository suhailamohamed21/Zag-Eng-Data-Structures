import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(2);
        stack.push(5);
        stack.push(7);
        stack.push(9);


        System.out.println(stack.pop());
        System.out.println(reverse("ghjlk"));
        System.out.println(Expression.isvalid("<{}>"));
    }
    public static String reverse(String s){
        Stack<Character> stack = new Stack<>();
        String reverse = "";

        for(int i = 0; i < s.length(); i++)
            stack.push(s.charAt(i));

        while (!stack.isEmpty()) {
            reverse += stack.pop();
        }

        return reverse;
    }
}