package Arrays;

import java.util.Arrays;

public class FindDuplicateNumber {
    public static int printDuplicateNumber(int [] arr){
        Arrays.sort(arr);
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i-1] == arr[i])
                return arr[i];

        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,3,4,2,2};
        System.out.println(printDuplicateNumber(arr));
    }
}
