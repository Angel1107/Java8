package com.chuang.test.FangFaYinYong;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * Created by Chuang on 2017/3/10.
 */
public class Car {
    public static Car create( final Supplier< Car > supplier ) {
        return supplier.get();
    }
    /**
     * 构造器引用：它的语法是Class::new，或者更一般的Class< T >::new
     */
    final Car car = Car.create( Car::new );
    final List< Car > cars = Arrays.asList( car );


    public static void collide( final Car car ) {
        System.out.println( "Collided " + car.toString() );
    }
    /**
     * 静态方法引用：它的语法是Class::static_method
     */
    public void aa() {
        cars.forEach(Car::collide);
    }


    public void follow( final Car another ) {
        System.out.println( "Following the " + another.toString() );
    }
    /**
     * 特定类的任意对象的方法引用：它的语法是Class::method
     * @param another
     */
    public void bb() {
        cars.forEach(Car::repair);
    }

    /**
     * 特定对象的方法引用：它的语法是instance::method
     */
    public void cc(){
        final Car police = Car.create( Car::new );
        cars.forEach( police::follow );
    }

    public void repair() {
        System.out.println( "Repaired " + this.toString() );
    }
}
