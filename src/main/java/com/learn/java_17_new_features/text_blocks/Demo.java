package com.learn.java_17_new_features.text_blocks;

public class Demo {
    public static void main(String[] args) {
        String title = """
                    this is a text
                        block in java
                        
                            "introduced in java"  // we can use double quotes also inside this 3 quotes
                            
                            17
                """;
        System.out.println(title);
    }
}
