package com.chuang.test.Lambda;

/**
 * Created by Chuang on 2017/3/10.
 */
public class LambdaTest {
    //编写接口
    interface MathO{
        double math(double a,double b);
    }
    //四则运算通用方法
    public double MathSiZeYunSuan(double a,double b,MathO matho){
        return matho.math(a,b);
    }
    //四则运算实现
    static MathO jiafa = (a,b) -> a + b ;
    static MathO jianfa = (a,b) -> a - b ;
    static MathO chengfa = (a,b) -> { return a * b; } ;
    static MathO chufa = (double a,double b) -> a / b ;

    public static void main(String[] args){
        LambdaTest lt = new LambdaTest();
        System.out.println("加法"+lt.MathSiZeYunSuan(1.8,5.5,jiafa));
        System.out.println("减法"+lt.MathSiZeYunSuan(18,5.5,jianfa));
        System.out.println("乘法"+lt.MathSiZeYunSuan(2,5.5,chengfa));
        System.out.println("除法"+lt.MathSiZeYunSuan(18,5,chufa));
    }
    interface sayHello{
        void sayMessage(String ms);
    }

    static sayHello sayHello1 = ms -> System.out.println("Hello : " + ms);
    static sayHello sayHello2 = (ms) -> System.out.println("Hello : " + ms);

    @org.junit.Test
    public void TestSayHello(){
        sayHello1.sayMessage("张三");
        sayHello2.sayMessage("李四");
    }

}
