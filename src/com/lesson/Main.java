package com.lesson;

/**
 * Created with IntelliJ IDEA.
 * User: Bishop
 * Date: 14.06.13
 * Time: 14:41
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args){
        /*
        ExampleStaticFieldClass exampleStaticFieldClass = new ExampleStaticFieldClass();
        exampleStaticFieldClass.nonStaticField = 4;
        //exampleStaticFieldClass.staticField = 4;
        ExampleStaticFieldClass.staticField = 4;

        ExampleStaticFieldClass exampleStaticFieldClass2 = new ExampleStaticFieldClass();
        exampleStaticFieldClass2.nonStaticField = 5;
        //exampleStaticFieldClass2.staticField = 5;
        ExampleStaticFieldClass.staticField = 5;

        System.out.println("non static: " + exampleStaticFieldClass.nonStaticField + ", " + exampleStaticFieldClass2.nonStaticField);
        System.out.println("static    : " + ExampleStaticFieldClass.staticField + ", " + ExampleStaticFieldClass.staticField);

        exampleStaticFieldClass.hello();
        ExampleStaticFieldClass.hello2();
        */
        Field field = new Field();
        field.showField();

        System.out.println();
        field = new Field(7);
        field.showField();
    }
}
// 01101100 = 4 + 8 + 32 + 64 = 108
/*
    byte    - 8 bit
    short   - 16 bit
    int     - 32 bit
    long    - 64 bit

    float   - 32 bit
    double  - 64 bit
*/

// принцип KISS - keep it simple stupid

// 27.06.2013
// изучаем char, boolean, float, double, а также о бинарных операциях

/*
13 делим на 2
6 с отатком - 1
6 на 2
3 без остатка - 01
3 на 2
1 с остатком - 101
1 на 2
остаток - 1101
13 = 00001101
*/