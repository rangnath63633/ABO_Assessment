package DSA_pgms;

import java.util.ArrayList;
import java.util.List;

public class WaterVisible {
    public static void main(String[] args) {
        int[] arr = {1,2,7,3,4,0}; // 7, 4, 0

        System.out.println(findVisibleWater(arr));
    }
    public static List<Integer> findVisibleWater(int[] arr){

        List<Integer> visible = new ArrayList<>();

        int visibleNum = Integer.MIN_VALUE;

        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] > visibleNum){
                visible.add(arr[i]);
                visibleNum = arr[i];

            }
        }
        return visible;
    }
}
