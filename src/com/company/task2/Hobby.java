package com.company.task2;
/**
 * Created by User on 004 04.09.20.
 */
public class Hobby {
    private String name;
    private  int years;
    private  String description;

    public Hobby(String name, int years, String description) {
        this.name = name;
        this.years = years;
        this.description = description;
    }

    public String toString() {
        return "Name=" + name + ", Years=" + years + ", Description=" + description;
    }
    public void info(){
        System.out.println("Hobby: "+name+"\n"+" years: "+years+"\n"+" decription: "+ description);

    }
}
