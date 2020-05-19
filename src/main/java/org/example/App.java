package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class App 
{
    public static void main( String[] args )
    {
        Generics<String> obj = new Generics<>();
        Generics old = new Generics();

        System.out.println(areEquals(20, 20));

        List<Integer> integers = new ArrayList<>(Arrays.asList(
                1,2,3
        ));
        addIntegers(integers);
        System.out.println(integers);

        List<Long> longList = new ArrayList<>();

    }

    public static void addIntegers(List<? super Integer> list){
        list.add(45);
    }

    public static <T> boolean areEquals(T first, T last){
        return  first.equals(last);
    }

    public static double sum(List<? extends Number> list){
        double sum = 0;
        for(Number n : list){
            sum += n.doubleValue();
        }
        return sum;
    }


}
