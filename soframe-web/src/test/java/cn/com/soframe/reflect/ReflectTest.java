package cn.com.soframe.reflect;

import lombok.SneakyThrows;

import java.lang.reflect.Constructor;

/**
 * @author fujh
 * @since 2020年9月2日14:25:28
 * 获取对象的“反射类”的三种方式。
 */
public class ReflectTest {

    public static void main(String[] args) throws Exception {

        /**
         * 1、通过obj.getClass()来获取到对象的“反射类”。
          */
//        String str = "helloworld";
//        //获得到了str对象的“反射类”
//        Class<? extends String> reflectionClass = str.getClass();
//        Constructor construtor = reflectionClass.getConstructor(String.class);
//        Object wodemaya = construtor.newInstance("输入的内容，这也是新的参数");
//        System.out.println(String.valueOf(wodemaya));

        //Object o = constructors[0].newInstance();
        //String s = reflectionClass.newInstance();


        /**
         * 2、通过Class.ForName来获取指定类路径的“反射类”
         */
        Class<?> strClass = Class.forName("java.lang.String");
        //获得到该Class对象的“构造对象”
        Constructor<?> constructor = strClass.getConstructor(String.class);
        //通过“构造对象”来创建实例
        Object strObj = constructor.newInstance("要输出的值，来了老弟");
        System.out.println(String.valueOf(strObj));

        /**
         * 3、通过.class来获取到一个“反射类”。
         */
//        Class<String> stringClass = String.class;


    }

}
