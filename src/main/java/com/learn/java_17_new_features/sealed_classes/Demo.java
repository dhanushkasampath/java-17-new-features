package com.learn.java_17_new_features.sealed_classes;

// Lets say we want only class B and C to inherit class A.
// class D should not allow to inherit A
// Basically I want to get a CE at the movement when D tries to inherit A.
// Adding only "sealed" keyword is not enough. We should give permission to classes which could inherit A using "Permits" keyword

// Note: those inheriting classes must be of below 3 types.
//1. sealed
//2. non-sealed
//3. final

//Before permits, if needed class A can extends any other class or implements any interfaces also.
sealed class A permits B,C{

}

final class B extends A{

}

final class C extends A{

}

// if D try to extends A, it will give CE
// If want to can sealed the class B and permits class D. Then also we need to make D as sealed, non-sealed, final
class D{

}

//If B says, I can't be final. because I want everyone to extend me. in that case we can make B as non-sealed.
//If we do so and if class D extends B, D also get the methods in class A to override even though 'A' did not permit 'D' to inherit itself.


//This sealed features can be similarly used with interfaces. But its interfaces should be either 'sealed' or 'non-sealed'. Not final.
// Because interface never be final
public class Demo {
    public static void main(String[] args) {

    }
}
