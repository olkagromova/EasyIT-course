package com.company.task2;

public class Friend {
    private String name;
    private  int age;
    private Hobby hobby;

    public Friend(String name, int age, Hobby hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }
    public void aboutFriend(){
        System.out.println("I`m friend " + name + "," + " I am " + age + "," + " my hobby is " + hobby.toString());

    }
}
