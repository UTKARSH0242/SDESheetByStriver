package Arrays;

import java.util.Arrays;

public class  SortAnArrayOf0s1s2s {
    public static void sortAnArrayOf0s1s2s(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        int temp;
        while (mid<=high){
            switch (arr[mid]) {
                case 0 -> {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                }
                case 1 -> mid++;
                case 2 -> {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr ={2,0,2,1,1,0};
        sortAnArrayOf0s1s2s(arr);
        System.out.println(Arrays.toString(arr));



    }
}
