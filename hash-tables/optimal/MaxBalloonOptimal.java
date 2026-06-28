public class MaxBalloonOptimal {
    public static int maxNumberOfBalloons(String text) {

        int[] freq = new int[26];

        for (char c : text.toCharArray()) {
            freq[c - 'a']++;
        }

        return Math.min(
                Math.min(freq['b' - 'a'], freq['a' - 'a']),
                Math.min(
                        Math.min(freq['l' - 'a'] / 2, freq['o' - 'a'] / 2),
                        freq['n' - 'a']
                )
        );
    }
    public static void main(String[]args){
        maxNumberOfBalloons("ibalonelo");

    }
}
