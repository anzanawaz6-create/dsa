public class ContainsDuplicateBrute {
    public static boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
    }
public static void main(String[]args){
    int[] arr = {0, 1, 2, 4, 5, 7};
    System.out.println(containsDuplicate(arr));
}

}
