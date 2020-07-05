package com.bit.demo;

class Animal {
    protected String name;
    public void eat() {
        System.out.println(this.name + "Animal :: eat()");
    }

    public Animal(String name) {
        this.name = name;
        System.out.println("Animal(String)");
    }

    public void sleep() {
        System.out.println("Animal :: sleep()");
    }
}

class Cat extends Animal {
 /*   public String name;
    public void eat() {
        System.out.println("Cat :: eat()");
    }*/
       public Cat(String name) {
           super(name);//调用父类的构造方法,显示调用
           System.out.println("Cat(String)");
       }
}


final class ChinaCat extends Cat {
    public ChinaCat(String name) {
        super(name);
        System.out.println("ChinaCat(String)");
    }
}


class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }
    public void fly() {
        System.out.println(this.name + "Bird :: fly()");
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("mini");
        cat.eat();
    }
}
