package gsCoderPadQA;

import java.util.ArrayList;
import java.util.List;

public class PrefixSearch {
    public static void main(String[] args) {
        //Prefix search - ‘Given document, give one prefix -> need to search Document for
        // ‘all occurrences of the prefix ‘
        String document = "This is a simple example. This example is just for demonstration.";
        String prefix = "ex";

        List<Integer> occurrences = findPrefixSearch(document, prefix);
        System.out.println(occurrences);
    }
    public static List<Integer> findPrefixSearch(String document, String prefix){

        List<Integer> result = new ArrayList<>();
        int index = document.indexOf(prefix);

        while (index >= 0){
            result.add(index);
            index = document.indexOf(prefix, index+1);
        }
        return result;
    }
}
