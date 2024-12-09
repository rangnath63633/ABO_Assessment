package xyz;

import java.util.HashSet;

public class TwoSumMatch {
    public static void main(String[] args) {


//        String s1 = "HELLO"; //1
//        String s2 = "HELLO"; //1
//        String s3 =  new String("HELLO"); //2
//        System.out.println(s1 == s2); //true
//        System.out.println(s1 == s3); //false
//        System.out.println(s1.equals(s2)); //true
//        System.out.println(s1.equals(s3));//true
        int[] arr={1,2,4,5,6,8,10};
        for(int i=0; i<arr.length; i++){
            findTwoSumMatch(arr, arr[i]);
        }
    }
    public static void findTwoSumMatch(int[] arr, int target){
        HashSet<Integer> set = new HashSet<>();
        for(int n:arr){
            int sum = target-n;
            if(set.contains(sum)){
                System.out.println("Target :"+target+"("+sum+","+n+")");
            }
            set.add(n);
        }

    }
}

