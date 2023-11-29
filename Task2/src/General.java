import java.util.Random;

public class General {
    public static int returnRandom(int value){
        return (int)(Math.random()*(value+1));
    }

    public static int returnRandom(int min, int max){
        return (int)(min+(Math.random()*(max-min)));
    }

    public static char returnRandom(char ch){
        Random random = new Random();
        return (char) ('a' + random.nextInt(26));
    }

    public static int numReverse(int number){
        int reverse = 0;
        while (number != 0){
            int reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number/10;
        }
        return reverse;
    }

    public static <E> void printArray(E [] arr){
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

}
