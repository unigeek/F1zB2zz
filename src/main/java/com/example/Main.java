package com.example;

public class Main {
    public static void main (String[] args) {
        FbRenderer fbr = new FbRenderer();
        for (int i=1; i<=100; i++) {
            System.out.println(String.format("%d, %s", i, fbr.render(i)));
        }
    }
    
}