import java.util.ArrayList;
public class SummaryRangesBrute {
    public static ArrayList<String> FindRange(int[]arr){
        ArrayList<String>result=new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            // i = range ka start

            int j = i;

            // inner loop: jab tak consecutive hai aage badho
            while(j + 1 < arr.length && arr[j+1] == arr[j] + 1) {
                j++;  // consecutive hai aage badho
            }

            // j pe range khatam hui
            if(i == j) {
                // akela number
                result.add(arr[i] + "");
            } else {
                // range bani
                result.add(arr[i] + "->" + arr[j]);
            }

            i = j;  // i ko range ke end pe le jao
        }
        return  result;


    }
    public static void main(String[]args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        System.out.println(FindRange(arr));
    }
}


