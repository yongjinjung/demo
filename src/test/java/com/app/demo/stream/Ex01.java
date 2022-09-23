package com.app.demo.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex01 {
    

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        //스트림 연산은 중간 연산과 최종 연산으로 구분됩니다.
        //스트림 생성
        IntStream stm1 = Arrays.stream(arr);
        
        //중간 연산 - filter() : 조건에 맞는 요소 추출, map() : 조건에 맞는 요소 변환, sorted() : 정렬
        IntStream stm2 = stm1.filter(n -> n%2 == 1);
        
        //최종연산 - forEach, count, sum
        int sum = stm2.sum();


        System.out.println("sum = " + sum);
        
        //파이프라인 구성
        //Stream을 두번 호출했을 때 문제가 발생
        //sum = stm1.filter(n -> n%2 == 1).sum();
        //스트림을 다시 생성한다.
        sum = Arrays.stream(arr).filter(n -> n%2 == 1).sum();
        System.out.println("sum = " + sum);
    }
}