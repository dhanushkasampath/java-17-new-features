package com.learn.java_17_new_features.new_switch_block;

public class Demo2 {
    public static void main(String[] args) {

        // This is how java 17 has removed break statement in switch
        String day = "Sunday";
        switch (day){
            case "Saturday", "Sunday" ->  System.out.println("6am");  // This is easy to read as well
            case "Monday" -> System.out.println("8am");
            default -> System.out.println("7am");
        }
    }
}