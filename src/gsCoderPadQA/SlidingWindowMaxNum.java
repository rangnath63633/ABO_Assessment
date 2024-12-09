package gsCoderPadQA;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindowMaxNum {
    public static void main(String[] args) {
        int[] num = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(findMaxNum(num, k));
    }
    public static String findMaxNum(int[] num, int k){

        if(num.length == 0 && k == 0){
            return "[]";
        }
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<=num.length-k; i++){

            int min = num[i];

            for(int j=1; j<k; j++){
                min = Math.min(min, num[i+j]);
            }
            result.add(min);
        }
        return result.toString();
    }
}
