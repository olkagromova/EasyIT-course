package com.company.task2;

public class Girl extends  Human{
    private Hobby hobby;
    public Girl(String name, int age, double height, double weitht, Hobby hobby) {
        super(name, age, height, weitht);
        this.hobby=hobby;
    }

    @Override
    public void say() {
        super.say();
    }

    public  Hobby getHobby(){
        return hobby;
    }
}
