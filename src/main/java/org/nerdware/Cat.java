package org.nerdware;

public class Cat {
    private final String name;
    private int age;

    Cat(){
        this.name = "Fluffy";
        this.age = 3;
    }
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String getName() { return name; }

    public int getAge() { return age; }


}
