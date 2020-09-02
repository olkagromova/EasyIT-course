package com.company.task2;

public class Human {
    private String name;
    private int age;
    private double height;
    private double weitht;

    public Human(String name,int age,double height,double weitht){
        this.name=name;
        this.age=age;
        this.height=height;
        this.weitht=weitht;
    }

    public void say() {
        System.out.println("Name: "+name+"\n"+" Age: "+age+"\n"+" Height: "+height+"\n"+" Weitht: "+weitht);
        System.out.println("hi");
    }

}


