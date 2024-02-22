import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String in = input.next();

        int[] freq = new int[26];

        for(int i = 0; i < in.length(); i++)
            freq[in.charAt(i) - 'a']++;

        for(int i = 0; i < freq.length; i++)
            if(freq[i] != 0 && freq[i] == 1)
                System.out.print((char) (i + 'a'));
    }
}