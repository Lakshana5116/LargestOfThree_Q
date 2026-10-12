package com.lab;

public class LargestOfThree {

    public int findLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        LargestOfThree obj = new LargestOfThree();
        System.out.println("Largest = " + obj.findLargest(10, 25, 15));
    }
}
