package com.vignesh;

public class RecursionParadigm {

    public static int sumOfNNaturalNumbers(int N) throws IllegalArgumentException {
        try {
            if(N<1) {
                throw new IllegalArgumentException("Invalid Input");
            }
            else if(N==1) return 1;
            return N+sumOfNNaturalNumbers(N-1);
        }
        catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public static int factorial(int N) {
        if(N<0) {
            throw new IllegalArgumentException("Invalid Input");
        }
        if(N==0) return 1;
        return N * factorial(N-1);
    }

    public static int fibonacci(int N) {
        if(N==0) return 0;
        else if(N==1) return 1;
        return fibonacci(N-1) + fibonacci(N-2);
    }
}