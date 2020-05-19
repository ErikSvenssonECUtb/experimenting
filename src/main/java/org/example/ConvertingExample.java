package org.example;

public class ConvertingExample {

    public static void main(String[] args) {
        StringToInteger converter = new StringToInteger();
        Integer i = convertThings("1", converter);
        System.out.println(i);
    }

    public static <T,R> R convertThings(T t, Converter<T,R> converter){
        return converter.covert(t);
    }

}

class StringToInteger implements Converter<String, Integer>{
    @Override
    public Integer covert(String s) throws NumberFormatException {
        return Integer.valueOf(s);
    }
}

interface Converter<T, R> {
    R covert(T t);
}
