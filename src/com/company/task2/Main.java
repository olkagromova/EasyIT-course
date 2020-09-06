package com.company.task2;

import com.company.task2.Human;

public class Main {

    public static void main(String[] args) {

       Hobby hobby = new Hobby("football",2,"The game where players kick the ball");
       Friend friend = new Friend("Max",33, hobby);
       System.out.println(friend);

       Girl girl1 = new Girl("Nastya",18,185,55, hobby, friend);
       girl1.say();
       girl1.getHobby().info();
       girl1.getFriend().aboutFriend();

        Boy boy1 = new Boy("Ivan",23,194,68, hobby, friend);
        boy1.say();
        boy1.getHobby().info();
        boy1.getFriend().aboutFriend();
        }
}

