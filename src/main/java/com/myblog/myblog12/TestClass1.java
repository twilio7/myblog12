package com.myblog.myblog12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class TestClass1 {
    public static void main(String[] args) {
        List<String> numbers  = Arrays.asList("deepak","virendra","deepak","sonu");
        List<String>  data1 = numbers.stream().filter(s-> s.startsWith("v")).collect(Collectors.toList());
        List<String>  data2 = numbers.stream().filter(s-> s.equals("deepak")).collect(Collectors.toList());
        List<String>  data3 = numbers.stream().filter(s-> s.endsWith("u")).collect(Collectors.toList());
        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);
    }
}
