import java.util.HashSet;

public class ContainsDuplicateOptimal {
    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
    public static void main(String[]args){
        int[]arr={1,2,3,4,1,5,4};
        System.out.println(containsDuplicate(arr));

    }
}
