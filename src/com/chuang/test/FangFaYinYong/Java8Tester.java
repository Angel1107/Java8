package com.chuang.test.FangFaYinYong;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chuang on 2017/3/10.
 */
public class Java8Tester {
    public static void main(String args[]){
        List names = new ArrayList();

        names.add("Google");
        names.add("Firefox");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");

        names.forEach(System.out::println);
    }
}
