package com.company.task2;
public class Boy extends  Human{
    private Hobby hobby;
    private Friend friend;
    public Boy(String name, int age, double height, double weitht, Hobby hobby, Friend friend) {
        super(name, age, height, weitht);
        this.hobby=hobby;
        this.hobby=hobby;
        this.friend=friend;
    }
    @Override
    public void say() {
        super.say();
    }
    public  Hobby getHobby(){
        return hobby;
    }
    public Friend getFriend(){return friend;}
}