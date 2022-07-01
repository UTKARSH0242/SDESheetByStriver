package Arrays;

import java.util.Arrays;

public class DuplicateNumber {
    static boolean isDuplicate(int [] arr){
        if (arr == null || arr.length <2) return false;

        Arrays.sort(arr);
        for (int i = 1; i< arr.length; i++){
            if (arr[i-1] == arr[i]) return true;

        }
        return false;
    }
    public static void main(String[] args) {
        int []  arr = {2,5,9,6,9,3,8,9,7,1};
        System.out.println(isDuplicate(arr));


    }
}
