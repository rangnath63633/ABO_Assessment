package gsCoderPadQA;

import java.util.Arrays;

public class StringDirection {
    public static void main(String[] args) {
        String input = "URLURL";
        int[] result = findStringDirection(input);
   //     System.out.println("["+result[0]+","+result[1]+"]");
        System.out.println(Arrays.toString(result));
    }
    public static int[] findStringDirection(String direction){
        int x=0, y=0;
        for(int i=0; i<direction.length(); i++){
            char ch = direction.charAt(i);
            switch (ch){
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'R':
                    x++;
                    break;
                case 'L':
                    x--;
                    break;
            }
        }
        return new int[]{x,y};
    }
}
