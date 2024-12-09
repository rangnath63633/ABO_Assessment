package xyz;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Example4 {
//    Input:
//    String str="RanganathaBR";
//    Output:
//    g, t, h, B

    public static void main(String[] args) {
        String str = "RanganathaBR";
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<str.length();i++){
            Character c = str.charAt(i);
            Integer val = map.get(c);
            val = (val != null) ? val+1 : 1;
            map.put(c,val);
        }

        Set<Map.Entry<Character, Integer>> ss  =map.entrySet();
        for(Map.Entry<Character, Integer> ent: ss) {
            if(ent.getValue() ==1)
                System.out.println(ent.getKey());
        }

    }
    /**
     *
     * Emp, Adderes
     * Select e.name, e.empId, a.street from emp e left join Address a on e.adressId = a.addressId;
     *
     * SELECT e.name, e.empId,(SELECT a.street FROM Address a WHERE a.addressId = e.adressId) AS street FROM emp e;
     *
     *
     *
     *
     *
     */
    // project explanation
    // @Transaction -> detail explanation
    // @SpringBootApplication -> detail explanation
    // example one class have 3 methode and one main method,tell me how many threads running
    // microservices and Monolithic -> detail explanation
    //how internally hashMap work
}


