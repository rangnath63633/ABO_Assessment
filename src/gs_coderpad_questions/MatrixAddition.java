package gs_coderpad_questions;

import java.util.Arrays;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] input = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        toAddition(input);
    }
    public static void toAddition(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(i == 0 && j != 0){
                    arr[i][j] = arr[i][j-1] + arr[i][j];
                }else if(i != 0 && j==0){
                    arr[i][j] = arr[i-1][j] +arr[i][j];
                }else if(i != 0 && j != 0){
                    arr[i][j] = arr[i-1][j] + arr[i][j-1] - arr[i-1][j-1] + arr[i][j];//3+5-1+5
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
