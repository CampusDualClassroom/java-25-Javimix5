package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {

        Stack<String> stack = new Stack<>();
        stack.push("Smith");
        stack.push("Montessori");
        stack.push("Peralta");
        stack.push("House");
        return stack;
    }

    public static void printAndEmptyStack(Stack<String> stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {

        System.out.println("Creando pila");
        createStack();

        System.out.println("Imprimiendo pila y vaciando");
        printAndEmptyStack(createStack());

        System.out.println(" ");
        System.out.println("Comprobar que está vacía");
        createStack();
    }


}
