public class IsSubsequenceOptimal {
    public static Boolean IsSubsequence(int[]arr1,int[]arr2){
        int j=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==arr2[j]){
                j++;
                if(j== arr2.length){
                    return true;

                }
            }
        }
        return false;
    }
    public static void main(String[]args){
        int[]arr1={1,2,3,4,5};
        int[]arr2={1,3,5};
        System.out.println( IsSubsequence(arr1,arr2));

    }
}
