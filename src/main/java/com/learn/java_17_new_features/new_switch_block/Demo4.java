package com.learn.java_17_new_features.new_switch_block;

public class Demo4 {
    public static void main(String[] args) {

        // Instead of assigning a value at every case, we can return the final value by switch statement
        String day = "Wednesday";
        String result = "";
        result = switch (day){
            case "Saturday", "Sunday" ->  "6am";  // This is easy to read as well
            case "Monday" -> "8am";
            default -> "7am";
        };

        System.out.println(result);
    }
}