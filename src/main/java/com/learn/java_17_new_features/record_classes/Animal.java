package com.learn.java_17_new_features.record_classes;

import java.util.Objects;

/**
 * This much of lines can be reduced by record class
 * This is the new feature introduced in java-17
 */
public class Animal {
    private int id;
    private String name;
    private String address;

    public Animal(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id && Objects.equals(name, animal.name) && Objects.equals(address, animal.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }
}
