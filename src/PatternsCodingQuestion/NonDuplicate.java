package PatternsCodingQuestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class NonDuplicate {
    public static void main(String[] args) {

        int[] arr = {2, 3, 3, 3, 6, 9, 9};
        System.out.println(findNonDuplicateNumber(arr));
        System.out.println(findNonDuplicateNumber2(arr));
        System.out.println(findNonDuplicateNumber3(arr));
    }
    public static int findNonDuplicateNumber(int[] arr){

        Set<Integer> set = new HashSet<>();
        for (int i : arr){
            if(set.add(i));
        }
        System.out.print("Unique values: [");
        int count=0;
        for (int i : set){
            System.out.print(i);
            if(count < set.size()-1){
                System.out.print(", ");
            }
            count++;
        }
        System.out.println("]");
        return set.size();
    }

    public static int findNonDuplicateNumber2(int[] arr){
        int[] uniqueValues = Arrays.stream(arr).distinct().toArray();

        System.out.print("Unique values: [");
        System.out.print(Arrays.stream(uniqueValues)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ")));
        System.out.println("]");
        return uniqueValues.length;
    }
    public static int findNonDuplicateNumber3(int[] arr) {
        int nextNonDuplicate = 1;

        for(int i=1; i<arr.length; i++){
            if(arr[nextNonDuplicate -1] != arr[i]){
                arr[nextNonDuplicate] = arr[i];
                nextNonDuplicate++;
            }
        }
        for (int i : arr)
            System.out.print(i+", ");
        return nextNonDuplicate;
    }
}
