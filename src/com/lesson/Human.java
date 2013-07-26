package com.lesson;

/**
 * Created with IntelliJ IDEA.
 * User: Bishop
 * Date: 18.07.13
 * Time: 11:10
 * To change this template use File | Settings | File Templates.
 */
public class Human {
    private static final int MIN_AGE = 14;
    private static final int MAX_AGE = 130;
    private static final int MIN_NAME_LENGTH = 3;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (newName != null && newName.length() >= MIN_NAME_LENGTH) {
            this.name = newName;
        }
    }

    private String name;

    public int getAge() {
        return age;
    }

    private int age;

    public void setAge(int newAge) {
        if (newAge > MIN_AGE && newAge < MAX_AGE) {
            age = newAge;
        }
    }
}
