package com.learn.java_17_new_features.pattern_matching;

public class Demo {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.traditionalInstanceOf();
        d.patternMatchingInstanceOf();
    }

    private void patternMatchingInstanceOf() {
        System.out.println("---Pattern Matching instanceOf---");
        Object value = "Colombo";
        if(value instanceof String str){ // initialization, casting, assignment all happens here. So no need to do them manually
            System.out.println("Given Value is: " + str);

        }
    }

    private void traditionalInstanceOf() {
        System.out.println("---Traditional instanceOf---");
        Object value = "Colombo";
        if(value instanceof String){
            String str = (String) value;
            System.out.println("Given Value is: " + str);

        }
    }
}
