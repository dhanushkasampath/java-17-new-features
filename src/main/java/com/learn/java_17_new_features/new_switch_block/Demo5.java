package com.learn.java_17_new_features.new_switch_block;

public class Demo5 {
    public static void main(String[] args) {

        // If you still want to use the colon instead of arrow in each case, that is also possible. But it should be used with yield
        String day = "Wednesday";
        String result = "";
        result = switch (day){
            case "Saturday", "Sunday": yield "6am";  // This is easy to read as well
            case "Monday": yield "8am";
            default: yield  "7am";
        };

        System.out.println(result);
    }
}