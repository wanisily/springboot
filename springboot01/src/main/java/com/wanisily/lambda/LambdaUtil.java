package com.wanisily.lambda;

import com.wanisily.domain.Dog;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 1. lambda定义
 *  1.1 () -> {} , 这是lambda表达式
 *  1.2 (parameter1,parameter2,...) -> {return result} lambda
 *  1.3 parameter -> result   parameter 只有一个参数可以省略括号，返回参数只有一个result，可以省略 {return}
 *  1.4 parameter1,parameter2 -> result(parameter1,parameter2)
 *      parameter1,parameter2是lambda函数式接口的参数， result式函数式接口的返回值, result方法中可以使用parameter1，parameter2参数，函数式接口只是一个表达式，具体执行逻辑是result方法
 *
 * 2. 对象::实例方法
 *    2.1 参数和返回值可以是一个，也可以为空，也可以是参数为空返回值不为空，参数不为空，返回值为空
 *
 * 3. 类名::静态方法
 *    3.1 参数和返回值可以是一个，也可以为空，也可以是参数为空返回值不为空，参数不为空，返回值为空
 *
 * 4. 类名::实例方法
 *     4.1 会将调用者作为lambda函数类，类上的泛型类的第一个参数
 *
 * 5. 构造方法
 *     5.1 类名::new
 *
 */
public class LambdaUtil {

    public LambdaUtil(LambdaUtil lambdaUtil) {
    }

    public LambdaUtil() {

    }

    public static void main(String[] args) {

//        lambda1("nihao");
//        lambda2("zaijian");
        Dog dog = new Dog();
        lambda3(dog::setName,"1", dog);
    }


    //1 lambda定义
    public static void lambda1(String parameter) {
        Function<String, String> stringStringFunction = (name) -> { return name;};
        String apply = stringStringFunction.apply(parameter);
        System.out.println(apply);
    }


    public static void lambda2(String parameter) {
        Supplier<String> s = () -> parameter;
        String s1 = s.get();
        System.out.println(s1);
    }

    //3
    public static void lambda3(LambdaFunction1<String> l, String name, Dog dog){
        l.test(name);
        System.out.println(dog.getName());

        Dog dg = new Dog();
        dg.setAge(100);
        Supplier<Integer> s = dg::getAge;
        System.out.println(s.get() + ">>>>>>>>>");
        Consumer<Integer> c = dg::setAge;
        c.accept(1001);
        System.out.println(s.get() + "======");
    }



    //4 类::实例方法（非静态方法）
    public static void lambda4(){
        BiPredicate<String, String> sbp = String::equals;
        Function<Dog, String> sbp1 = Dog::getName;
        sbp1.apply(new Dog());

    }

    //5 构造方法
    public static void lambda5(){

        Supplier<LambdaUtil> supplier = LambdaUtil::new;
        Consumer<LambdaUtil> supplier1 = LambdaUtil::new;

    }









}
