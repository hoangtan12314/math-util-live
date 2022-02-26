package com.edu.mathutil;

public class MathUtil {
    public static long getFactorial(int n){
        long result = 1;
        if (n < 0 || n > 20){
            throw new IllegalArgumentException("Invalid argument");
        }

        if (n == 0 || n == 1){
            return 1;
        }

        for (int i = 1; i <= n; i++){
            result *= i;
        }

        return result;
    }
}
