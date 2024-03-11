import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        int [] array = {1, 2, 2, 3, 3, 3, 4};
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i = 0; i < array.length; i++) {
            if (!hash.containsKey(array[i]))
                hash.put(array[i], 1);
            else {
                int value = hash.get(array[i]);
                value++;
                hash.put(array[i], value);
            }
        }

        int maxfreq = 0;
        for(int i = 0; i < array.length; i++){
            int value = hash.get(array[i]);
            if(value > maxfreq)
                maxfreq = value;
        }
        System.out.println("Most repeated element: " + maxfreq);
    }
}