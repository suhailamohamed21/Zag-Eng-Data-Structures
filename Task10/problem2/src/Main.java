
    import java.util.HashMap;
        public class Main {
            public static void main(String[] args) {
                String s = "they have apples";
                HashMap<Character, Integer> hash = new HashMap<>();

                for(int i = 0; i < s.length(); i++) {
                    if (!hash.containsKey(s.charAt(i)))
                        hash.put(s.charAt(i), 1);
                    else {
                        int value = hash.get(s.charAt(i));
                        value++;
                        hash.put(s.charAt(i), value);
                    }
                }

                System.out.println("Not repearted characters: ");
                
                for(int i = 0; i < s.length(); i++)
                    if(hash.get(s.charAt(i)) == 1)
                        System.out.println(s.charAt(i));
            }
        }