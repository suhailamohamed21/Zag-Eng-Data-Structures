public class Main {
    public static void main(String[] args) {
        int x, y, sum, mul;
        x = 4;
        y = 5;
        sum = sum(x,y);
        mul= multiply(x,y);
        System.out.println("The multiplication is: "+mul);
        System.out.println("The sum is: "+sum);
    }
    static int multiply(int a, int b){
        return a * b;
    }
    static int sum(int a, int b){
        return a + b;
    }
}