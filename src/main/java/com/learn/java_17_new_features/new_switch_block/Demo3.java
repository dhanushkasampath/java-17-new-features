package com.learn.java_17_new_features.new_switch_block;

public class Demo3 {
    public static void main(String[] args) {

        // Also we can assign the return value to a variable
        String day = "Sunday";
        String result = "";
        switch (day){
            case "Saturday", "Sunday" ->  result = "6am";  // This is easy to read as well
            case "Monday" -> result = "8am";
            default -> result = "7am";
        }

        System.out.println(result);
    }
}