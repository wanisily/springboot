package com.wanisily.optional;

import com.wanisily.domain.Dog;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setAge(1);
        dog.setName("nihao");

        of(dog);
        ofNullable(dog);
        get(dog);
        getOrElseGet(dog);
        getOrElse(dog);
        orElseThrow(dog);
    }


    public static void of(Dog dog){
        /*两行*/
        Optional<String> opt = Optional.of(dog).map(Dog::getName);
        opt.ifPresent(System.out::println);
        /*一行*/
        Optional.of(dog).map(Dog::getName).ifPresent(System.out::println);
    }

    public static void ofNullable(Dog dog){
        //dog == null, return Optionalss.Empty
       Optional.ofNullable(dog).map(Dog::getName).ifPresent(System.out::println);
    }

    public static void get(Dog dog){
        //get 会抛出空指针，如果不执行isPrent检查
        String s = Optional.ofNullable(dog).map(Dog::getName).get();
    }

    public static void getOrElseGet(Dog dog){
        String s = Optional.ofNullable(dog).map(Dog::getName).orElseGet(() -> "wangwu");
        System.out.println(s);
    }

    public static void getOrElse(Dog dog){
        //orElse与orElseGet区别在于，orElse括号里是已经执行后传递的结果，不管value是不是空, orElseGet传递的是lambada，value为空的时候才执行
        String s = Optional.ofNullable(dog).map(Dog::getName).orElse("wangwu");
        System.out.println(s);
    }

    public static void orElseThrow(Dog dog){
        //orElse与orElseGet区别在于，orElse括号里是已经执行后传递的结果，不管value是不是空, orElseGet传递的是lambada，value为空的时候才执行
        String s = Optional.ofNullable(dog).map(Dog::getName).orElseThrow(() ->  new RuntimeException("null空指针"));
        System.out.println(s);

    }


}
