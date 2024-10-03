package com.learn.java_17_new_features.record_classes;

public class Project {
    public static void main(String[] args) {
        Alien a = new Alien(1, "Car", "Galle");
        Alien b = new Alien(1, "Car", "Galle");

        Animal animal1 = new Animal(1, "dog");
        Animal animal2 = new Animal(2, "cow");

        System.out.println(animal1);
        System.out.println(animal1.equals(animal2));

        System.out.println(a);
        System.out.println(a.equals(b)); // by default record classes compare the inner params when executing the equals() method. But
//        typical classes compare the memory address
    }
}
