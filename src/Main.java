import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //Write a  program move all 1 to beginning and 0 to end of the given array,without using any built-in sorting functions.
        //
        //ex
        //
        //input array ={1,0,1,0,1,0,1,0};
        //
        //output array  ={1,1,1,1,0,0,0,0};
        //

        int [] arr = {1,0,1,0,1,0,1,0};

        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::print);

        System.out.println("");
        
        int count=0;
        int charToMove = 1;
        for(int i=0; i< arr.length; i++){
            if(arr[i] == charToMove){
                arr[count++]=charToMove;
            }
        }

        for(int j=count; j< arr.length; j++){
            arr[j]=0;
        }

        int count1=0;

        for (int a:arr){
            System.out.print(a);
            count1++;
            if(count1 < arr.length) {
                System.out.print(",");
            }
        }
    }
}

///  select  salary from emp order by salary desc limit 1 offset 2