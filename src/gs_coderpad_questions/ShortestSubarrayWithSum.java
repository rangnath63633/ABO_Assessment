package gs_coderpad_questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ShortestSubarrayWithSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2,3};


        List<Integer> dist = Arrays.stream(arr).boxed().filter(n->Arrays.stream(arr).boxed()
                        .filter(m->m.equals(n)).count()>1)
                .distinct().collect(Collectors.toList());

        System.out.println(dist);

    }


}
