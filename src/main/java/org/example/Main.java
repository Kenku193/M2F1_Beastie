package org.example;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList(); // Type interface - выведение типа
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);

        Stream<Integer> stream = list.stream();


//        Integer first = stream
//                .filter((s) -> s != 4) // ОТФИЛЬТРОВАЛИСЬ И ПОЛЧИЛИ РЕЗУЛЬТАТ №1
//                .limit(3) // РЕЗУЛЬТАТ №1 ОТРЕЗАЕТСЯ ДО 3-Х ПЕРВЫХ ЭЛЕМЕНТОВ И ПОЛЧИЛИ РЕЗУЛЬТАТ №2
//                .skip(2) // РЕЗУЛЬТАТ №2 ПРОПУСКАЕТСЯ ПЕРВЫЕ ДВА ЭЕЛЕМЕНТА И ПОЛЧИЛИ РЕЗУЛЬТАТ №2
//                .findFirst() // ИЗ РЕЗУЛЬТАТА №3 БЕРЕМ ТОЛЬКО ПЕРВЫЙ ЭЛЕМЕНТ
//                .orElseThrow();
//
//        System.out.println(first);

        Long count = stream
                .filter((s) -> s != 4) // ОТФИЛЬТРОВАЛИСЬ И ПОЛЧИЛИ РЕЗУЛЬТАТ №1
                .limit(3) // РЕЗУЛЬТАТ №1 ОТРЕЗАЕТСЯ ДО 3-Х ПЕРВЫХ ЭЛЕМЕНТОВ И ПОЛЧИЛИ РЕЗУЛЬТАТ №2
                .skip(2) // РЕЗУЛЬТАТ №2 ПРОПУСКАЕТСЯ ПЕРВЫЕ ДВА ЭЕЛЕМЕНТА И ПОЛЧИЛИ РЕЗУЛЬТАТ №2
                .count();

        System.out.println(count);



    }
}