package com.learn.java_17_new_features.new_switch_block;

public class Demo1 {
    public static void main(String[] args) {

        String day = "Sunday";
        switch (day){
            case "Saturday", "Sunday":
                System.out.println("6am");
                break; // before java 17, if we do not use this break, execution will carry forward. But with 17 we no need want to put 'break'
            case "Monday":
                System.out.println("8am");
                break;
            default:
                System.out.println("7am");
        }
    }
}


//1. what if you want to use switch as an expression?
//2. What if you want to return something from switch statement?
//3. What if we can remove break from switch?

//is it possible?

//Yes with java 17 its possible.