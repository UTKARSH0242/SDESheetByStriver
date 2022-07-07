package Arrays;

public class RotateMatrix {
    static void printMatrix(int[][] a) {
        int n = a.length;
        for (int[] ints : a) {
            for (int j = 0; j < n; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
    static void rotate(int [][] arr){
        int n= arr.length;
        for (int i = 0; i <n ; i++) {
            for (int j = i; j <n ; j++) {
                int swap = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = swap;

            }
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n/2 ; j++) {
                int swap = arr[i][j];
                arr[i][j] = arr[i][n-j-1];
                arr[i][n-j-1] = swap;

            }

        }
    }
    public static void main(String[] args) {
        int[][] arr = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
//        printMatrix(arr);
        rotate(arr);
        printMatrix(arr);


    }
}
