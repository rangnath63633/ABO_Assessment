package gsCoderPadQA;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class MostFrequentIPAddress {

    public static void main(String[] args) {
        Vector<String> ipAddress = new Vector<>();
        ipAddress.add("192.168.1.1");
        ipAddress.add("192.168.1.1");
        ipAddress.add("192.168.1.2");
        ipAddress.add("192.168.1.3");
        ipAddress.add("192.168.1.2");
        ipAddress.add("192.168.1.1");
        System.out.println(findMostFrequentIPAddress(ipAddress));
    }
    public static String findMostFrequentIPAddress(Vector<String> ipAddress){
        Map<String, Integer> mostIpAddress = new HashMap<>();

        for (String s : ipAddress){
//            String[] re = s.split(" ");
//            mostIpAddress.put(re[0],mostIpAddress.getOrDefault(re[0],0)+1);
            mostIpAddress.put(s,mostIpAddress.getOrDefault(s,0)+1);
        }
        String mostFrequentIpAdd = "";
        int mostCount = 0;
        for(Map.Entry<String,Integer> entry : mostIpAddress.entrySet()){
            if(entry.getValue() > mostCount){
                mostFrequentIpAdd = entry.getKey();
                mostCount = entry.getValue();
            }
        }
        return mostFrequentIpAdd;
    }
}
