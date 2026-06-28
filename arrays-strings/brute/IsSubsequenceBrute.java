public class IsSubsequenceBrute {
    public static boolean IsSubsequence(int[] arr1, int[] arr2) {
        int Index = -1;
        for(int j = 0; j < arr2.length; j++) {
            boolean found = false;

            for(int i = Index + 1; i < arr1.length; i++) {
                if(arr1[i] == arr2[j]) {
                    Index = i;
                    found = true;
                    break;
                }
            }
            if(!found) return false;
        }
        return true;
    }
    public static void main(String[]args){
            int[]arr1={1,2,3,4,5};
            int[]arr2={1,3,5};
            System.out.println( IsSubsequence(arr1,arr2));
    }

}
