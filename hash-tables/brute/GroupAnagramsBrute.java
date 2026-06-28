import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagramBrute {
    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {

            if (visited[i])
                continue;

            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;

            for (int j = i + 1; j < strs.length; j++) {

                if (!visited[j] && ValidAnagramBrute.isAnagram(strs[i], strs[j])) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }

            result.add(group);
        }

        return result;
    }
    private boolean isAnagram(String a, String b) {

        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        return Arrays.equals(x, y);
    }
    public static void main(String[]args){
        String[]arr={"shuhdehd","jdjhdehe","sswhhwgeh"};
        System.out.println(groupAnagrams(arr));

    }
}
