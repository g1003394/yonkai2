package org.example;

import java.util.List;

public class fruits {
        public static void main(String[] args){
            List<String> fruitnames = List.of("apple", "grape", "banana");
            List<String> result = fruitnames.stream().filter(fn -> fn.length() == 5).toList();
            System.out.println(result);

            fruitnames.stream().map(String::toUpperCase).forEach(System.out::println);
        }
    }
