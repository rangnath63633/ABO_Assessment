package xyz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example5 {
    public static void main(String[] args) {
        List<Integer> arr1 = List.of(1,10,15,100,4,5,6); // 1,10,15,100
        arr1.stream().filter(x->String.valueOf(x).startsWith("1")).forEach(System.out::println);
//        List<Integer> arr2 = List.of(12,14,16);
//        Stream.of(arr1,arr2).flatMap(x->x.stream()).forEach(System.out::println);

        try{
            System.out.println("Try block");
        }
//        System.out.println("--------------");
        catch(Exception e){
            System.out.println("");
        }

    }
}

/**
 * try
 *         {
 *             System.out.println("Try Block");
 *         }
 *
 *         System.out.println("-----");
 *
 *         catch (Exception e)
 *         {
 *             System.out.println("Catch Block");
 *         }
 * has context menu
 */

/*

int i = 1;

        try
        {
            i++;
        }
        catch (Exception e)
        {
            i++;
        }
        finally
        {
            i++;
        }

        System.out.println(i);
    }
has context menu
 */