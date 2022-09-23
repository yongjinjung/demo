package com.app.demo.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex02 {
    

    public static void main(String[] args) {
        int[] arr = {1,5,3,2,4};
        List<Integer> list = new ArrayList<>();


        //컬렉션 프레임워크를 이용한 방식
        for(int i : arr){
            if(i%2 == 1){
                list.add(i);
            }
        }

        Collections.sort(list);

        for(int i : list){ //요소추출
            System.out.println("i = " + i);
        }

        //Stream을 이용한 방식
        Arrays.stream(arr)
                .filter(n -> n%2 ==1)
                .sorted()
                .forEach(n -> System.out.println(n + "\t"));


        List<String> names = Arrays.asList("홍길동", "멀린", "해리포터");
        //사전순 정렬
        names.stream().sorted().forEach( n -> System.out.println("n = " + n));
        //글자 길이순 정렬
        names.stream().sorted(( s1, s2) -> s1.length() - s2.length()).forEach( s -> System.out.println("s = " + s));

        List<String> names2 = Arrays.asList("apple", "banana", "orange");
        //스트림을 이용하여 변환 작업 후 LIST 반환
        List<String> collect = names2.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        collect.stream().sorted().forEach( s -> System.out.println("s = " + s));
        
        
        
        //합
        int sum = IntStream.of(1, 3, 5, 6, 7, 9).sum();
        System.out.println("sum = " + sum);
        
        
        //개수
        long count = IntStream.of(1, 3, 4, 5, 6).count();
        System.out.println("count = " + count);
        
        //평균
        OptionalDouble average = IntStream.of(1, 3, 5, 6, 7, 9).average();
        System.out.println("average = " + average);
        //최종 연산 결과를 변수로 받지 않고 결과가 존재한다면 출력하는 처리를 합니다.
        IntStream.of(1, 3, 5, 6, 7, 9).average().ifPresent(avg -> System.out.println("avg = " + avg));

        IntStream.of(1, 3, 5, 6, 7, 9).max().ifPresent(max -> System.out.println("max = " + max));
        IntStream.of(1, 3, 5, 6, 7, 9).min().ifPresent(min -> System.out.println("min = " + min));


        String name = names.stream().reduce("이순신", (s1, s2) -> {
            System.out.println("s1 = " + s1);
            System.out.println("s2 = " + s2);

            return s1.length() >= s2.length() ? s1 : s2;
        });

        names = Arrays.asList("해리포터", "멀린", "해리포터");
        String name2 = names.stream().reduce("이순신", (s1, s2) -> {
            System.out.println("s1 = " + s1);
            System.out.println("s2 = " + s2);

            return s1.length() >= s2.length() ? s1 : s2;
        });
        System.out.println("name2 = " + name2);

    }
}