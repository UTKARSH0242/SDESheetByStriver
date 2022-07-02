package Arrays;

public class MaximumSubArraySum {
    public static int maxSuArray(int [] arr , int n) {
        int curSum = 0;
        int maxSum = 0;
        for (int i = 0; i <n ; i++) {
            curSum += arr[i];
            if (curSum> maxSum) maxSum = curSum;
            if (curSum <0) curSum = 0;

        }
        return maxSum;
    }
    public static void main(String[] args) {
        int [] arr = {-2,-4,-5,-6,-3,-1};
        int n = arr.length;
        System.out.println(maxSuArray(arr,n));

    }
}
