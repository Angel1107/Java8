package com.chuang.test.HanShuShiJieKou;

import java.util.*;
import java.util.function.Predicate;

/**
 * Created by Chuang on 2017/3/10.
 */
public class Java8Tester {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("输出所有数据：");
        // 传递参数 n
        eval(list, n->true);

        System.out.println("输出所有偶数:");
        eval(list, n-> n%2 == 0 );

        System.out.println("输出大于 3 的所有数字:");
        eval(list, n-> n > 3 );
    }
    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list) {
            if(predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }
}
