package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        int a = 2;
        int b = 4;

        int result = c.add(a, b);

        System.out.println(result);
    }
}