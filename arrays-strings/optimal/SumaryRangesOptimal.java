import java.util.ArrayList;

public class SumaryRangesOptimal {

        public static ArrayList<String> findRange(int[] arr) {
            ArrayList<String> result = new ArrayList<>();

            // Single pass — O(n)
            for(int i = 0; i < arr.length; i++) {
                int start = arr[i];  // range ka start

                // consecutive elements skip karo
                while(i + 1 < arr.length &&
                        arr[i+1] == arr[i] + 1) {
                    i++;
                }

                if(start == arr[i]) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + arr[i]);
                }
            }
            return result;
        }

        public static void main(String[] args) {
            int[] arr = {0, 1, 2, 4, 5, 7};
            System.out.println(findRange(arr));
            // [0->2, 4->5, 7]

            int[] arr2 = {0, 2, 3, 4, 6, 8, 9};
            System.out.println(findRange(arr2));
            // [0, 2->4, 6, 8->9]
        }
    }

