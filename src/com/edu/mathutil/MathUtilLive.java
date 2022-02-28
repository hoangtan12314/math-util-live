package com.edu.mathutil;

public class MathUtilLive {
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);
        System.out.println("Expected: 5! = 120. Actual: " + result);
        System.out.println("Expected: 56! = 720. Actual: " + MathUtil.getFactorial(6));
        System.out.println("Expected: 0! = 1. Actual: " + MathUtil.getFactorial(0));

        System.out.println("Expected: 1! = 1. Actual: " + MathUtil.getFactorial(1));
        System.out.println("Expected: 3! = 1. Actual: " + MathUtil.getFactorial(3));
    }
}
