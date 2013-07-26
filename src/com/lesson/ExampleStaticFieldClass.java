package com.lesson;

/**
 * Created with IntelliJ IDEA.
 * User: Bishop
 * Date: 18.07.13
 * Time: 11:14
 * To change this template use File | Settings | File Templates.
 */
public class ExampleStaticFieldClass {
    public static int staticField = 6;
    public int nonStaticField;

    public void hello() {
        System.out.println("hello! " + "nonStaticField = " + nonStaticField + ", staticField = " + staticField);
    };

    public static void hello2() {
        System.out.println("hello2! " + "staticField = " + staticField);
    };
}
