package xyz;

import java.util.Arrays;
import java.util.Comparator;

public class SortLastDigitInNum {
    public static void main(String[] args) {
        int[] num = {23,21,30,42};
        Integer[] numObj = Arrays.stream(num).boxed().toArray(Integer[]::new);
        Arrays.sort(numObj, Comparator.comparingInt(a -> a % 10));
        num = Arrays.stream(numObj).mapToInt(Integer::intValue).toArray();

//        for(int i=0; i<num.length-1; i++){
//            for(int j=0; j<num.length-1-i; j++) {
//                if (num[j] % 10 > num[j+1] % 10) {
//                    int temp = num[j];
//                    num[j] = num[j+1];
//                    num[j+1] = temp;
//                }
//            }
//        }
        for(int i:num)
            System.out.print(i+" ");
    }
}
