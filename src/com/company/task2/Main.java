package com.company.task2;

import com.company.task2.Human;

public class Main {

    public static void main(String[] args) {
        Hobby hobby = new Hobby("football",2,"The game where players kick the ball");
       Girl girl1 = new Girl("Nastya",18,185,55, hobby);
       girl1.say();
        girl1.getHobby().info();
        }
}

