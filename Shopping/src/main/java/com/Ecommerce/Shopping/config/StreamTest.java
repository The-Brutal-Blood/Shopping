package com.Ecommerce.Shopping.config;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {
    public static void main(String[]args){

        List<Integer> numbers = List.of(2,4,5,8,7,10,12,11);
        List<Integer> evenNumbers = new ArrayList<>();
        // Traditional Way
        for(int n : numbers) {
                 if (n > 2 && n % 2 == 0) {
                    evenNumbers.add(n);
                }
            }
        System.out.println("Even Numbers are : "+ evenNumbers);


        //stream

        List<Integer> streamEvens =  numbers.stream()
                .filter(n-> n>2 && n%2==0)
                .map(n -> n*2)
                .toList();
        System.out.println(streamEvens);
    }


}
