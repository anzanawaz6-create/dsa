
public class FindClosestToZeroBrute {
    public static int distance(int[]arr1){
        int clossest=arr1[0];
        for(int i=1;i<arr1.length;i++){

            int current=arr1[i];
            if(Math.abs(current)<Math.abs(clossest)){
                clossest=current;
            }
            else if(Math.abs(current-0)==Math.abs(clossest-0)){
                clossest=Math.max(clossest,current);
            }
        }
        return clossest;

    }
    public static void main(String[] args) {
        int[]arr1={2,-1,3,4,1};
        System.out.println(distance(arr1));


    }
}
