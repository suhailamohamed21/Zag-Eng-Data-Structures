import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int min = 5, max = 33;
        int random = General.returnRandom(min, max);
        System.out.println(random);


        int number = 435346;
        int reverse = General.numReverse(number);
        System.out.println(reverse);
    }
}