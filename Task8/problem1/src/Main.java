
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 2, 3, 4, 8, 3, 9};
        int max = getMax(array);
        int[] freq = new int[max +1];

        for(int i = 0; i < array.length; i++)
            freq[array[i]]++;

        for(int i = 0; i < freq.length; i++)
            if(freq[i] != 0)
                System.out.println(i + " : " + freq[i]);
    }
    private static int getMax(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++)
            if(array[i] > max)
                max = array[i];

        return max;
    }
}