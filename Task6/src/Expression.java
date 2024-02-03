import java.util.Stack;

public class Expression {
    public static boolean isvalid(String expression){
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < expression.length(); i++){
            char ch = expression.charAt(i);

            if(isOpenBracket(ch))
                stack.push(ch);
            else if(isClosedBracket(ch)){
                char top = stack.pop();
                if(!isMatch(top, ch))
                    return false;
            }
        }
        return stack.isEmpty();
    }
    private static boolean isOpenBracket(char ch){
        return (ch == '(' || ch == '[' || ch == '{' || ch == '<');
    }

    private static boolean isClosedBracket(char ch){
        return (ch == ')' || ch == ']' || ch == '}' || ch == '>');
    }

    private static boolean isMatch(char open, char close){
        return open == '[' && close == ']' ||
                open == '{' && close == '}' ||
                open == '(' && close == ')' ||
                open == '<' && close == '>' ;
    }
}
