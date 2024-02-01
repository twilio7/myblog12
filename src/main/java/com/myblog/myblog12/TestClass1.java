package com.myblog.myblog12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class TestClass1 {
     public static void main(String[] args) {
     List<Integer> data  = Arrays.asList(15,20,80,1,15,20,80);
         List<Integer> newData = data.stream().distinct().sorted().collect(Collectors.toList());
         System.out.println(newData);


     }
}
